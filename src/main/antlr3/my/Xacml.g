grammar Xacml;

options
{
//  backtrack=true;
//  memoize = true;
//	k = 5;
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
	ANYURI_TOK= 'anyUri';
	ATLEASTONEMENBEROF_TOK='atLeastOneMemberOf';
	BAG_TOK='bag';
	BASE64BINARY_TOK= 'base64Binary';
	BOOLEAN_TOK= 'boolean';
	CONCATENATE_TOK='concatenate';
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
	RANGEOP_TOK='rangeOp';
	REGEXMATCH_TOK='regexpMatch';
	RESOURCE_TOK='resource';
	RFC822NAME_TOK= 'rfc822Name';
	RND_TOK='rnd';
	SETEQUALS_TOK='setEquals';
	SIZE_TOK='size';
	STRING_TOK= 'string';
	SUBJECT_TOK='subject';
	SUBSET_TOK='subset';
	TIME_TOK= 'time';
	TRUE_TOK='true';
	UNION_TOK='union';
	X500NAME_TOK= 'x500Name';
	YEARMONTHDURATION_TOK= 'yearMonthDuration';
}

@header
{
	package my;
	import java.util.HashMap;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
}
@lexer::header
{
	package my;
}
@members
{
	private int _type;
	HashMap<String, Object> objectMap = new HashMap<String, Object>();
    final static Logger log = LoggerFactory.getLogger(XacmlParser.class);
	public static void main(String[] args) throws Exception
	{
		args = new String[] { "src/main/resources/test.xacml" };
		XacmlLexer lexer = new XacmlLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XacmlParser parser = new XacmlParser(tokens);
		try
		{
//			XacmlParser.rule_return xacmlExpr =
			Object o = parser.xacmlExpr();
			return;
		}
		catch (RecognitionException e)
		{
			e.printStackTrace();
		}
	}
}

xacmlExpr
	:	(PERMIT_TOK | DENY_TOK) IF_TOK booleanExpr EOF { log.debug("xacmlExpr: {}", $booleanExpr.text); }
	;

booleanExpr
	: (factoredBoolExpr)=>  (factoredBoolExpr) ( booleanExpr 	ISIN_TOK '(' booleanBag ')' )?
	;

factoredBoolExpr
	: TRUE_TOK
	| FALSE_TOK
	| BOOLEAN_TOK '(' ATTRIBUTE ')'
	| ( NOF_TOK | NOT_TOK) '(' booleanExpr ')'
//	| stringExpr '.' (NODEEQUAL_TOK | NODEMATCH_TOK) '(' stringExpr ')'
	| binOps
	| isInOps
	| bagOps
	| stringOps
	| regexOps
	;

stringOps
	: stringExpr '.'	( NODEEQUAL_TOK | NODEMATCH_TOK ) '(' stringExpr ')'
	;

isInOps
	:  doubleExpr '.' ISIN_TOK '(' doubleBag ')'
	|  stringExpr '.' ISIN_TOK '(' stringBag ')'
	|  anyUriExpr '.' ISIN_TOK '(' anyUriBag ')'
	|  dateExpr '.' ISIN_TOK '(' dateBag ')'
	|  timeExpr '.' ISIN_TOK '(' timeBag ')'
	|  dateTimeExpr '.' ISIN_TOK '(' dateTimeBag ')'
	|  base64BinaryExpr '.' ISIN_TOK '(' base64BinaryBag ')'
	|  dayTimeDurationExpr '.' ISIN_TOK '(' dayTimeDurationBag ')'
	|  yearMonthDurationExpr '.' ISIN_TOK '(' yearMonthDurationBag ')'
	|  x500NameExpr '.' ISIN_TOK '(' x500NameBag ')'
	|  rfc822NameExpr '.' ISIN_TOK '(' rfc822NameBag ')'
	|  hexBinaryExpr '.' ISIN_TOK '(' hexBinaryBag ')'
	|  (base64BinaryExpr) => base64BinaryExpr '.' ISIN_TOK '(' base64BinaryBag ')'
	;

binOps
	: '(' integerExpr ( '==' | '>=' | '>' | '<' | '<=' ) integerExpr ')'
	| '(' doubleExpr ( '==' | '>=' | '>' | '<' | '<=' ) doubleExpr ')'
	| '(' stringExpr ( '==' | '>=' | '>' | '<' | '<=' ) stringExpr ')'
	| '(' anyUriExpr ( '==' | '>=' | '>' | '<' | '<=' ) anyUriExpr ')'
	| '(' dateExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateExpr ')'
	| '(' timeExpr ( '==' | '>=' | '>' | '<' | '<=' ) timeExpr ')'
	| '(' dateTimeExpr ( '==' | '>=' | '>' | '<' | '<=' ) dateTimeExpr ')'
	| '(' dayTimeDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) dayTimeDurationExpr ')'
	| '(' yearMonthDurationExpr ( '==' | '>=' | '>' | '<' | '<=' ) yearMonthDurationExpr ')'
	| '(' x500NameExpr ( '==' | '>=' | '>' | '<' | '<=' ) x500NameExpr ')'
	| '(' rfc822NameExpr ( '=='	|  '>=' | '>' | '<' | '<=' ) rfc822NameExpr ')'
	| (base64BinaryExpr) => '(' base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr ')'
	;

regexOps
	: integerExpr  '.' REGEXMATCH_TOK '(' integerExpr ')'
	| doubleExpr '.' REGEXMATCH_TOK '(' doubleExpr ')'
	| stringExpr '.' REGEXMATCH_TOK '(' stringExpr ')'
	| anyUriExpr '.' REGEXMATCH_TOK '(' anyUriExpr ')'
	| dateExpr '.' REGEXMATCH_TOK '(' dateExpr ')'
	| timeExpr '.' REGEXMATCH_TOK '(' timeExpr ')'
	| dateTimeExpr '.' REGEXMATCH_TOK '(' dateTimeExpr ')'
	| dayTimeDurationExpr '.' REGEXMATCH_TOK '(' dayTimeDurationExpr ')'
	| yearMonthDurationExpr '.' REGEXMATCH_TOK '(' yearMonthDurationExpr ')'
	| x500NameExpr '.' REGEXMATCH_TOK '(' x500NameExpr ')'
	| rfc822NameExpr '.' REGEXMATCH_TOK '(' rfc822NameExpr ')'
	| (base64BinaryExpr) => base64BinaryExpr '.' REGEXMATCH_TOK '(' base64BinaryExpr ')'
	;


bagOps
	: booleanBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK ) '(' booleanBag ')'
	| integerBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  integerBag ')'
	| doubleBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  doubleBag ')'
	| stringBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  stringBag ')'
	| dateBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  dateBag ')'
	| timeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  timeBag ')'
	| dateTimeBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  dateTimeBag ')'
	| base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  base64BinaryBag ')'
	| dayTimeDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  dayTimeDurationBag ')'
	| yearMonthDurationBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  yearMonthDurationBag ')'
	| anyUriBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  anyUriBag ')'
	| x500NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  x500NameBag ')'
	| rfc822NameBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  rfc822NameBag ')'
	| hexBinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  hexBinaryBag ')'
	| (base64BinaryBag) => base64BinaryBag '.' ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK  ) '('  base64BinaryBag ')'
	;

integerExpr
	: INTEGER_CONSTANT
// 	| '(' integerExpr ( '+' | '-' | '*' | '/' | '%' ) integerExpr ')'
	| ( INTEGER_TOK | NODECOUNT_TOK ) '(' stringExpr ')'
	| ABS_TOK '(' integerExpr ')'
	| SIZE_TOK '(' anyBag ')'
	;

doubleExpr
	: DOUBLE_CONSTANT
	| DOUBLE_TOK '(' stringExpr ')'
//	| '(' doubleExpr ( '+' | '-' | '*' | '/' | '%' ) doubleExpr ')'
//	| ( ABS_TOK | RND_TOK | FLR_TOK ) '(' doubleExpr	')'
	;

stringExpr
	: (STRING_CONSTANT) => STRING_CONSTANT
	| ATTRIBUTE
//	| ((stringExpr) => stringExpr '.' ( NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) '(' ')')
	| stringBag '.' ONEANDONLY_TOK '(' ')'
//	| CONCATENATE_TOK '(' stringExpr ',' stringExpr ')'
	;

anyUriExpr
	: ANYURI_TOK '(' stringExpr ')'
//	| ((anyUriExpr) => anyUriExpr '.' ( NORMALIZESPACE_TOK | NORMALIZETOLOWERCASE_TOK) '(' ')')
	| anyUriBag '.' ONEANDONLY_TOK '(' ')' 
//	| CONCATENATE_TOK '(' anyUriExpr ',' anyUriExpr ')'
	;

dateExpr
	: DATE_TOK '(' stringExpr ')'
	| dateBag '.' ONEANDONLY_TOK '(' ')'
	;

timeExpr
	: TIME_TOK '(' stringExpr ')'
	| timeBag '.' ONEANDONLY_TOK '(' ')'
	;

dateTimeExpr
	: DATETIME_TOK '(' stringExpr ')'
	| dateTimeBag '.' ONEANDONLY_TOK '(' ')'
	;

base64BinaryExpr
	: ((BASE64BINARY_TOK) => BASE64BINARY_TOK '(' stringExpr ')')
	| (base64BinaryBag) => base64BinaryBag '.' ONEANDONLY_TOK '(' ')'
	;
dayTimeDurationExpr
	: (DAYTIMEDURATION_TOK) => DAYTIMEDURATION_TOK '(' stringExpr ')'
	| (dayTimeDurationBag) => dayTimeDurationBag '.' ONEANDONLY_TOK '(' ')'
	;

yearMonthDurationExpr
	: ((YEARMONTHDURATION_TOK) => YEARMONTHDURATION_TOK '(' stringExpr ')')
	| ((yearMonthDurationBag) => yearMonthDurationBag '.' ONEANDONLY_TOK '(' ')')
	;
x500NameExpr
	: X500NAME_TOK '(' stringExpr ')'
	| x500NameBag  '.' ONEANDONLY_TOK '(' ')'
//	| ((x500NameExpr) => x500NameExpr '.' MATCH_TOK '(' x500NameExpr ')')
	;
rfc822NameExpr
	: RFC822NAME_TOK '(' stringExpr ')'
	| rfc822NameBag '.' ONEANDONLY_TOK '(' ')'
//	| ((rfc822NameExpr) => rfc822NameExpr '.' MATCH_TOK '(' rfc822NameExpr ')')
	;
hexBinaryExpr
	: HEXBINARY_TOK '(' stringExpr ')'
	| hexBinaryBag '.' ONEANDONLY_TOK '(' ')'
	;

stringBag
	: STRING_TOK STRING_CONSTANT_LIST
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' stringBag ',' stringBag	')'
	;
anyUriBag
	: ANYURI_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' anyUriExpr ( ',' anyUriExpr)+ ')'
	;
base64BinaryBag
	: ((BASE64BINARY_TOK) => BASE64BINARY_TOK STRING_CONSTANT_LIST)
//	| BAG_TOK '(' base64BinaryExpr ( ',' base64BinaryExpr )+ ')'
//	| INTERSECTION_TOK '(' base64BinaryBag ',' base64BinaryBag ')'
//	| UNION_TOK '(' base64BinaryBag ',' base64BinaryBag ')'
	;
booleanBag
	: (BOOLEAN_TOK) => BOOLEAN_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' booleanExpr ( ',' booleanExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' booleanBag',' booleanBag	')'
	;
dateBag
	: ((DATE_TOK)=> DATE_TOK STRING_CONSTANT_LIST)
//	| (BAG_TOK)=> BAG_TOK '(' dateExpr ( ',' dateExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' dateBag	',' dateBag	')'
	;
dateTimeBag
	: ((DATETIME_TOK)=> DATETIME_TOK STRING_CONSTANT_LIST)
//	| BAG_TOK '(' dateTimeExpr ( ',' dateTimeExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' dateTimeBag ',' dateTimeBag	')'
	;
dayTimeDurationBag
	: ((DAYTIMEDURATION_TOK) => DAYTIMEDURATION_TOK STRING_CONSTANT_LIST)
//	| BAG_TOK '(' dayTimeDurationExpr ( ',' dayTimeDurationExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' dayTimeDurationBag ',' dayTimeDurationBag	')'
	;
integerBag
	: (INTEGER_TOK) => INTEGER_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' integerExpr ( ',' integerExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' integerBag ',' integerBag	')'
	;
doubleBag
	: (DOUBLE_TOK) => DOUBLE_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' doubleExpr ( ',' doubleExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' dayTimeDurationBag ',' dayTimeDurationBag	')'
	;
hexBinaryBag
	: (HEXBINARY_TOK) => HEXBINARY_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' hexBinaryExpr (',' hexBinaryExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' hexBinaryBag ',' hexBinaryBag	')'
	;
rfc822NameBag
	: (RFC822NAME_TOK) => RFC822NAME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' rfc822NameExpr ( ',' rfc822NameExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' rfc822NameBag ',' rfc822NameBag	')'
	;
timeBag
	: (TIME_TOK)=> TIME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' timeExpr ( ',' timeExpr )+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' timeBag ',' timeBag	')'
	;
x500NameBag
	: (X500NAME_TOK) => X500NAME_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' x500NameExpr ( ',' x500NameExpr )+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' x500NameBag ',' x500NameBag	')'
	;
yearMonthDurationBag
	: (YEARMONTHDURATION_TOK) => YEARMONTHDURATION_TOK STRING_CONSTANT_LIST
//	| BAG_TOK '(' yearMonthDurationExpr ( ',' yearMonthDurationExpr)+ ')'
//	| ( INTERSECTION_TOK | UNION_TOK ) '(' yearMonthDurationBag	 ',' yearMonthDurationBag		')'
	;

// anyExpr
// : booleanExpr | integerExpr | doubleExpr | stringExpr | anyUriExpr | dateExpr
//	| timeExpr | dateTimeExpr | base64BinaryExpr | dayTimeDurationExpr
//	| yearMonthDurationExpr  | x500NameExpr
//	| rfc822NameExpr | hexBinaryExpr
//	;

anyBag
	: booleanBag | integerBag | doubleBag | stringBag | anyUriBag | dateBag
	| timeBag | dateTimeBag | base64BinaryBag | dayTimeDurationBag
	| yearMonthDurationBag  | x500NameBag
	| rfc822NameBag | hexBinaryBag
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

fragment STRING_CONSTANT_LIST
	: '(' STRING_CONSTANT ( ',' STRING_CONSTANT )* ')'
	;

fragment STRING_CONSTANT
	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	;

fragment INTEGER_CONSTANT
	:	('0'..'9')+
	;

fragment DOUBLE_CONSTANT
	:	INTEGER_CONSTANT? '.' INTEGER_CONSTANT? EXPONENT
	|	 INTEGER_CONSTANT EXPONENT
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

fragment SIGN
		:	 ('+'|'-')
		;

fragment CHAR
	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
	;


/*
 HiOrdBagFunction
	: ANYOF_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| ALLOF_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| ANYOFANY_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| ANYOFALL_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| ALLOFANY_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| ALLOFALL_TOK '(' boolFunctionExpr ',' anyExpr ',' anyBag ')'
	| MAP_TOK '(' typeFunctionExpr ',' anyBag ')'
	;

boolFunctionExpr
	: 'boolFunctionExpr()'
	;

typeFunctionExpr
	: 'typeFunctionExpr()'
	;
*/
