grammar Grammar;

options
{
//  backtrack=true;
//  memoize = true;
//	k = 5;
	ASTLabelType=CommonTree;
	output=AST;
	language=Java;
}
tokens
{
	SUBJECT_TOK='subject';
	RESOURCE_TOK='resource';
	ACTION_TOK='action';
	ENVIRONMENT_TOK='environment';
	ABS_TOK='abs';
	ACTION_TOK='action';
	ALLOF_TOK='allOf';
	ALLOFALL_TOK='allOfAll';
	ALLOFANY_TOK='allOfAny';
	ANYOF_TOK='anyOf';
	ANYOFALL_TOK='anyOfAll';
	ANYOFANY_TOK='anyOfAny' ;
	ANYURI_TOK= 'anyUri';
	ATLEASTONEMENBEROF_TOK='atLeastOneMemberOf';
	BAG_TOK='bag';
	BASE64BINARY_TOK= 'base64Binary';
	BOOLEAN_TOK= 'boolean';
	CONCATENATE_TOK='concatenate';
	CONTAINS_TOK='contains';
	DATE_TOK= 'date';
	DATETIME_TOK= 'dateTime';
	DAYTIMEDURATION_TOK= 'dayTimeDuration';
	DECIMAL_TOK='decimal';
	DENY_TOK = 'deny';
	DEREF_TOK='deref';
	DOUBLE_TOK= 'double';
	ENVIRONMENT_TOK='environment';
	FALSE_TOK='false';
	FLR_TOK='flr';
	HEXBINARY_TOK= 'hexBinary';
	IF_TOK='if';
	INTEGER_TOK= 'integer';
	INTERSECTION_TOK='intersection';
	ISIN_TOK= 'isIn';
	LPAREN='(';
	MAP_TOK='map';
	MATCH_TOK='match';
	NODECOUNT_TOK='nodeCount';
	NODEEQUAL_TOK='nodeEqual';
	NODEMATCH_TOK='nodeMatch';
	NOF_TOK='nof';
	NORMALIZESPACE_TOK='normalizeSpace' ;
	NORMALIZETOLOWERCASE_TOK='normalizeToLowerCase' ;
	NOT_TOK='not';
	ONEANDONLY_TOK='oneAndOnly';
	PERMIT_TOK='permit';
	POLICY_TOK='policy';
	POLICYSET_TOK='policyset';
	RANGEOP_TOK='rangeOp';
	REGEXMATCH_TOK='regexpMatch';
	RESOURCE_TOK='resource';
	RFC822NAME_TOK= 'rfc822Name';
	REQUIRED_TOK='required';
	RPAREN=')';
	RND_TOK='rnd';
	RULE_TOK='rule';
	SETEQUALS_TOK='setEquals';
	SIZE_TOK='size';
	STRING_TOK= 'string';
	SUBJECT_TOK='subject';
	SUBSET_TOK='subset';
	TARGET_TOK='target';
	TIME_TOK= 'time';
	TRUE_TOK='true';
	UNION_TOK='union';
	URI_TOK='uri';
	X500NAME_TOK= 'x500Name';
	YEARMONTHDURATION_TOK= 'yearMonthDuration';
}

@header
{
	package noxacml;
	import org.opensaml.xacml.policy.*;
	import org.opensaml.xacml.ctx.*;
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
	: POLICY_TOK^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? rule* '}'!
	;
policySet
	: POLICYSET_TOK^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? policy* '}'!
	;

target
	: TARGET_TOK^ ANYCASEIDENTIFIER? '{'! subjects* resources* actions* environments* '}'!
	;
subjects
	: SUBJECT_TOK^ '{'! (PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr '}'!
	;
resources
	: RESOURCE_TOK^ '{'! (PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr '}'!
	;
actions
	: ACTION_TOK^ '{'! (PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr '}'!
	;
environments
	: ENVIRONMENT_TOK^ '{'! (PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr '}'!
	;

rule
	: RULE_TOK^ ANYCASEIDENTIFIER? '{'! target? (PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr '}'!
	;

booleanExpr
	: TRUE_TOK
	| FALSE_TOK
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
	: BOOLEAN_TOK LPAREN ATTRIBUTE_NAME RPAREN -> ^(BOOLEAN_TOK ATTRIBUTE_NAME)
	;
booleanNof
	: ( NOF_TOK | NOT_TOK) LPAREN booleanExpr RPAREN
	;
booleanWrap
	: LPAREN! conditionalOrExpr RPAREN! -> ^('COND' conditionalOrExpr)
	;
booleanNode
	: stringExpr '.' ( NODEEQUAL_TOK | NODEMATCH_TOK )^ LPAREN! stringExpr RPAREN!
	;
booleanBag
	: BOOLEAN_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN booleanExpr ( ',' booleanExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN booleanBag',' booleanBag	RPAREN
	;

conditionalOrExpr
    : conditionalAndExpr ('||'^ conditionalAndExpr )*
    ;

conditionalAndExpr
    : booleanExpr ('&&'^ booleanExpr)*
    ;

isInOp
	:  doubleExpr '.' ISIN_TOK LPAREN doubleBag RPAREN
	|  stringExpr '.' ISIN_TOK LPAREN stringBag RPAREN
	|  anyUriExpr '.' ISIN_TOK LPAREN anyUriBag RPAREN
	|  dateExpr '.' ISIN_TOK LPAREN dateBag RPAREN
	|  timeExpr '.' ISIN_TOK LPAREN timeBag RPAREN
	|  dateTimeExpr '.' ISIN_TOK LPAREN dateTimeBag RPAREN
	|  base64BinaryExpr '.' ISIN_TOK LPAREN base64BinaryBag RPAREN
	|  dayTimeDurationExpr '.' ISIN_TOK LPAREN dayTimeDurationBag RPAREN
	|  yearMonthDurationExpr '.' ISIN_TOK LPAREN yearMonthDurationBag RPAREN
	|  x500NameExpr '.' ISIN_TOK LPAREN x500NameBag RPAREN
	|  rfc822NameExpr '.' ISIN_TOK LPAREN rfc822NameBag RPAREN
	|  hexBinaryExpr '.' ISIN_TOK LPAREN hexBinaryBag RPAREN
	|  (base64BinaryExpr) => base64BinaryExpr '.' ISIN_TOK LPAREN base64BinaryBag RPAREN
	;

containsOp
	:  doubleBag '.' CONTAINS_TOK LPAREN doubleExpr RPAREN
	|  stringBag '.' CONTAINS_TOK LPAREN stringExpr RPAREN
	|  anyUriBag '.' CONTAINS_TOK LPAREN anyUriExpr RPAREN
	|  dateBag '.' CONTAINS_TOK LPAREN dateExpr RPAREN
	|  timeBag '.' CONTAINS_TOK LPAREN timeExpr RPAREN
	|  dateTimeBag '.' CONTAINS_TOK LPAREN dateTimeExpr RPAREN
	|  base64BinaryBag '.' CONTAINS_TOK LPAREN base64BinaryExpr RPAREN
	|  dayTimeDurationBag '.' CONTAINS_TOK LPAREN dayTimeDurationExpr RPAREN
	|  yearMonthDurationBag '.' CONTAINS_TOK LPAREN yearMonthDurationExpr RPAREN
	|  x500NameBag '.' CONTAINS_TOK LPAREN x500NameExpr RPAREN
	|  rfc822NameBag '.' CONTAINS_TOK LPAREN rfc822NameExpr RPAREN
	|  hexBinaryBag '.' CONTAINS_TOK LPAREN hexBinaryExpr RPAREN
	|  (base64BinaryExpr) => base64BinaryBag '.' CONTAINS_TOK LPAREN base64BinaryExpr RPAREN
	;

equalityExpr
	: integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr
	| doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr
	| stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr
	| anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr
	| dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr
	| timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr
	| dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr
	| yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr
	| x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr
	| rfc822NameExpr ( '=='	|  '>=' | '>' | '<' | '<=' ) rfc822NameExpr
	| dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr
	| base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr
  ;

regexOp
	: integerExpr  '.' REGEXMATCH_TOK LPAREN integerExpr RPAREN
	| doubleExpr '.' REGEXMATCH_TOK LPAREN doubleExpr RPAREN
	| stringExpr '.' REGEXMATCH_TOK LPAREN stringExpr RPAREN
	| anyUriExpr '.' REGEXMATCH_TOK LPAREN anyUriExpr RPAREN
	| dateExpr '.' REGEXMATCH_TOK LPAREN dateExpr RPAREN
	| timeExpr '.' REGEXMATCH_TOK LPAREN timeExpr RPAREN
	| dateTimeExpr '.' REGEXMATCH_TOK LPAREN dateTimeExpr RPAREN
	| dayTimeDurationExpr '.' REGEXMATCH_TOK LPAREN dayTimeDurationExpr RPAREN
	| yearMonthDurationExpr '.' REGEXMATCH_TOK LPAREN yearMonthDurationExpr RPAREN
	| x500NameExpr '.' REGEXMATCH_TOK LPAREN x500NameExpr RPAREN
	| rfc822NameExpr '.' REGEXMATCH_TOK LPAREN rfc822NameExpr RPAREN
	| base64BinaryExpr '.' REGEXMATCH_TOK LPAREN base64BinaryExpr RPAREN
	;

bagOp
	: (booleanBag) => booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) LPAREN booleanBag RPAREN
	| (integerBag) => integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  integerBag RPAREN
	| (doubleBag) => doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  doubleBag RPAREN
	| (stringBag ) => stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  stringBag RPAREN
	| (dateBag ) => dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  dateBag RPAREN
	| (timeBag ) => timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  timeBag RPAREN
	| (dateTimeBag ) => dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  dateTimeBag RPAREN
	| (base64BinaryBag ) => base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) LPAREN  base64BinaryBag RPAREN
	| (dayTimeDurationBag ) => dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) LPAREN  dayTimeDurationBag RPAREN
	| (yearMonthDurationBag ) => yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  yearMonthDurationBag RPAREN
	| (anyUriBag ) => anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  anyUriBag RPAREN
	| (x500NameBag ) => x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  x500NameBag RPAREN
	| (rfc822NameBag ) => rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) LPAREN  rfc822NameBag RPAREN
	| (hexBinaryBag ) => hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  hexBinaryBag RPAREN
	| (base64BinaryBag) => base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) LPAREN  base64BinaryBag RPAREN
	;

integerExpr
	: INTEGER_CONSTANT
	| stringExpr '.' ( INTEGER_TOK | NODECOUNT_TOK ) LPAREN  RPAREN
	| anyBag '.' SIZE_TOK LPAREN RPAREN
//	| integerExpr '.' ABS_TOK LPAREN RPAREN
// 	| LPAREN integerExpr ( '+' | '-' | '*' | '/' | '%' ) integerExpr RPAREN
//	| ABS_TOK LPAREN integerExpr RPAREN
	;
integerBag
	: (INTEGER_TOK STRING_CONSTANT_LIST | BAG_TOK LPAREN integerExpr ( ',' integerExpr)+ RPAREN) ('.' ( INTERSECTION_TOK | UNION_TOK ) LPAREN integerBag	RPAREN)*
	;

doubleExpr
	: DOUBLE_CONSTANT
	| DOUBLE_TOK LPAREN stringExpr RPAREN
//	| LPAREN doubleExpr ( '+' | '-' | '*' | '/' | '%' ) doubleExpr RPAREN
//	| ( ABS_TOK | RND_TOK | FLR_TOK ) LPAREN doubleExpr	RPAREN
	;
doubleBag
	: DOUBLE_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN doubleExpr ( ',' doubleExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN dayTimeDurationBag ',' dayTimeDurationBag	RPAREN
	;

stringExpr
	: (STRING_CONSTANT
		| stringBag '.' ONEANDONLY_TOK LPAREN RPAREN)
		('.' ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) LPAREN RPAREN)*
	;
//	| CONCATENATE_TOK LPAREN stringExpr ',' stringExpr RPAREN
stringBag
	: STRING_TOK STRING_CONSTANT_LIST
	| ATTRIBUTE_NAME
//	| (stringBag) => ( INTERSECTION_TOK | UNION_TOK ) LPAREN stringBag ',' stringBag	RPAREN
	;


anyUriExpr
	: ANYURI_TOK LPAREN stringExpr RPAREN
	| anyUriBag '.' ONEANDONLY_TOK LPAREN RPAREN
	| stringExpr '.' URI_TOK LPAREN RPAREN
//	| ((anyUriExpr) => anyUriExpr '.' ( NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) LPAREN RPAREN)
//	| CONCATENATE_TOK LPAREN anyUriExpr ',' anyUriExpr RPAREN
	;

anyUriBag
	: ANYURI_TOK STRING_CONSTANT_LIST
//	| (anyUriBag) => ( INTERSECTION_TOK | UNION_TOK ) LPAREN anyUriBag ',' anyUriBag	RPAREN
	;

dateExpr
	: DATE_TOK LPAREN stringExpr RPAREN
	| dateBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
dateBag
	: DATE_TOK STRING_CONSTANT_LIST
//	| (BAG_TOK)=> BAG_TOK LPAREN dateExpr ( ',' dateExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN dateBag	',' dateBag	RPAREN
	;

timeExpr
	: TIME_TOK LPAREN stringExpr RPAREN
	| timeBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
timeBag
	: TIME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN timeExpr ( ',' timeExpr )+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN timeBag ',' timeBag	RPAREN
	;

dateTimeExpr
	: DATETIME_TOK LPAREN stringExpr RPAREN
	| dateTimeBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
dateTimeBag
	: DATETIME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN dateTimeExpr ( ',' dateTimeExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN dateTimeBag ',' dateTimeBag	RPAREN
	;

base64BinaryExpr
	: BASE64BINARY_TOK LPAREN stringExpr RPAREN
	| base64BinaryBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
base64BinaryBag
	: BASE64BINARY_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN base64BinaryExpr ( ',' base64BinaryExpr )+ RPAREN
//	| INTERSECTION_TOK LPAREN base64BinaryBag ',' base64BinaryBag RPAREN
//	| UNION_TOK LPAREN base64BinaryBag ',' base64BinaryBag RPAREN
	;

dayTimeDurationExpr
	: DAYTIMEDURATION_TOK LPAREN stringExpr RPAREN
	| dayTimeDurationBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
dayTimeDurationBag
	: DAYTIMEDURATION_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN dayTimeDurationExpr ( ',' dayTimeDurationExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN dayTimeDurationBag ',' dayTimeDurationBag	RPAREN
	;

yearMonthDurationExpr
	: YEARMONTHDURATION_TOK LPAREN stringExpr RPAREN
	| yearMonthDurationBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
yearMonthDurationBag
	: YEARMONTHDURATION_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN yearMonthDurationExpr ( ',' yearMonthDurationExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN yearMonthDurationBag	 ',' yearMonthDurationBag		RPAREN
	;

x500NameExpr
	: X500NAME_TOK LPAREN stringExpr RPAREN
	| x500NameBag  '.' ONEANDONLY_TOK LPAREN RPAREN
//	| ((x500NameExpr) => x500NameExpr '.' MATCH_TOK LPAREN x500NameExpr RPAREN)
	;
x500NameBag
	: X500NAME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN x500NameExpr ( ',' x500NameExpr )+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN x500NameBag ',' x500NameBag	RPAREN
	;

rfc822NameExpr
	: RFC822NAME_TOK LPAREN stringExpr RPAREN
	| rfc822NameBag '.' ONEANDONLY_TOK LPAREN RPAREN
//	| ((rfc822NameExpr) => rfc822NameExpr '.' MATCH_TOK LPAREN rfc822NameExpr RPAREN)
	;
rfc822NameBag
	: RFC822NAME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN rfc822NameExpr ( ',' rfc822NameExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN rfc822NameBag ',' rfc822NameBag	RPAREN
	;

hexBinaryExpr
	: HEXBINARY_TOK LPAREN stringExpr RPAREN
	| hexBinaryBag '.' ONEANDONLY_TOK LPAREN RPAREN
	;
hexBinaryBag
	: HEXBINARY_TOK STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN hexBinaryExpr (',' hexBinaryExpr)+ RPAREN
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN hexBinaryBag ',' hexBinaryBag	RPAREN
	;

anyBag
	: booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag
	| timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag
	| yearMonthDurationBag  | x500NameBag
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

ATTRIBUTE_NAME
	: ( SUBJECT_TOK	| RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK) '.' LOWERCASEIDENTIFIER
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
	: INTEGER_CONSTANT? ('.' ('0'..'9')*)? EXPONENT
//	| INTEGER_CONSTANT EXPONENT
	;
LOWERCASEIDENTIFIER
	: ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

ANYCASEIDENTIFIER
	: ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
	;

STRING_CONSTANT_LIST
	: LPAREN STRING_CONSTANT ( ',' STRING_CONSTANT )* RPAREN
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
	: ANYOF_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| ALLOF_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| ANYOFANY_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| ANYOFALL_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| ALLOFANY_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| ALLOFALL_TOK LPAREN boolFunctionExpr ',' anyExpr ',' anyBag RPAREN
	| MAP_TOK LPAREN typeFunctionExpr ',' anyBag RPAREN
	;

boolFunctionExpr
	: 'boolFunctionExpr()'
	;

typeFunctionExpr
	: 'typeFunctionExpr()'
	;
*/
