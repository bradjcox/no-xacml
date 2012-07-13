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
	SUBJECT_TOK='subject';
	RESOURCE_TOK='resource';
	ACTION_TOK='action';
	ENVIRONMENT_TOK='environment';
	MATCHES_TOK='matches';
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
	CONDITION_TOK='condition';
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
	MATCHES_TOK='matches';
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
	import noxacml.util.*;
	import noxacml.xacml2.*;
	import noxacml.xacml2.Xacml2Types.Type;
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
	: POLICY_TOK^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? rule? '}'!
	;

policySet
	: POLICYSET_TOK^ ANYCASEIDENTIFIER LOWERCASEIDENTIFIER '{'! target? policy* '}'!
	;

target
	: TARGET_TOK^ '{'! matchOrExpr '}'!
	;

matchOrExpr
  : matchAndExpr ('||'^ matchAndExpr )*
  ;

matchAndExpr
  : matchExpr ('&&'^ matchExpr)*
  ;

matchExpr
	: attributeSelector '.'! MATCHES_TOK^ '('! stringExpr ')'!
	| '('! matchOrExpr ')'!
	;

attributeSelector
	: ( SUBJECT_TOK	| RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK)^ ('.'! LOWERCASEIDENTIFIER)+
	;

rule
	: RULE_TOK^ ANYCASEIDENTIFIER (PERMIT_TOK | DENY_TOK) '{'! target? condition? '}'!
	;

condition returns [ Type type ]
	: CONDITION_TOK^ '{'! booleanOrExpr '}'! { $type = Type.Boolean; }
	;

booleanOrExpr returns [ Type type ]
  : booleanAndExpr ('||'^ booleanAndExpr )*
  ;

booleanAndExpr returns [ Type type ]
  : booleanExpr ('&&'^ booleanExpr)* { $type = Type.Boolean; }
  ;

booleanExpr returns [ Type type ]
	: TRUE_TOK { $type = Type.Boolean; }
	| FALSE_TOK { $type = Type.Boolean; }
	| booleanCreate { $type = Type.Boolean; }
	| booleanNof { $type = Type.Boolean; }
	| booleanWrap { $type = Type.Boolean; }
	| booleanNode { $type = Type.Boolean; }
	| equalityExpr { $type = Type.Boolean; }
	| isInOp { $type = Type.Boolean; }
	| containsOp { $type = Type.Boolean; }
//	| bagOp
//	| regexOp
	;
booleanCreate returns [ Type type ]
	: BOOLEAN_TOK^ LPAREN! attributeSelector RPAREN! { $type = Type.Boolean; }
	;
booleanNof returns [ Type type ]
	: ( NOF_TOK | NOT_TOK)^ LPAREN! booleanExpr RPAREN! { $type = Type.Boolean; }
	;
booleanWrap returns [ Type type ]
	: LPAREN! booleanOrExpr RPAREN! { $type = Type.Boolean; }
	;
booleanNode returns [ Type type ]
	: stringExpr '.'! ( NODEEQUAL_TOK | NODEMATCH_TOK )^ LPAREN! stringExpr RPAREN! { $type = Type.Boolean; }
	;
booleanBag returns [ Type type ]
	: BOOLEAN_TOK^ STRING_CONSTANT_LIST { $type = Type.Boolean; }
//	| BAG_TOK LPAREN! booleanExpr ( ','! booleanExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! booleanBag','! booleanBag	RPAREN!
	;

isInOp returns [ Type type ]
	: doubleExpr '.'! ISIN_TOK^ LPAREN! doubleBag RPAREN! { $type = Type.DoubleBag; }
	| stringExpr '.'! ISIN_TOK^ LPAREN! stringBag RPAREN! { $type = Type.StringBag; }
	| anyUriExpr '.'! ISIN_TOK^ LPAREN! anyUriBag RPAREN! { $type = Type.AnyUriBag; }
	| dateExpr '.'! ISIN_TOK^ LPAREN! dateBag RPAREN! { $type = Type.DateBag; }
	| timeExpr '.'! ISIN_TOK^ LPAREN! timeBag RPAREN! { $type = Type.TimeBag; }
	| dateTimeExpr '.'! ISIN_TOK^ LPAREN! dateTimeBag RPAREN! { $type = Type.DateTimeBag; }
	| base64BinaryExpr '.'! ISIN_TOK^ LPAREN! base64BinaryBag RPAREN! { $type = Type.Base64BinaryBag; }
	| dayTimeDurationExpr '.'! ISIN_TOK^ LPAREN! dayTimeDurationBag RPAREN! { $type = Type.DayTimeDurationBag; }
	| yearMonthDurationExpr '.'! ISIN_TOK^ LPAREN! yearMonthDurationBag RPAREN! { $type = Type.YearMonthDurationBag; }
	| x500NameExpr '.'! ISIN_TOK^ LPAREN! x500NameBag RPAREN! { $type = Type.X500NameBag; }
	| rfc822NameExpr '.'! ISIN_TOK^ LPAREN! rfc822NameBag RPAREN! { $type = Type.Rfc822NameBag; }
	| hexBinaryExpr '.'! ISIN_TOK^ LPAREN! hexBinaryBag RPAREN! { $type = Type.HexBinaryBag; }
	| (base64BinaryExpr) => base64BinaryExpr '.'! ISIN_TOK^ LPAREN! base64BinaryBag RPAREN! { $type = Type.Base64BinaryBag; }
	;

containsOp returns [ Type type ]
	: doubleBag '.'! CONTAINS_TOK^ LPAREN! doubleExpr RPAREN! { $type = Type.Double; }
	| stringBag '.'! CONTAINS_TOK^ LPAREN! stringExpr RPAREN!{ $type = Type.String; }
	| anyUriBag '.'! CONTAINS_TOK^ LPAREN! anyUriExpr RPAREN!{ $type = Type.AnyUri; }
	| dateBag '.'! CONTAINS_TOK^ LPAREN! dateExpr RPAREN!{ $type = Type.Date; }
	| timeBag '.'! CONTAINS_TOK^ LPAREN! timeExpr RPAREN!{ $type = Type.Time; }
	| dateTimeBag '.'! CONTAINS_TOK^ LPAREN! dateTimeExpr RPAREN!{ $type = Type.DateTime; }
	| base64BinaryBag '.'! CONTAINS_TOK^ LPAREN! base64BinaryExpr RPAREN!{ $type = Type.Base64Binary; }
	| dayTimeDurationBag '.'! CONTAINS_TOK^ LPAREN! dayTimeDurationExpr RPAREN!{ $type = Type.DayTimeDuration; }
	| yearMonthDurationBag '.'! CONTAINS_TOK^ LPAREN! yearMonthDurationExpr RPAREN!{ $type = Type.YearMonthDuration; }
	| x500NameBag '.'! CONTAINS_TOK^ LPAREN! x500NameExpr RPAREN!{ $type = Type.X500Name; }
	| rfc822NameBag '.'! CONTAINS_TOK^ LPAREN! rfc822NameExpr RPAREN!{ $type = Type.Rfc822Name; }
	| hexBinaryBag '.'! CONTAINS_TOK^ LPAREN! hexBinaryExpr RPAREN!{ $type = Type.HexBinary; }
	| (base64BinaryExpr) => base64BinaryBag '.'! CONTAINS_TOK^ LPAREN! base64BinaryExpr RPAREN!{ $type = Type.Base64Binary; }
	;

equalityExpr returns [ Type type ]
	: integerExpr ( '==' | '>=' | '>' | '<' | '<=' )^ integerExpr { $type = Type.Integer; }
	| doubleExpr ( '==' | '>=' | '>' | '<' | '<=' )^ doubleExpr { $type = Type.Double; }
	| stringExpr ( '==' | '>=' | '>' | '<' | '<=' )^ stringExpr { $type = Type.String; }
	| anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' )^ anyUriExpr { $type = Type.AnyUri; }
	| dateExpr ( '==' | '>=' | '>' | '<' | '<=' )^ dateExpr { $type = Type.Date; }
	| timeExpr ( '==' | '>=' | '>' | '<' | '<=' )^ timeExpr { $type = Type.Time; }
	| dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' )^ dateTimeExpr { $type = Type.DateTime; }
	| yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' )^ yearMonthDurationExpr { $type = Type.YearMonthDuration; }
	| x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' )^ x500NameExpr { $type = Type.X500Name; }
	| rfc822NameExpr ( '=='	| '>=' | '>' | '<' | '<=' )^ rfc822NameExpr { $type = Type.Rfc822Name; }
	| dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' )^ dayTimeDurationExpr { $type = Type.DayTimeDuration; }
	| base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' )^ base64BinaryExpr { $type = Type.Base64Binary; }
	;
regexOp returns [ Type type ]
	: integerExpr '.'! REGEXMATCH_TOK^ LPAREN! integerExpr RPAREN! { $type = Type.Integer; }
	| doubleExpr '.'! REGEXMATCH_TOK^ LPAREN! doubleExpr RPAREN! { $type = Type.Double; }
	| stringExpr '.'! REGEXMATCH_TOK^ LPAREN! stringExpr RPAREN! { $type = Type.String; }
	| anyUriExpr '.'! REGEXMATCH_TOK^ LPAREN! anyUriExpr RPAREN! { $type = Type.AnyUri; }
	| dateExpr '.'! REGEXMATCH_TOK^ LPAREN! dateExpr RPAREN! { $type = Type.Date; }
	| timeExpr '.'! REGEXMATCH_TOK^ LPAREN! timeExpr RPAREN! { $type = Type.Time; }
	| dateTimeExpr '.'! REGEXMATCH_TOK^ LPAREN! dateTimeExpr RPAREN! { $type = Type.DateTime; }
	| dayTimeDurationExpr '.'! REGEXMATCH_TOK^ LPAREN! dayTimeDurationExpr RPAREN! { $type = Type.DayTimeDuration; }
	| yearMonthDurationExpr '.'! REGEXMATCH_TOK^ LPAREN! yearMonthDurationExpr RPAREN! { $type = Type.YearMonthDuration; }
	| x500NameExpr '.'! REGEXMATCH_TOK^ LPAREN! x500NameExpr RPAREN! { $type = Type.X500Name; }
	| rfc822NameExpr '.'! REGEXMATCH_TOK^ LPAREN! rfc822NameExpr RPAREN! { $type = Type.Rfc822Name; }
	| base64BinaryExpr '.'! REGEXMATCH_TOK^ LPAREN! base64BinaryExpr RPAREN! { $type = Type.Base64Binary; }
	;

bagOp returns [ Type type ]
	: (booleanBag) => booleanBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! booleanBag RPAREN! { $type = Type.BooleanBag; }
	| (integerBag) => integerBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! integerBag RPAREN! { $type = Type.IntegerBag; }
	| (doubleBag) => doubleBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! doubleBag RPAREN! { $type = Type.DoubleBag; }
	| (stringBag ) => stringBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! stringBag RPAREN! { $type = Type.StringBag; }
	| (dateBag ) => dateBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! dateBag RPAREN! { $type = Type.DateBag; }
	| (timeBag ) => timeBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! timeBag RPAREN! { $type = Type.TimeBag; }
	| (dateTimeBag ) => dateTimeBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! dateTimeBag RPAREN! { $type = Type.DateTimeBag; }
	| (base64BinaryBag ) => base64BinaryBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! base64BinaryBag RPAREN! { $type = Type.Base64BinaryBag; }
	| (dayTimeDurationBag ) => dayTimeDurationBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! dayTimeDurationBag RPAREN! { $type = Type.DayTimeDurationBag; }
	| (yearMonthDurationBag ) => yearMonthDurationBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! yearMonthDurationBag RPAREN! { $type = Type.YearMonthDurationBag; }
	| (anyUriBag ) => anyUriBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! anyUriBag RPAREN! { $type = Type.AnyUriBag; }
	| (x500NameBag ) => x500NameBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! x500NameBag RPAREN! { $type = Type.X500NameBag; }
	| (rfc822NameBag ) => rfc822NameBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! rfc822NameBag RPAREN! { $type = Type.Rfc822NameBag; }
	| (hexBinaryBag ) => hexBinaryBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! hexBinaryBag RPAREN! { $type = Type.HexBinaryBag; }
	| (base64BinaryBag) => base64BinaryBag '.'! ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )^ LPAREN! base64BinaryBag RPAREN! { $type = Type.Base64BinaryBag; }
	;

integerExpr
	: INTEGER_CONSTANT
	| stringExpr '.'! ( INTEGER_TOK | NODECOUNT_TOK )^ LPAREN! RPAREN!
	| anyBag '.'! SIZE_TOK LPAREN! RPAREN!
//	| integerExpr '.'! ABS_TOK LPAREN! RPAREN!
// 	| LPAREN! integerExpr ( '+' | '-' | '*' | '/' | '%' ) integerExpr RPAREN!
//	| ABS_TOK LPAREN! integerExpr RPAREN!
	;
integerBag
	: (INTEGER_TOK^ STRING_CONSTANT_LIST | BAG_TOK^ LPAREN! integerExpr ( ','! integerExpr)+ RPAREN!) ('.'! ( INTERSECTION_TOK | UNION_TOK )^ LPAREN! integerBag	RPAREN!)*
	;

doubleExpr
	: DOUBLE_CONSTANT^
	| DOUBLE_TOK^ LPAREN! stringExpr RPAREN!
//	| LPAREN! doubleExpr ( '+' | '-' | '*' | '/' | '%' ) doubleExpr RPAREN!
//	| ( ABS_TOK | RND_TOK | FLR_TOK ) LPAREN! doubleExpr	RPAREN!
	;
doubleBag
	: DOUBLE_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! doubleExpr ( ','! doubleExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! dayTimeDurationBag ','! dayTimeDurationBag	RPAREN!
	;

stringExpr
	: (STRING_CONSTANT^
		| stringBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!)
		('.'! ( REQUIRED_TOK | NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK)^ LPAREN! RPAREN!)*
	;
//	| CONCATENATE_TOK LPAREN! stringExpr ','! stringExpr RPAREN!
stringBag
	: STRING_TOK^ STRING_CONSTANT_LIST
	| attributeSelector^
//	| (stringBag) => ( INTERSECTION_TOK | UNION_TOK ) LPAREN! stringBag ','! stringBag	RPAREN!
	;


anyUriExpr
	: ANYURI_TOK^ LPAREN! stringExpr RPAREN!
	| anyUriBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	| stringExpr '.'! URI_TOK^ LPAREN! RPAREN!
//	| ((anyUriExpr) => anyUriExpr '.'! ( NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) LPAREN! RPAREN!)
//	| CONCATENATE_TOK LPAREN! anyUriExpr ','! anyUriExpr RPAREN!
	;

anyUriBag
	: ANYURI_TOK^ STRING_CONSTANT_LIST
//	| (anyUriBag) => ( INTERSECTION_TOK | UNION_TOK ) LPAREN! anyUriBag ','! anyUriBag	RPAREN!
	;

dateExpr
	: DATE_TOK^ LPAREN! stringExpr RPAREN!
	| dateBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
dateBag
	: DATE_TOK^ STRING_CONSTANT_LIST
//	| (BAG_TOK)=> BAG_TOK LPAREN! dateExpr ( ','! dateExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! dateBag	','! dateBag	RPAREN!
	;

timeExpr
	: TIME_TOK^ LPAREN! stringExpr RPAREN!
	| timeBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
timeBag
	: TIME_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK^ LPAREN! timeExpr ( ','! timeExpr )+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK )^ LPAREN! timeBag ','! timeBag	RPAREN!
	;

dateTimeExpr
	: DATETIME_TOK^ LPAREN! stringExpr RPAREN!
	| dateTimeBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
dateTimeBag
	: DATETIME_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK^ LPAREN! dateTimeExpr ( ','! dateTimeExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK )^ LPAREN! dateTimeBag ','! dateTimeBag	RPAREN!
	;

base64BinaryExpr
	: BASE64BINARY_TOK^ LPAREN! stringExpr RPAREN!
	| base64BinaryBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
base64BinaryBag
	: BASE64BINARY_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! base64BinaryExpr ( ','! base64BinaryExpr )+ RPAREN!
//	| INTERSECTION_TOK LPAREN! base64BinaryBag ','! base64BinaryBag RPAREN!
//	| UNION_TOK LPAREN! base64BinaryBag ','! base64BinaryBag RPAREN!
	;

dayTimeDurationExpr
	: DAYTIMEDURATION_TOK^ LPAREN! stringExpr RPAREN!
	| dayTimeDurationBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
dayTimeDurationBag
	: DAYTIMEDURATION_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! dayTimeDurationExpr ( ','! dayTimeDurationExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! dayTimeDurationBag ','! dayTimeDurationBag	RPAREN!
	;

yearMonthDurationExpr
	: YEARMONTHDURATION_TOK^ LPAREN! stringExpr RPAREN!
	| yearMonthDurationBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
yearMonthDurationBag
	: YEARMONTHDURATION_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! yearMonthDurationExpr ( ','! yearMonthDurationExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! yearMonthDurationBag	 ','! yearMonthDurationBag		RPAREN!
	;

x500NameExpr
	: X500NAME_TOK^ LPAREN! stringExpr RPAREN!
	| x500NameBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
//	| ((x500NameExpr) => x500NameExpr '.'! MATCH_TOK LPAREN! x500NameExpr RPAREN!)
	;
x500NameBag
	: X500NAME_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! x500NameExpr ( ','! x500NameExpr )+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! x500NameBag ','! x500NameBag	RPAREN!
	;

rfc822NameExpr
	: RFC822NAME_TOK^ LPAREN! stringExpr RPAREN!
	| rfc822NameBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
//	| ((rfc822NameExpr) => rfc822NameExpr '.'! MATCH_TOK LPAREN! rfc822NameExpr RPAREN!)
	;
rfc822NameBag
	: RFC822NAME_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! rfc822NameExpr ( ','! rfc822NameExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! rfc822NameBag ','! rfc822NameBag	RPAREN!
	;

hexBinaryExpr
	: HEXBINARY_TOK^ LPAREN! stringExpr RPAREN!
	| hexBinaryBag '.'! ONEANDONLY_TOK^ LPAREN! RPAREN!
	;
hexBinaryBag
	: HEXBINARY_TOK^ STRING_CONSTANT_LIST
//	| BAG_TOK LPAREN! hexBinaryExpr (','! hexBinaryExpr)+ RPAREN!
//	| ( INTERSECTION_TOK | UNION_TOK ) LPAREN! hexBinaryBag ','! hexBinaryBag	RPAREN!
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
	: LPAREN! STRING_CONSTANT ( ','! STRING_CONSTANT )* RPAREN!
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
	: ANYOF_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| ALLOF_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| ANYOFANY_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| ANYOFALL_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| ALLOFANY_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| ALLOFALL_TOK LPAREN! boolFunctionExpr ','! anyExpr ','! anyBag RPAREN!
	| MAP_TOK LPAREN! typeFunctionExpr ','! anyBag RPAREN!
	;

boolFunctionExpr
	: 'boolFunctionExpr()'
	;

typeFunctionExpr
	: 'typeFunctionExpr()'
	;
*/
