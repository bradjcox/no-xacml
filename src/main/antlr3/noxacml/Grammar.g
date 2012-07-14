grammar Grammar;

options
{
// backtrack=true;
// memoize = true;
//	k = 5;
	output=AST;
	language=Java;
	ASTLabelType=CommonTree;
}
tokens
{
	SUBJECT='subject';
	RESOURCE='resource';
	ACTION='action';
	ENVIRONMENT='environment';
	MATCHES='matches';
	ABS='abs';
	ACTION='action';
	ALLOF='allOf';
	ALLOFALL='allOfAll';
	ALLOFANY='allOfAny';
	ANYOF='anyOf';
	ANYOFALL='anyOfAll';
	ANYOFANY='anyOfAny' ;
	ANYURI= 'anyUri';
	ATLEASTONEMENBEROF='atLeastOneMemberOf';
	BAG='bag';
	BASE64BINARY= 'base64Binary';
	BOOLEAN= 'boolean';
	CONCATENATE='concatenate';
	CONDITION='condition';
	CONTAINS='contains';
	DATE= 'date';
	DATETIME= 'dateTime';
	DAYTIMEDURATION= 'dayTimeDuration';
	DECIMAL='decimal';
	DENY = 'deny';
	DEREF='deref';
	DOUBLE= 'double';
	ENVIRONMENT='environment';
	FALSE='false';
	FLR='flr';
	HEXBINARY= 'hexBinary';
	IF='if';
	INTEGER= 'integer';
	INTERSECTION='intersection';
	ISIN= 'isIn';
	LP='(';
	MAP='map';
	MATCHES='matches';
	NODECOUNT='nodeCount';
	NODEEQUAL='nodeEqual';
	NODEMATCH='nodeMatch';
	NOF='nof';
	NORMALIZESPACE='normalizeSpace' ;
	NORMALIZETOLOWERCASE='normalizeToLowerCase' ;
	NOT='not';
	ONEANDONLY='oneAndOnly';
	PERMIT='permit';
	POLICY='policy';
	POLICYSET='policyset';
	RANGEOP='rangeOp';
	REGEXMATCH='regexpMatch';
	RESOURCE='resource';
	RFC822NAME= 'rfc822Name';
	REQUIRED='required';
	RP=')';
	RND='rnd';
	RULE='rule';
	SETEQUALS='setEquals';
	SIZE='size';
	STRING= 'string';
	SUBJECT='subject';
	SUBSET='subset';
	TARGET='target';
	TIME= 'time';
	TRUE='true';
	UNION='union';
	URI='uri';
	X500NAME= 'x500Name';
	YEARMONTHDURATION= 'yearMonthDuration';
}

@header
{
	package noxacml;
	import noxacml.util.*;
	import noxacml.xacml2.*;
}
@lexer::header
{
	package noxacml;
}
@members
{
 final PolicyBuilder builder = new PolicyBuilder();
}

xacmlFile
	: (policy | policySet) EOF!
	;

policy
	: POLICY^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? rule? '}'!
	;

policySet
	: POLICYSET^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? policy* '}'!
	;

target
	: TARGET^ '{'! matchOrExpr '}'!
	;

matchOrExpr
  : matchAndExpr ('||'^ matchAndExpr )*
  ;

matchAndExpr
  : matchExpr ('&&'^ matchExpr)*
  ;

matchExpr
	: attributeSelector '.'! MATCHES^ '('! stringExpr ')'!
	| '('! matchOrExpr ')'!
	;

attributeSelector
	: ( SUBJECT	| RESOURCE | ACTION | ENVIRONMENT)^ ('.'! LOWERCASEIDENTIFIER)+
	;

rule
	: RULE^ ANYCASEIDENTIFIER (PERMIT | DENY) '{'! target? condition? '}'!
	;

condition
	: CONDITION^ '{'! booleanAndExpr '}'!
	;

booleanAndExpr
  : ('&&') => (l=booleanOrExpr ('&&' r+=booleanOrExpr)+)
  	-> ^('&&' BOOLEAN $l $r)
  | l=booleanOrExpr
  	-> ^('&&' BOOLEAN $l)
  ;

booleanOrExpr
  : ('||') => (l=booleanExpr ('||' r+=booleanExpr )+)
  	-> ^('||' BOOLEAN $l $r)
  | l=booleanExpr
  	-> ^('||' BOOLEAN $l)
  ;

booleanExpr
	: TRUE
	| FALSE
	| booleanCreate
	| booleanNof
	| booleanWrap
	| booleanNode
	| equalityExpr
	| isInOp
	| containsOp
//	| bagOp
//	| regexOp
	;
booleanCreate
	: BOOLEAN^ LP! attributeSelector RP!
	;
booleanNof
	: ( NOF | NOT)^ LP! booleanExpr RP!
	;
booleanWrap
	: LP! booleanOrExpr RP!
	;
booleanNode
	: stringExpr '.'! ( NODEEQUAL | NODEMATCH )^ LP! stringExpr RP!
	;
booleanBag
	: BOOLEAN^ STRING_CONSTANT_LIST
//	| BAG LP! booleanExpr ( ','! booleanExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! booleanBag','! booleanBag	RP!
	;

isInOp
	: doubleExpr '.' ISIN LP doubleBag RP
		-> ^(ISIN DOUBLE doubleExpr doubleBag)
	| stringExpr '.' ISIN LP stringBag RP
		-> ^(ISIN INTEGER stringExpr stringBag)
	| anyUriExpr '.' ISIN LP anyUriBag RP
		-> ^(ISIN ANYURI anyUriExpr anyUriBag)
	| dateExpr '.' ISIN LP dateBag RP
		 -> ^(ISIN DATE dateExpr dateBag)
	| timeExpr '.' ISIN LP timeBag RP
		-> ^(ISIN TIME timeExpr timeBag)
	| dateTimeExpr '.' ISIN LP dateTimeBag RP
		-> ^(ISIN DATETIME dateTimeExpr dateTimeBag)
	| base64BinaryExpr '.' ISIN LP base64BinaryBag RP
		-> ^(ISIN BASE64BINARY base64BinaryExpr base64BinaryBag)
	| dayTimeDurationExpr '.' ISIN LP dayTimeDurationBag RP
		-> ^(ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag)
	| yearMonthDurationExpr '.' ISIN LP yearMonthDurationBag RP
		-> ^(ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag)
	| x500NameExpr '.' ISIN LP x500NameBag RP
		-> ^(ISIN X500NAME x500NameExpr x500NameBag)
	| rfc822NameExpr '.' ISIN LP rfc822NameBag RP
		-> ^(ISIN RFC822NAME rfc822NameExpr rfc822NameBag)
	| hexBinaryExpr '.' ISIN LP hexBinaryBag RP
		-> ^(ISIN HEXBINARY hexBinaryExpr hexBinaryBag)
	| (base64BinaryExpr) => base64BinaryExpr '.' ISIN LP base64BinaryBag RP
		-> ^(ISIN BASE64BINARY base64BinaryExpr base64BinaryBag)
	;

containsOp
	: doubleBag '.' CONTAINS LP doubleExpr RP
		-> ^(CONTAINS DOUBLE doubleBag doubleExpr )
	| stringBag '.' CONTAINS LP stringExpr RP
		-> ^(CONTAINS STRING stringBag stringExpr )
	| anyUriBag '.' CONTAINS LP anyUriExpr RP
		-> ^(CONTAINS STRING anyUriBag anyUriExpr)
	| dateBag '.' CONTAINS LP dateBag RP
		-> ^(CONTAINS STRING dateBag dateBag)
	| timeBag '.' CONTAINS LP timeExpr RP
		-> ^(CONTAINS STRING timeBag timeExpr)
	| dateTimeBag '.' CONTAINS LP dateTimeExpr RP
		-> ^(CONTAINS STRING dateTimeBag dateTimeExpr)
	| base64BinaryBag '.' CONTAINS LP base64BinaryExpr RP
		-> ^(CONTAINS STRING base64BinaryBag base64BinaryExpr)
	| dayTimeDurationBag '.' CONTAINS LP dayTimeDurationExpr RP
		-> ^(CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr)
	| yearMonthDurationBag '.' CONTAINS LP yearMonthDurationExpr RP
		-> ^(CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr)
	| x500NameBag '.' CONTAINS LP x500NameExpr RP
		-> ^(CONTAINS STRING x500NameBag x500NameExpr)
	| rfc822NameBag '.' CONTAINS LP rfc822NameExpr RP
		-> ^(CONTAINS STRING rfc822NameBag rfc822NameExpr)
	| hexBinaryBag '.' CONTAINS LP hexBinaryExpr RP
		-> ^(CONTAINS STRING hexBinaryBag hexBinaryExpr)
	| (base64BinaryExpr) => base64BinaryBag '.' CONTAINS LP base64BinaryExpr RP
		-> ^(CONTAINS STRING base64BinaryBag base64BinaryExpr)
	;

equalityExpr
	: l1=integerExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r1=integerExpr
		-> ^($o INTEGER $l1 $r1)
	| l2=doubleExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r2=doubleExpr
		-> ^($o DOUBLE $l2 $r2)
	| l3=stringExpr ( o='==' | '>=' | '>' | '<' | '<=' ) r3=stringExpr
		-> ^($o STRING $l3 $r3)
	| l4=anyUriExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r4=anyUriExpr
		-> ^($o ANYURI $l4 $r4)
	| l5=dateExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r5=dateExpr
		-> ^($o DATE $l5 $r5)
	| l6=timeExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r6=timeExpr
		-> ^($o TIME $l6 $r6)
	| l7=dateTimeExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r7=dateTimeExpr
		-> ^($o DATETIME $l7 $r7)
	| l8=yearMonthDurationExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r8=yearMonthDurationExpr
		-> ^($o YEARMONTHDURATION $l8 $r8)
	| l9=x500NameExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) r9=x500NameExpr
		-> ^($o X500NAME $l9 $r9)
	| lA=rfc822NameExpr ( o='=='	| o='>=' | o='>' | o='<' | o='<=' ) rA=rfc822NameExpr
		-> ^($o RFC822NAME $lA $rA)
	| lB=dayTimeDurationExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) rB=dayTimeDurationExpr
		-> ^($o DAYTIMEDURATION $lB $rB)
	| lC=base64BinaryExpr ( o='==' | o='>=' | o='>' | o='<' | o='<=' ) rC=base64BinaryExpr
		-> ^($o BASE64BINARY $lC $rC)
 ;

regexOp
	: l=integerExpr '.' REGEXMATCH LP r=integerExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| doubleExpr '.' REGEXMATCH LP doubleExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| stringExpr '.' REGEXMATCH LP stringExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| anyUriExpr '.' REGEXMATCH LP anyUriExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dateExpr '.' REGEXMATCH LP dateExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| timeExpr '.' REGEXMATCH LP timeExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dateTimeExpr '.' REGEXMATCH LP dateTimeExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dayTimeDurationExpr '.' REGEXMATCH LP dayTimeDurationExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| yearMonthDurationExpr '.' REGEXMATCH LP yearMonthDurationExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| x500NameExpr '.' REGEXMATCH LP x500NameExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| rfc822NameExpr '.' REGEXMATCH LP rfc822NameExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| base64BinaryExpr '.' REGEXMATCH LP base64BinaryExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	;

bagOp
	: (booleanBag) => l1=booleanBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r1=booleanBag RP
	    -> ^($o BOOLEAN $l1 $r1)
	| (integerBag) => l2=integerBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r2=integerBag RP
	    -> ^($o INTEGER $l2 $r2)
	| (doubleBag) => l3=doubleBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r3=doubleBag RP
	    -> ^($o DOUBLE $l3 $r3)
	| (stringBag ) => l4=stringBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r4=stringBag RP
	    -> ^($o STRING $l4 $r4)
	| (dateBag ) => l5=dateBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r5=dateBag RP
	    -> ^($o DATE $l5 $r5)
	| (timeBag ) => l6=timeBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r6=timeBag RP
	    -> ^($o TIME $l6 $r6)
	| (dateTimeBag ) => l7=dateTimeBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r7=dateTimeBag RP
	    -> ^($o DATETIME $l7 $r7)
	| (base64BinaryBag ) => l8=base64BinaryBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r8=base64BinaryBag RP
	    -> ^($o BASE64BINARY $l8 $r8)
	| (dayTimeDurationBag ) => l9=dayTimeDurationBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r9=dayTimeDurationBag RP
	    -> ^($o DAYTIMEDURATION $l9 $r9)
	| (yearMonthDurationBag ) => lA=yearMonthDurationBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rA=yearMonthDurationBag RP
	    -> ^($o YEARMONTHDURATION $lA $rA)
	| (anyUriBag ) => lB=anyUriBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rB=anyUriBag RP
	    -> ^($o ANYURI $lB $rB)
	| (x500NameBag ) => lC=x500NameBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rC=x500NameBag RP
	    -> ^($o X500NAME $lC $rC)
	| (rfc822NameBag ) => lD=rfc822NameBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rD=rfc822NameBag RP
	    -> ^($o RFC822NAME $lD $rD)
	| (hexBinaryBag ) => lE=hexBinaryBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rE=hexBinaryBag RP
	    -> ^($o HEXBINARY $lE $rE)
	| (base64BinaryBag) => lF=base64BinaryBag '.' ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rF=base64BinaryBag RP
	    -> ^($o BASE64BINARY $lF $rF)
	;


integerExpr
	: INTEGER_CONSTANT
	| stringExpr '.'! ( INTEGER | NODECOUNT )^ LP! RP!
	| anyBag '.'! SIZE LP! RP!
//	| integerExpr '.'! ABS LP! RP!
// 	| LP! integerExpr ( '+' | '-' | '*' | '/' | '%' ) integerExpr RP!
//	| ABS LP! integerExpr RP!
	;
integerBag
	: (INTEGER^ STRING_CONSTANT_LIST | BAG^ LP! integerExpr ( ','! integerExpr)+ RP!) ('.'! ( INTERSECTION | UNION )^ LP! integerBag	RP!)*
	;

doubleExpr
	: DOUBLE_CONSTANT^
	| DOUBLE^ LP! stringExpr RP!
//	| LP! doubleExpr ( '+' | '-' | '*' | '/' | '%' ) doubleExpr RP!
//	| ( ABS | RND | FLR ) LP! doubleExpr	RP!
	;
doubleBag
	: DOUBLE^ STRING_CONSTANT_LIST
//	| BAG LP! doubleExpr ( ','! doubleExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dayTimeDurationBag ','! dayTimeDurationBag	RP!
	;

stringExpr
	: (STRING_CONSTANT^
		| stringBag '.'! ONEANDONLY^ LP! RP!)
		('.'! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE)^ LP! RP!)*
	;
//	| CONCATENATE LP! stringExpr ','! stringExpr RP!
stringBag
	: STRING^ STRING_CONSTANT_LIST
	| attributeSelector^
//	| (stringBag) => ( INTERSECTION | UNION ) LP! stringBag ','! stringBag	RP!
	;


anyUriExpr
	: ANYURI^ LP! stringExpr RP!
	| anyUriBag '.'! ONEANDONLY^ LP! RP!
	| stringExpr '.'! URI^ LP! RP!
//	| ((anyUriExpr) => anyUriExpr '.'! ( NORMALIZESPACE | NORMALIZETOLOWERCASE) LP! RP!)
//	| CONCATENATE LP! anyUriExpr ','! anyUriExpr RP!
	;

anyUriBag
	: ANYURI^ STRING_CONSTANT_LIST
//	| (anyUriBag) => ( INTERSECTION | UNION ) LP! anyUriBag ','! anyUriBag	RP!
	;

dateExpr
	: DATE^ LP! stringExpr RP!
	| dateBag '.'! ONEANDONLY^ LP! RP!
	;
dateBag
	: DATE^ STRING_CONSTANT_LIST
//	| (BAG)=> BAG LP! dateExpr ( ','! dateExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dateBag	','! dateBag	RP!
	;

timeExpr
	: TIME^ LP! stringExpr RP!
	| timeBag '.'! ONEANDONLY^ LP! RP!
	;
timeBag
	: TIME^ STRING_CONSTANT_LIST
//	| BAG^ LP! timeExpr ( ','! timeExpr )+ RP!
//	| ( INTERSECTION | UNION )^ LP! timeBag ','! timeBag	RP!
	;

dateTimeExpr
	: DATETIME^ LP! stringExpr RP!
	| dateTimeBag '.'! ONEANDONLY^ LP! RP!
	;
dateTimeBag
	: DATETIME^ STRING_CONSTANT_LIST
//	| BAG^ LP! dateTimeExpr ( ','! dateTimeExpr)+ RP!
//	| ( INTERSECTION | UNION )^ LP! dateTimeBag ','! dateTimeBag	RP!
	;

base64BinaryExpr
	: BASE64BINARY^ LP! stringExpr RP!
	| base64BinaryBag '.'! ONEANDONLY^ LP! RP!
	;
base64BinaryBag
	: BASE64BINARY^ STRING_CONSTANT_LIST
//	| BAG LP! base64BinaryExpr ( ','! base64BinaryExpr )+ RP!
//	| INTERSECTION LP! base64BinaryBag ','! base64BinaryBag RP!
//	| UNION LP! base64BinaryBag ','! base64BinaryBag RP!
	;

dayTimeDurationExpr
	: DAYTIMEDURATION^ LP! stringExpr RP!
	| dayTimeDurationBag '.'! ONEANDONLY^ LP! RP!
	;
dayTimeDurationBag
	: DAYTIMEDURATION^ STRING_CONSTANT_LIST
//	| BAG LP! dayTimeDurationExpr ( ','! dayTimeDurationExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dayTimeDurationBag ','! dayTimeDurationBag	RP!
	;

yearMonthDurationExpr
	: YEARMONTHDURATION^ LP! stringExpr RP!
	| yearMonthDurationBag '.'! ONEANDONLY^ LP! RP!
	;
yearMonthDurationBag
	: YEARMONTHDURATION^ STRING_CONSTANT_LIST
//	| BAG LP! yearMonthDurationExpr ( ','! yearMonthDurationExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! yearMonthDurationBag	 ','! yearMonthDurationBag		RP!
	;

x500NameExpr
	: X500NAME^ LP! stringExpr RP!
	| x500NameBag '.'! ONEANDONLY^ LP! RP!
//	| ((x500NameExpr) => x500NameExpr '.'! MATCH LP! x500NameExpr RP!)
	;
x500NameBag
	: X500NAME^ STRING_CONSTANT_LIST
//	| BAG LP! x500NameExpr ( ','! x500NameExpr )+ RP!
//	| ( INTERSECTION | UNION ) LP! x500NameBag ','! x500NameBag	RP!
	;

rfc822NameExpr
	: RFC822NAME^ LP! stringExpr RP!
	| rfc822NameBag '.'! ONEANDONLY^ LP! RP!
//	| ((rfc822NameExpr) => rfc822NameExpr '.'! MATCH LP! rfc822NameExpr RP!)
	;
rfc822NameBag
	: RFC822NAME^ STRING_CONSTANT_LIST
//	| BAG LP! rfc822NameExpr ( ','! rfc822NameExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! rfc822NameBag ','! rfc822NameBag	RP!
	;

hexBinaryExpr
	: HEXBINARY^ LP! stringExpr RP!
	| hexBinaryBag '.'! ONEANDONLY^ LP! RP!
	;
hexBinaryBag
	: HEXBINARY^ STRING_CONSTANT_LIST
//	| BAG LP! hexBinaryExpr (','! hexBinaryExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! hexBinaryBag ','! hexBinaryBag	RP!
	;

anyBag
	: booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag
	| timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag
	| yearMonthDurationBag | x500NameBag
	| rfc822NameBag | hexBinaryBag
	;

COMMENT
	: '//' ~('\n'|'\r')* '\r'? '\n' { $channel=HIDDEN; }
	| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN; }
	;

WHITESPACE
	: (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	| COMMENT
	;

STRING_CONSTANT
//	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	:	'"' ( options {greedy=false;} : . )* '"'
	;

INTEGER_CONSTANT
	: ('0'..'9')+
//	: ('+'|'-')? ('0'..'9')+
	;

DOUBLE_CONSTANT
	: INTEGER_CONSTANT? ('.'! ('0'..'9')*)? EXPONENT
//	| INTEGER_CONSTANT EXPONENT
	;
LOWERCASEIDENTIFIER
	: ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

ANYCASEIDENTIFIER
	: ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
	;

STRING_CONSTANT_LIST
	: LP! STRING_CONSTANT ( ','! STRING_CONSTANT )* RP!
	;

fragment EXPONENT
	: ('e'|'E') ('+'|'-')? ('0'..'9')+
	;

fragment HEX_DIGIT
	: ('0'..'9'|'a'..'f'|'A'..'F')
	;

fragment ESC_SEQ
		:	 '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
		|	 UNICODE_ESC
		|	 OCTAL_ESC
		;

fragment OCTAL_ESC
		:	 '\\' ('0'..'3') ('0'..'7') ('0'..'7')
		|	 '\\' ('0'..'7') ('0'..'7')
		|	 '\\' ('0'..'7')
		;

fragment UNICODE_ESC
		:	 '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
		;


/*
 HiOrdBagFunction
	: ANYOF LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| ALLOF LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| ANYOFANY LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| ANYOFALL LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| ALLOFANY LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| ALLOFALL LP! boolFunctionExpr ','! anyExpr ','! anyBag RP!
	| MAP LP! typeFunctionExpr ','! anyBag RP!
	;

boolFunctionExpr
	: 'boolFunctionExpr()'
	;

typeFunctionExpr
	: 'typeFunctionExpr()'
	;
*/
