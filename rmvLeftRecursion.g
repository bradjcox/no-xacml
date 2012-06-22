boolExpr
	: (TRUE_TOK
	| FALSE_TOK
	| BOOL_TOK '(' ATTRIBUTE ')'
	| '(' integerExpr ( '=='
	| '>=' | '>' | '<' | '<=' ) integerExpr ')'
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
	|  '(' base64BinaryExpr ( '==' | '>=' | '>' | '<' | '<=' ) base64BinaryExpr ')'
	|  ( NOF_TOK | NOT_TOK) '(' boolExpr ')'
//	| ISIN_TOK
//	'('
//		( boolExpr ',' booleanBag )
//		| (integerExpr ',' integerBag )
//		| (doubleExpr ',' doubleBag )
//		| (stringExpr ',' stringBag )
//		| (anyUriExpr ',' anyUriBag )
//		| (dateExpr ',' dateBag )
//		| (timeExpr ',' timeBag )
//		| (dateTimeExpr ',' dateTimeBag )
//		| (base64BinaryExpr ',' base64Bag )
//		| (dayTimeDurationExpr ',' dayTimeDurationBag )
//		| (yearMonthDurationExpr ',' yearMonthDurationBag )
//		| (x500NameExpr ',' x500NameBag )
//		| (rfc822NameExpr ',' rfc822NameBag )
//		| (hexBinaryExpr ',' hexBinaryBag )
//		| (base64Expr ',' base64Bag )
//	')' | integerExpr ISIN_TOK '(' integerBag ')'
	|  doubleExpr ISIN_TOK '(' doubleBag ')'
	|  stringExpr ISIN_TOK '(' stringBag ')'
	|  anyUriExpr ISIN_TOK '(' anyUriBag ')'
	|  dateExpr ISIN_TOK '(' dateBag ')'
	|  timeExpr ISIN_TOK '(' timeBag ')'
	|  dateTimeExpr ISIN_TOK '(' dateTimeBag ')'
	|  base64BinaryExpr ISIN_TOK '(' base64Bag ')'
	|  dayTimeDurationExpr ISIN_TOK '(' dayTimeDurationBag ')'
	|  yearMonthDurationExpr ISIN_TOK '(' yearMonthDurationBag ')'
	|  x500NameExpr ISIN_TOK '(' x500NameBag ')'
	|  rfc822NameExpr ISIN_TOK '(' rfc822NameBag ')'
	|  hexBinaryExpr ISIN_TOK '(' hexBinaryBag ')'
	|  base64Expr ISIN_TOK '(' base64Bag ')'
	|  ( ATLEASTONEMENBEROF_TOK | SUBSET_TOK | SETEQUALS_TOK )
	'('
		( booleanBag ',' booleanBag)
	|  ( integerBag ',' integerBag )
	|  (  doubleBag ',' doubleBag )
	|  (  stringBag ',' stringBag )
	|  (  dateBag ',' dateBag )
	|  (  timeBag ',' timeBag )
	|  (  dateTimeBag ',' dateTimeBag )
	|  (  base64Bag ',' base64Bag )
	|  (  dayTimeDurationBag ',' dayTimeDurationBag )
	|  (  yearMonthDurationBag ',' yearMonthDurationBag )
	|  (  anyUriBag ',' anyUriBag )
	|  (  x500NameBag ',' x500NameBag ) | (  rfc822NameBag ',' rfc822NameBag ) | (  hexBinaryBag ',' hexBinaryBag ) | (  base64Bag ',' base64Bag )
	')' | REGEXMATCH_TOK '(' stringExpr ',' anyExpr ')' | ( NODEEQUAL_TOK | NODEMATCH_TOK ) '(' stringExpr ',' stringExpr ')') (ISIN_TOK '(' booleanBag ')')*
	;

