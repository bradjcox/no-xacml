grammar XacmlFrag;

options
{
//  backtrack=true;
//  memoize = true;
  output=AST;
}
tokens
{
	ABS_TOK='abs';
	ACTION_TOK='action';
	ALLOF_TOK='allOf';
	ALLOFALL_TOK='allOfAll';
	ALLOFANY_TOK='allOfAny';
	ANYOF_TOK='anyOf';
	ANYOFALL_TOK='anyOfAll';
	ANYOFANY_TOK='anyOfAny' ;
	ANYURI_TOK= 'anyUriExpr';
	ATLEASTONEMENBEROF_TOK='atLeastOneMemberOf';
	BAG_TOK='bag';
	BASE64_TOK= 'base64Expr';
	BOOL_TOK= 'boolean';
	CONCATENATE_TOK='concatenate';
	DATE_TOK= 'dateExpr';
	DATETIME_TOK= 'dateTimeExpr';
	DAYTIMEDURATION_TOK= 'dayTimeDurationExpr';
	DECIMAL_TOK='decimal';
	DENY_TOK = 'deny';
	DEREF_TOK='deref';
	DOUBLE_TOK= 'double';
	ENVIRONMENT_TOK='environment';
	FALSE_TOK='false';
	FLR_TOK='flr';
	HEXBINARY_TOK= 'hexBinaryExpr';
	INTEGER_TOK= 'integerExpr';
	INTERSECTION_TOK='intersection';
	ISIN_TOK= 'isIn';
	MAP_TOK='map';
	MOD_TOK='mod';
	NODECOUNT_TOK='nodeCount';
	NODEEQUAL_TOK='nodeEqual';
	NODEMATCH_TOK='nodeMatch';
	NOF_TOK='nof';
	NORMALIZESPACE_TOK='normalizeSpace' ;
	NORMALIZETOLOWERCASE_TOK='normalizeToLowerCase' ;
	NOT_TOK='not';
	ONEANDONLY_TOK='oneAndOnly';
	PERMIT_TOK='permit';
	RANGEOP_TOK='rangeOp';
	REGEXMATCH_TOK='regexpMatch';
	RESOURCE_TOK='resource';
	RFC822NAME_TOK= 'rfc822NameExpr';
	RND_TOK='rnd';
	SETEQUALS_TOK='setEquals';
	SIZE_TOK='size';
	STRING_TOK= 'stringExpr';
	SUBJECT_TOK='subject';
	SUBSET_TOK='subset';
	TIME_TOK= 'timeExpr';
	TRUE_TOK='true';
	UNION_TOK='union';
	X500NAME_TOK= 'x500NameExpr';
	YEARMONTHDURATION_TOK= 'yearMonthDurationExpr';
	IF_TOK='if';
}

boolExpr
	: TRUE_TOK
	| FALSE_TOK
	| BOOL_TOK '(' ATTRIBUTE ')'
	| '(' ( integerExpr | doubleExpr) ( '==' | '>=' | '>' | '<' | '<=' ) ( integerExpr | doubleExpr) ')'
	;

integerExpr
	: INTEGER_CONSTANT
	| INTEGER_TOK '(' stringExpr ')'
// 	| '(' integerExpr ( '+' | '-' | '*' | '/' ) integerExpr ')'
	| (MOD_TOK | ABS_TOK ) '(' integerExpr ')'
	| SIZE_TOK '(' anyBag ')'
	| NODECOUNT_TOK '(' stringExpr ')'
	;

integerBag
	: INTEGER_TOK STRING_LIST
	| BAG_TOK '(' integerExpr ( ',' integerExpr)+ ')'
	| INTERSECTION_TOK '(' integerBag ',' integerBag	')'
	| UNION_TOK '(' integerBag ',' integerBag	')'
	;

doubleExpr
	: DOUBLE_CONSTANT
	| DOUBLE_TOK '(' stringExpr ')'
// 	| '(' doubleExpr ( '+' | '-' | '*' | '/') doubleExpr ')'
	| ( MOD_TOK | ABS_TOK | RND_TOK | FLR_TOK ) '(' doubleExpr	')'
	;

doubleBag
	: DOUBLE_TOK STRING_LIST
	| BAG_TOK '(' doubleExpr ( ',' doubleExpr)+ ')'
	/*
	| INTERSECTION_TOK '(' dayTimeDurationBag ',' dayTimeDurationBag	')'
	| UNION_TOK '(' dayTimeDurationBag ',' dayTimeDurationBag	')'
	*/
	;
stringExpr
	: STRING_CONSTANT
	| ATTRIBUTE
	| (NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) '(' stringExpr ')'
	| CONCATENATE_TOK '(' stringExpr ',' stringExpr ')'
	;

anyBag
	: ( doubleBag | integerBag )
	;

COMMENT
	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;
WHITESPACE
	: ( ' ' | '\t' | '\r' 		| '\n' )+ {$channel=HIDDEN;}
	| COMMENT
	;

fragment ATTRIBUTE
	: ( SUBJECT_TOK	| RESOURCE_TOK | ACTION_TOK | ENVIRONMENT_TOK) ('.' IDENTIFIER )+
	;

fragment IDENTIFIER
	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

fragment STRING_LIST
	: '(' STRING_CONSTANT ( ',' STRING_CONSTANT )* ')'
	;

fragment STRING_CONSTANT
	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	;

fragment INTEGER_CONSTANT
	:	(DIGIT)+
	;

fragment DOUBLE_CONSTANT
	:	INTEGER_CONSTANT? '.' INTEGER_CONSTANT? EXPONENT
//	|	 INTEGER_CONSTANT EXPONENT
	;

fragment DIGIT
	: '0'..'9'
	;
fragment EXPONENT
	: ('e'|'E') ('+'|'-')? ('0'..'9')+
	;

fragment ESC_SEQ
		:	 '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
//		|	 UNICODE_ESC
		|	 OCTAL_ESC
		;

fragment OCTAL_ESC
		:	 '\\' ('0'..'3') ('0'..'7') ('0'..'7')
		|	 '\\' ('0'..'7') ('0'..'7')
		|	 '\\' ('0'..'7')
		;
/*
fragment UNICODE_ESC
		:	 '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
		;
*/
fragment SIGN
		:	 ('+'|'-')
		;

fragment CHAR
	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
	;
