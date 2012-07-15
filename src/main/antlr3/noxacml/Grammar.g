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
	AND='&&';
	OR='||';
	EQ='==';
	LE='<=';
	GE='>=';
	LT='<';
	GT='>';
	LP='(';
	RP=')';
	LB='{';
	RB='}';
	DOT='.';
	COMMA=',';
	DQUOT='"';
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
	: POLICY^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB! target? rule? RB!
	;

policySet
	: POLICYSET^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER LB! target? policy* RB!
	;

target
	: TARGET^ LB! matchOrExpr RB!
	;

matchOrExpr
  : matchAndExpr (OR^ matchAndExpr )*
  ;

matchAndExpr
  : matchExpr (AND^ matchExpr)*
  ;

matchExpr
	: attributeSelector DOT! MATCHES^ LP! stringExpr RP!
	| LP! matchOrExpr RP!
	;

attributeSelector
	: ( SUBJECT	| RESOURCE | ACTION | ENVIRONMENT)^ DOT! LOWERCASEIDENTIFIER
	;

rule
	: RULE^ ANYCASEIDENTIFIER (PERMIT | DENY) LB! target? condition? RB!
	;

condition
	: CONDITION LB booleanAndExpr RB
		-> ^(CONDITION BOOLEAN booleanAndExpr)
	;

booleanAndExpr
  : (AND) => (l=booleanOrExpr (AND r+=booleanOrExpr)+)
  	-> ^(AND BOOLEAN $l $r)
  | l=booleanOrExpr
  	-> ^(AND BOOLEAN $l)
  ;

booleanOrExpr
  : (OR) => (l=booleanExpr (OR r+=booleanExpr )+)
  	-> ^(OR BOOLEAN $l $r)
  | l=booleanExpr
  	-> ^(OR BOOLEAN $l)
  ;

booleanExpr
	: TRUE
	| FALSE
	| equalityExpr
	| isInExpr
	| booleanNof
	| booleanWrap
	| booleanNode
//	| booleanCreate
//	| containsOp
//	| bagOp
//	| regexOp
	;
booleanNof
	: (NOF | NOT) => ( NOF | NOT)^ LP! booleanExpr RP!
	;
booleanWrap
	: LP! booleanOrExpr RP!
	;
booleanNode
	: ( NODEEQUAL | NODEMATCH ) => stringExpr DOT! ( NODEEQUAL | NODEMATCH )^ LP! stringExpr RP!
	;
booleanBag
	: BOOLEAN^ STRING_CONSTANT_LIST
	| attributeSelector^ DOT BOOLEAN LP RP
//	| BAG LP! booleanExpr ( COMMA! booleanExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! booleanBag','! booleanBag	RP!
	;

isInExpr
	: (ISIN) => doubleExpr DOT ISIN LP doubleBag RP
		-> ^(ISIN DOUBLE doubleExpr doubleBag)
	| (ISIN) => stringExpr DOT ISIN LP stringBag RP
		-> ^(ISIN STRING stringExpr stringBag)
	| (ISIN) => integerExpr DOT ISIN LP integerBag RP
		-> ^(ISIN INTEGER stringExpr stringBag)
	| (ISIN) => anyUriExpr DOT ISIN LP anyUriBag RP
		-> ^(ISIN ANYURI anyUriExpr anyUriBag)
	| (ISIN) => dateExpr DOT ISIN LP dateBag RP
		 -> ^(ISIN DATE dateExpr dateBag)
	| (ISIN) => timeExpr DOT ISIN LP timeBag RP
		-> ^(ISIN TIME timeExpr timeBag)
	| (ISIN) => dateTimeExpr DOT ISIN LP dateTimeBag RP
		-> ^(ISIN DATETIME dateTimeExpr dateTimeBag)
	| (ISIN) => base64BinaryExpr DOT ISIN LP base64BinaryBag RP
		-> ^(ISIN BASE64BINARY base64BinaryExpr base64BinaryBag)
	| (ISIN) => dayTimeDurationExpr DOT ISIN LP dayTimeDurationBag RP
		-> ^(ISIN DAYTIMEDURATION dayTimeDurationExpr dayTimeDurationBag)
	| (ISIN) => yearMonthDurationExpr DOT ISIN LP yearMonthDurationBag RP
		-> ^(ISIN YEARMONTHDURATION yearMonthDurationExpr yearMonthDurationBag)
	| (ISIN) => x500NameExpr DOT ISIN LP x500NameBag RP
		-> ^(ISIN X500NAME x500NameExpr x500NameBag)
	| (ISIN) => rfc822NameExpr DOT ISIN LP rfc822NameBag RP
		-> ^(ISIN RFC822NAME rfc822NameExpr rfc822NameBag)
	| (ISIN) => hexBinaryExpr DOT ISIN LP hexBinaryBag RP
		-> ^(ISIN HEXBINARY hexBinaryExpr hexBinaryBag)
	| (ISIN) => base64BinaryExpr DOT ISIN LP base64BinaryBag RP
		-> ^(ISIN BASE64BINARY base64BinaryExpr base64BinaryBag)
	;

equalityExpr
	: ( EQ | GE | GT | LT | LE ) => l1=integerExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r1=integerExpr
		-> ^($o INTEGER $l1 $r1)
	| ( EQ | GE | GT | LT | LE ) => l2=doubleExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r2=doubleExpr
		-> ^($o DOUBLE $l2 $r2)
	| ( EQ | GE | GT | LT | LE ) => l3=stringExpr ( o=EQ | GE | GT | LT | LE ) r3=stringExpr
		-> ^($o STRING $l3 $r3)
	| ( EQ | GE | GT | LT | LE ) => l4=anyUriExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r4=anyUriExpr
		-> ^($o ANYURI $l4 $r4)
	| ( EQ | GE | GT | LT | LE ) => l5=dateExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r5=dateExpr
		-> ^($o DATE $l5 $r5)
	| ( EQ | GE | GT | LT | LE ) => l6=timeExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r6=timeExpr
		-> ^($o TIME $l6 $r6)
	| ( EQ | GE | GT | LT | LE ) => l7=dateTimeExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r7=dateTimeExpr
		-> ^($o DATETIME $l7 $r7)
	| ( EQ | GE | GT | LT | LE ) => l8=yearMonthDurationExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r8=yearMonthDurationExpr
		-> ^($o YEARMONTHDURATION $l8 $r8)
	| ( EQ | GE | GT | LT | LE ) => l9=x500NameExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) r9=x500NameExpr
		-> ^($o X500NAME $l9 $r9)
	| ( EQ | GE | GT | LT | LE ) => lA=rfc822NameExpr ( o=EQ	| o=GE | o=GT | o=LT | o=LE ) rA=rfc822NameExpr
		-> ^($o RFC822NAME $lA $rA)
	| ( EQ | GE | GT | LT | LE ) => lB=dayTimeDurationExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) rB=dayTimeDurationExpr
		-> ^($o DAYTIMEDURATION $lB $rB)
	| ( EQ | GE | GT | LT | LE ) => lC=base64BinaryExpr ( o=EQ | o=GE | o=GT | o=LT | o=LE ) rC=base64BinaryExpr
		-> ^($o BASE64BINARY $lC $rC)
 ;

regexOp
	: l=integerExpr DOT REGEXMATCH LP r=integerExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| doubleExpr DOT REGEXMATCH LP doubleExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| stringExpr DOT REGEXMATCH LP stringExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| anyUriExpr DOT REGEXMATCH LP anyUriExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dateExpr DOT REGEXMATCH LP dateExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| timeExpr DOT REGEXMATCH LP timeExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dateTimeExpr DOT REGEXMATCH LP dateTimeExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| dayTimeDurationExpr DOT REGEXMATCH LP dayTimeDurationExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| yearMonthDurationExpr DOT REGEXMATCH LP yearMonthDurationExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| x500NameExpr DOT REGEXMATCH LP x500NameExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| rfc822NameExpr DOT REGEXMATCH LP rfc822NameExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	| base64BinaryExpr DOT REGEXMATCH LP base64BinaryExpr RP
        -> ^(REGEXMATCH INTEGER $l $r)
	;

bagOp
	: (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l1=booleanBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r1=booleanBag RP
	    -> ^($o BOOLEAN $l1 $r1)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l2=integerBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r2=integerBag RP
	    -> ^($o INTEGER $l2 $r2)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l3=doubleBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r3=doubleBag RP
	    -> ^($o DOUBLE $l3 $r3)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l4=stringBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r4=stringBag RP
	    -> ^($o STRING $l4 $r4)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l5=dateBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r5=dateBag RP
	    -> ^($o DATE $l5 $r5)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l6=timeBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r6=timeBag RP
	    -> ^($o TIME $l6 $r6)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l7=dateTimeBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r7=dateTimeBag RP
	    -> ^($o DATETIME $l7 $r7)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l8=base64BinaryBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r8=base64BinaryBag RP
	    -> ^($o BASE64BINARY $l8 $r8)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => l9=dayTimeDurationBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP r9=dayTimeDurationBag RP
	    -> ^($o DAYTIMEDURATION $l9 $r9)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lA=yearMonthDurationBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rA=yearMonthDurationBag RP
	    -> ^($o YEARMONTHDURATION $lA $rA)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lB=anyUriBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rB=anyUriBag RP
	    -> ^($o ANYURI $lB $rB)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lC=x500NameBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rC=x500NameBag RP
	    -> ^($o X500NAME $lC $rC)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lD=rfc822NameBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rD=rfc822NameBag RP
	    -> ^($o RFC822NAME $lD $rD)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lE=hexBinaryBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rE=hexBinaryBag RP
	    -> ^($o HEXBINARY $lE $rE)
	| (ATLEASTONEMENBEROF | SUBSET | SETEQUALS) => lF=base64BinaryBag DOT ( o=ATLEASTONEMENBEROF | o=SUBSET | o=SETEQUALS ) LP rF=base64BinaryBag RP
	    -> ^($o BASE64BINARY $lF $rF)
	;

integerExpr
	: (INTEGER_CONSTANT) => INTEGER_CONSTANT
	| (ONEANDONLY) => (integerBag DOT ONEANDONLY LP RP)
//	| anyBag DOT! SIZE LP! RP!
//	| stringExpr DOT! ( NODECOUNT )^ LP! RP!
//	| integerExpr DOT! ABS LP! RP!
// 	| LP! integerExpr ( '+' | '-' | '*' | '/' | '%' ) integerExpr RP!
//	| ABS LP! integerExpr RP!
	;
integerBag
	: (INTEGER^ LP! (STRING_LIST | attributeSelector) RP!
		| BAG^ LP! integerExpr ( COMMA! integerExpr)+ RP!)
		(DOT! ( INTERSECTION | UNION )^ LP! integerBag	RP!)*
	;

doubleExpr
	: (DOUBLE_CONSTANT) => DOUBLE_CONSTANT
//	| (DOUBLE) => DOUBLE^ LP! stringExpr RP!
//	| LP! doubleExpr ( '+' | '-' | '*' | '/' | '%' ) doubleExpr RP!
//	| ( ABS | RND | FLR ) LP! doubleExpr	RP!
	;
doubleBag
	: DOUBLE^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! doubleExpr ( COMMA! doubleExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dayTimeDurationBag COMMA! dayTimeDurationBag	RP!
	;

stringExpr
	: (STRING_CONSTANT) => STRING_CONSTANT^
	| (ONEANDONLY) => stringBag DOT! ONEANDONLY^ LP! RP!
//		(DOT! ( REQUIRED | NORMALIZESPACE | NORMALIZETOLOWERCASE)^ LP! RP!)*
	;
//	| CONCATENATE LP! stringExpr COMMA! stringExpr RP!
stringBag
	: STRING^ LP! (STRING_LIST | attributeSelector) RP!
//	| (stringBag) => ( INTERSECTION | UNION ) LP! stringBag COMMA! stringBag	RP!
	;


anyUriExpr
	: (ANYURI) => ANYURI^ LP! stringExpr RP!
	| (ONEANDONLY) => anyUriBag DOT! ONEANDONLY^ LP! RP!
//	| stringExpr DOT! URI^ LP! RP!
//	| ((anyUriExpr) => anyUriExpr DOT! ( NORMALIZESPACE | NORMALIZETOLOWERCASE) LP! RP!)
//	| CONCATENATE LP! anyUriExpr COMMA! anyUriExpr RP!
	;

anyUriBag
	: ANYURI^ LP! (STRING_LIST | attributeSelector) RP!
//	| (anyUriBag) => ( INTERSECTION | UNION ) LP! anyUriBag COMMA! anyUriBag	RP!
	;

dateExpr
	: DATE^ LP! stringExpr RP!
	| dateBag DOT! ONEANDONLY^ LP! RP!
	;
dateBag
	: DATE^ LP! (STRING_LIST | attributeSelector) RP!
//	| (BAG)=> BAG LP! dateExpr ( COMMA! dateExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dateBag	COMMA! dateBag	RP!
	;

timeExpr
	: TIME^ LP! stringExpr RP!
	| timeBag DOT! ONEANDONLY^ LP! RP!
	;
timeBag
	: TIME^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG^ LP! timeExpr ( COMMA! timeExpr )+ RP!
//	| ( INTERSECTION | UNION )^ LP! timeBag COMMA! timeBag	RP!
	;

dateTimeExpr
	: (DATETIME) => DATETIME^ LP! stringExpr RP!
	| (ONEANDONLY) => dateTimeBag DOT! ONEANDONLY^ LP! RP!
	;
dateTimeBag
	: DATETIME^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG^ LP! dateTimeExpr ( COMMA! dateTimeExpr)+ RP!
//	| ( INTERSECTION | UNION )^ LP! dateTimeBag COMMA! dateTimeBag	RP!
	;

base64BinaryExpr
	: (BASE64BINARY) => BASE64BINARY^ LP! stringExpr RP!
	| (ONEANDONLY) => base64BinaryBag DOT! ONEANDONLY^ LP! RP!
	;
base64BinaryBag
	: BASE64BINARY^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! base64BinaryExpr ( COMMA! base64BinaryExpr )+ RP!
//	| INTERSECTION LP! base64BinaryBag COMMA! base64BinaryBag RP!
//	| UNION LP! base64BinaryBag COMMA! base64BinaryBag RP!
	;

dayTimeDurationExpr
	: DAYTIMEDURATION^ LP! stringExpr RP!
	| dayTimeDurationBag DOT! ONEANDONLY^ LP! RP!
	;
dayTimeDurationBag
	: DAYTIMEDURATION^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! dayTimeDurationExpr ( COMMA! dayTimeDurationExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! dayTimeDurationBag COMMA! dayTimeDurationBag	RP!
	;

yearMonthDurationExpr
	: YEARMONTHDURATION^ LP! stringExpr RP!
	| yearMonthDurationBag DOT! ONEANDONLY^ LP! RP!
	;
yearMonthDurationBag
	: YEARMONTHDURATION^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! yearMonthDurationExpr ( COMMA! yearMonthDurationExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! yearMonthDurationBag	 COMMA! yearMonthDurationBag		RP!
	;

x500NameExpr
	: X500NAME^ LP! stringExpr RP!
	| x500NameBag DOT! ONEANDONLY^ LP! RP!
//	| ((x500NameExpr) => x500NameExpr DOT! MATCH LP! x500NameExpr RP!)
	;
x500NameBag
	: X500NAME^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! x500NameExpr ( COMMA! x500NameExpr )+ RP!
//	| ( INTERSECTION | UNION ) LP! x500NameBag COMMA! x500NameBag	RP!
	;

rfc822NameExpr
	: (RFC822NAME) => RFC822NAME^ LP! stringExpr RP!
	| (ONEANDONLY) => rfc822NameBag DOT! ONEANDONLY^ LP! RP!
//	| ((rfc822NameExpr) => rfc822NameExpr DOT! MATCH LP! rfc822NameExpr RP!)
	;
rfc822NameBag
	: RFC822NAME^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! rfc822NameExpr ( COMMA! rfc822NameExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! rfc822NameBag COMMA! rfc822NameBag	RP!
	;

hexBinaryExpr
	: HEXBINARY^ LP! stringExpr RP!
	| hexBinaryBag DOT! ONEANDONLY^ LP! RP!
	;
hexBinaryBag
	: HEXBINARY^ LP! (STRING_LIST | attributeSelector) RP!
//	| BAG LP! hexBinaryExpr (COMMA! hexBinaryExpr)+ RP!
//	| ( INTERSECTION | UNION ) LP! hexBinaryBag COMMA! hexBinaryBag	RP!
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
//	:	DQUOT ( ESC_SEQ | ~('\\'|DQUOT) )* DQUOT
	:	DQUOT ( options {greedy=false;} : (~DQUOT)*) DQUOT
	;

STRING_LIST
	: STRING_CONSTANT ( COMMA! STRING_CONSTANT )*
	;

STRING_CONSTANT_LIST
	: LP! STRING_LIST RP!
	;

INTEGER_CONSTANT
	: ('0'..'9')+
//	: ('+'|'-')? ('0'..'9')+
	;

DOUBLE_CONSTANT
	: INTEGER_CONSTANT? (DOT! ('0'..'9')*)? EXPONENT
//	| INTEGER_CONSTANT EXPONENT
	;
LOWERCASEIDENTIFIER
	: ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

ANYCASEIDENTIFIER
	: ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
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
	: ANYOF LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| ALLOF LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| ANYOFANY LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| ANYOFALL LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| ALLOFANY LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| ALLOFALL LP! boolFunctionExpr COMMA! anyExpr COMMA! anyBag RP!
	| MAP LP! typeFunctionExpr COMMA! anyBag RP!
	;

boolFunctionExpr
	: 'boolFunctionExpr()'
	;

typeFunctionExpr
	: 'typeFunctionExpr()'
	;

containsOp
	: doubleBag DOT CONTAINS LP doubleExpr RP
		-> ^(CONTAINS DOUBLE doubleBag doubleExpr )
	| stringBag DOT CONTAINS LP stringExpr RP
		-> ^(CONTAINS STRING stringBag stringExpr )
	| anyUriBag DOT CONTAINS LP anyUriExpr RP
		-> ^(CONTAINS STRING anyUriBag anyUriExpr)
	| dateBag DOT CONTAINS LP dateBag RP
		-> ^(CONTAINS STRING dateBag dateBag)
	| timeBag DOT CONTAINS LP timeExpr RP
		-> ^(CONTAINS STRING timeBag timeExpr)
	| dateTimeBag DOT CONTAINS LP dateTimeExpr RP
		-> ^(CONTAINS STRING dateTimeBag dateTimeExpr)
	| base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP
		-> ^(CONTAINS STRING base64BinaryBag base64BinaryExpr)
	| dayTimeDurationBag DOT CONTAINS LP dayTimeDurationExpr RP
		-> ^(CONTAINS STRING dayTimeDurationBag dayTimeDurationExpr)
	| yearMonthDurationBag DOT CONTAINS LP yearMonthDurationExpr RP
		-> ^(CONTAINS STRING yearMonthDurationBag yearMonthDurationExpr)
	| x500NameBag DOT CONTAINS LP x500NameExpr RP
		-> ^(CONTAINS STRING x500NameBag x500NameExpr)
	| rfc822NameBag DOT CONTAINS LP rfc822NameExpr RP
		-> ^(CONTAINS STRING rfc822NameBag rfc822NameExpr)
	| hexBinaryBag DOT CONTAINS LP hexBinaryExpr RP
		-> ^(CONTAINS STRING hexBinaryBag hexBinaryExpr)
	| (base64BinaryExpr) => base64BinaryBag DOT CONTAINS LP base64BinaryExpr RP
		-> ^(CONTAINS STRING base64BinaryBag base64BinaryExpr)
	;
*/
