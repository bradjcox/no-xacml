package noxacml.xacml2;

import noxacml.util.Fault;

public class Xacml2Types
{
	public Type getType(String noxName)
	{
		Type t = Type.valueOf(noxName);
		if (t == null)
			throw new Fault("Type not found: "+noxName);
		return t;
	}
	public Function getFunction(String noxName, Type type)
	{
		return null;
	}

	public static enum Type
	{
		ToDoBag(null, new Function[] {}),
		ToDo(Type.ToDoBag, new Function[] {
				Function.not,
				Function.and,
				Function.or,

				Function.map,
				Function.nOf,
				Function.floor,
				Function.round,

				Function.allOf,
				Function.allOfAll,
				Function.allOfAny,
				Function.anyOf,
				Function.anyOfAll,
				Function.anyOfAny,

				Function.xpathNodeCount,
				Function.xpathNodeEqual,
				Function.xpathNodeMatch,

				Function.regexpStringMatch,
				Function.dnsNameRegexpMatch,
				Function.ipAddressRegexpMatch,
				Function.urlStringConcatenate,
		}),
		AnyURIBag(null, new Function[] {
				Function.anyURIBag,
				Function.anyURIBagSize,
				Function.anyURIAtLeastOneMemberOf,
				Function.anyURIIntersection,
				Function.anyURIOneAndOnly,
				Function.anyURISetEquals,
				Function.anyURISubset,
				Function.anyURIUnion,
		}),
		AnyURI(Type.AnyURIBag, new Function[] {
				Function.anyURIEqual,
				Function.anyURIIsIn,
				Function.anyURIRegexpMatch,
		}),
		Base64BinaryBag(null, new Function[] {
				Function.base64BinaryBag,
				Function.base64BinaryBagSize,
				Function.base64BinaryAtLeastOneMemberOf,
				Function.base64BinaryIntersection,
				Function.base64BinaryOneAndOnly,
				Function.base64BinarySetEquals,
				Function.base64BinarySubset,
				Function.base64BinaryUnion,
		}),
		Base64Binary(Type.Base64BinaryBag, new Function[] {
				Function.base64BinaryEqual,
				Function.base64BinaryIsIn,
		}),
		DayTimeDurationBag(null, new Function[] {
				Function.dayTimeDurationBag,
				Function.dayTimeDurationBagSize,
		}),
		DayTimeDuration(Type.DayTimeDurationBag, new Function[] {
				Function.dayTimeDurationEqual,
				Function.dayTimeDurationIsIn,
				Function.dayTimeDurationOneAndOnly,
		}),
		HexBinaryBag(null, new Function[] {
				Function.hexBinaryBag,
				Function.hexBinaryBagSize,
				Function.hexBinaryIntersection,
				Function.hexBinaryOneAndOnly,
				Function.hexBinarySetEquals,
				Function.hexBinarySubset,
				Function.hexBinaryUnion,
		}),
		HexBinary(Type.HexBinaryBag, new Function[] {
				Function.hexBinaryAtLeastOneMemberOf,
				Function.hexBinaryEqual,
				Function.hexBinaryIsIn,
		}),
		Rfc822NameBag(null, new Function[] {
				Function.rfc822NameBag,
				Function.rfc822NameBagSize,
				Function.rfc822NameIntersection,
				Function.rfc822NameOneAndOnly,
				Function.rfc822NameSetEquals,
				Function.rfc822NameSubset,
				Function.rfc822NameUnion,
		}),
		Rfc822Name(Type.Rfc822NameBag, new Function[] {
				Function.rfc822NameAtLeastOneMemberOf,
				Function.rfc822NameEqual,
				Function.rfc822NameIsIn,
				Function.rfc822NameMatch,
				Function.rfc822NameRegexpMatch,
		}),
		Rfc892NameBag(null, new Function[] {
				Function.rfc892NameBag,
				Function.rfc892NameBagSize,
				Function.rfc892NameOneAndOnly,
		}),
		Rfc892Name(Type.Rfc892NameBag, new Function[] {
				Function.rfc892NameIsIn,
		}),
		DateBag(null, new Function[] {
				Function.dateBag,
				Function.dateBagSize,
				Function.dateIntersection,
				Function.dateOneAndOnly,
				Function.dateSetEquals,
				Function.dateSubset,
				Function.dateUnion,
		}),
		Date(Type.DateBag, new Function[] {
				Function.dateAddYearMonthDuration,
				Function.dateAtLeastOneMemberOf,
				Function.dateEqual,
				Function.dateGreaterThan,
				Function.dateGreaterThanOrEqual,
				Function.dateIsIn,
				Function.dateLessThan,
				Function.dateLessThanOrEqual,
				Function.dateSubtractYearMonthDuration,
		}),
		DateTimeBag(null, new Function[] {
				Function.dateTimeBag,
				Function.dateTimeBagSize,
				Function.dateTimeIntersection,
				Function.dateTimeOneAndOnly,
				Function.dateTimeSetEquals,
				Function.dateTimeSubset,
				Function.dateTimeUnion,
		}),
		DateTime(Type.DateTimeBag, new Function[] {
				Function.dateTimeAddDayTimeDuration,
				Function.dateTimeAddYearMonthDuration,
				Function.dateTimeAtLeastOneMemberOf,
				Function.dateTimeEqual,
				Function.dateTimeGreaterThan,
				Function.dateTimeGreaterThanOrEqual,
				Function.dateTimeIsIn,
				Function.dateTimeLessThan,
				Function.dateTimeLessThanOrEqual,
				Function.dateTimeSubtractDayTimeDuration,
				Function.dateTimeSubtractYearMonthDuration,
		}),
		TimeBag(null, new Function[] {
				Function.timeBag,
				Function.timeBagSize,
				Function.timeIntersection,
				Function.timeSetEquals,
				Function.timeSubset,
				Function.timeUnion,
				Function.timeOneAndOnly,
		}),
		Time(Type.TimeBag, new Function[] {
				Function.timeAtLeastOneMemberOf,
				Function.timeEqual,
				Function.timeGreaterThan,
				Function.timeGreaterThanOrEqual,
				Function.timeInRange,
				Function.timeIsIn,
				Function.timeLessThan,
				Function.timeLessThanOrEqual,
		}),
		X500NameBag(null, new Function[] {
				Function.x500NameBag,
				Function.x500NameBagSize,
				Function.x500NameIntersection,
				Function.x500NameOneAndOnly,
				Function.x500NameSetEquals,
				Function.x500NameSubset,
				Function.x500NameUnion,
		}),
		X500Name(Type.X500NameBag, new Function[] {
				Function.x500NameAtLeastOneMemberOf,
				Function.x500NameEqual,
				Function.x500NameIsIn,
				Function.x500NameMatch,
				Function.x500NameRegexpMatch,
		}),
		BooleanBag(null, new Function[] {
				Function.booleanBag,
				Function.booleanBagSize,
				Function.booleanAtLeastOneMemberOf,
				Function.booleanIntersection,
				Function.booleanOneAndOnly,
				Function.booleanSetEquals,
				Function.booleanSubset,
				Function.booleanUnion,
		}),
		Boolean(Type.BooleanBag, new Function[] {
				Function.booleanEqual,
				Function.booleanIsIn,
		}),
		DoubleBag(null, new Function[] {
				Function.doubleBag,
				Function.doubleBagSize,
				Function.doubleIntersection,
				Function.doubleOneAndOnly,
				Function.doubleSetEquals,
				Function.doubleSubset,
				Function.doubleUnion,
		}),
		Double(Type.DoubleBag, new Function[] {
				Function.doubleAbs,
				Function.doubleAdd,
				Function.doubleAtLeastOneMemberOf,
				Function.doubleDivide,
				Function.doubleEqual,
				Function.doubleGreaterThan,
				Function.doubleGreaterThanOrEqual,
				Function.doubleIsIn,
				Function.doubleLessThan,
				Function.doubleLessThanOrEqual,
				Function.doubleMultiply,
				Function.doubleSubtract,
				Function.doubleToInteger,
		}),
		IntegerBag(null, new Function[] {
				Function.integerBag,
				Function.integerBagSize,
				Function.integerIntersection,
				Function.integerOneAndOnly,
				Function.integerSetEquals,
				Function.integerSubset,
				Function.integerUnion,
		}),
		Integer(Type.IntegerBag, new Function[] {
				Function.integerAbs,
				Function.integerAdd,
				Function.integerAtLeastOneMemberOf,
				Function.integerDivide,
				Function.integerEqual,
				Function.integerGreaterThan,
				Function.integerGreaterThanOrEqual,
				Function.integerIsIn,
				Function.integerLessThan,
				Function.integerLessThanOrEqual,
				Function.integerMod,
				Function.integerMultiply,
				Function.integerSubtract,
				Function.integerToDouble,
		}),
		StringBag(null, new Function[] {
				Function.stringBag,
				Function.stringBagSize,
				Function.stringIntersection,
				Function.stringOneAndOnly,
				Function.stringSetEquals,
				Function.stringSubset,
				Function.stringUnion,
		}),
		String(Type.StringBag, new Function[] {
				Function.stringAtLeastOneMemberOf,
				Function.stringEqual,
				Function.stringGreaterThan,
				Function.stringGreaterThanOrEqual,
				Function.stringIsIn,
				Function.stringLessThan,
				Function.stringLessThanOrEqual,
				Function.stringNormalizeSpace,
				Function.stringNormalizeToLowerCase,
				Function.stringRegexpMatch,
				Function.stringConcatenate,
		}),
		YearMonthDurationBag(null, new Function[] {
				Function.yearMonthDurationBag,
				Function.yearMonthDurationBagSize,
		}),
		YearMonthDuration(Type.YearMonthDurationBag, new Function[] {
				Function.yearMonthDurationEqual,
				Function.yearMonthDurationIsIn,
				Function.yearMonthDurationOneAndOnly,
		});

		final Type type;
		final Function[] functions;

		Type(Type type, Function[] functions)
		{
			this.type = type;
			this.functions = functions;
		}

	}
	public static enum Function
	{
		not( "not", "urn:oasis:names:tc:xacml:1.0:function:not", Type.Boolean, new Type[] { Type.Boolean }),
		allOf( "allOf", "urn:oasis:names:tc:xacml:1.0:function:all-of", Type.Boolean, new Type[] { Type.ToDo }),
		allOfAll( "allOfAll", "urn:oasis:names:tc:xacml:1.0:function:all-of-all", Type.Boolean, new Type[] { Type.ToDo }),
		allOfAny( "allOfAny", "urn:oasis:names:tc:xacml:1.0:function:all-of-any", Type.Boolean, new Type[] { Type.ToDo }),
		and( "and", "urn:oasis:names:tc:xacml:1.0:function:and", Type.Boolean, new Type[] { Type.Boolean }),
		anyOf( "anyOf", "urn:oasis:names:tc:xacml:1.0:function:any-of", Type.Boolean, new Type[] { Type.ToDo }),
		anyOfAll( "anyOfAll", "urn:oasis:names:tc:xacml:1.0:function:any-of-all", Type.Boolean, new Type[] { Type.ToDo }),
		anyOfAny( "anyOfAny", "urn:oasis:names:tc:xacml:1.0:function:any-of-any", Type.Boolean, new Type[] { Type.ToDo }),
		anyURIAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:anyURI-at-least-one-member-of", Type.Boolean, new Type[] { Type.AnyURI }),
		anyURIBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:anyURI-bag", Type.AnyURIBag, new Type[] { Type.AnyURI }),
		anyURIBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:anyURI-bag-size", Type.Integer, new Type[] { Type.AnyURIBag }),
		anyURIEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", Type.Boolean, new Type[] { Type.AnyURI }),
		anyURIIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:anyURI-intersection", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		anyURIIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in", Type.Boolean, new Type[] { Type.AnyURIBag }),
		anyURIOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:anyURI-one-and-only", Type.AnyURI, new Type[] { Type.AnyURIBag }),
		anyURISetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:anyURI-set-equals", Type.Boolean, new Type[] { Type.AnyURIBag }),
		anyURISubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:anyURI-subset", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		anyURIUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:anyURI-union", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		base64BinaryAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-at-least-one-member-of", Type.Boolean, new Type[] { Type.Base64Binary }),
		base64BinaryBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag", Type.Base64BinaryBag, new Type[] { Type.Base64BinaryBag }),
		base64BinaryBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag-size", Type.Integer, new Type[] { Type.Base64BinaryBag }),
		base64BinaryEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal", Type.Boolean, new Type[] { Type.Base64Binary }),
		base64BinaryIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-intersection", Type.Base64BinaryBag, new Type[] { Type.Base64BinaryBag }),
		base64BinaryIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in", Type.Boolean, new Type[] { Type.Base64BinaryBag }),
		base64BinaryOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-one-and-only", Type.Base64Binary, new Type[] { Type.Base64BinaryBag }),
		base64BinarySetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-set-equals", Type.Boolean, new Type[] { Type.Base64BinaryBag }),
		base64BinarySubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-subset", Type.Boolean, new Type[] { Type.Base64BinaryBag }),
		base64BinaryUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:base64Binary-union", Type.Base64BinaryBag, new Type[] { Type.Base64BinaryBag }),
		booleanAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:boolean-at-least-one-member-of", Type.Boolean, new Type[] { Type.Boolean }),
		booleanBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:boolean-bag", Type.BooleanBag, new Type[] { Type.String }),
		booleanBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:boolean-bag-size", Type.Integer, new Type[] { Type.BooleanBag }),
		booleanEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:boolean-equal", Type.Boolean, new Type[] { Type.Boolean }),
		booleanIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:boolean-intersection", Type.BooleanBag, new Type[] { Type.BooleanBag }),
		booleanIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:boolean-is-in", Type.Boolean, new Type[] { Type.Boolean }),
		booleanOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:boolean-one-and-only", Type.Boolean, new Type[] { Type.BooleanBag }),
		booleanOneBagSize( "oneBagSize", "urn:oasis:names:tc:xacml:1.0:function:boolean-one-bag-size", Type.Boolean, new Type[] { Type.BooleanBag }),
		booleanSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:boolean-set-equals", Type.Boolean, new Type[] { Type.BooleanBag }),
		booleanSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:boolean-subset", Type.Boolean, new Type[] { Type.BooleanBag }),
		booleanUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:boolean-union", Type.BooleanBag, new Type[] { Type.BooleanBag }),
		dateAddYearMonthDuration( "addYearMonthDuration", "urn:oasis:names:tc:xacml:1.0:function:date-add-yearMonthDuration", Type.Date, new Type[] { Type.Date }),
		dateAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:date-at-least-one-member-of", Type.Boolean, new Type[] { Type.DateBag }),
		dateBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:date-bag", Type.DateBag, new Type[] { Type.String }),
		dateBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:date-bag-size", Type.Integer, new Type[] { Type.DateBag }),
		dateEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:date-equal", Type.Boolean, new Type[] { Type.Date }),
		dateGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:date-greater-than", Type.Boolean, new Type[] { Type.Date }),
		dateGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal", Type.Boolean, new Type[] { Type.Date }),
		dateIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:date-intersection", Type.DateBag, new Type[] { Type.DateBag }),
		dateIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:date-is-in", Type.Boolean, new Type[] { Type.Date }),
		dateLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:date-less-than", Type.Boolean, new Type[] { Type.Date }),
		dateLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal", Type.Boolean, new Type[] { Type.Date }),
		dateOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:date-one-and-only", Type.Date, new Type[] { Type.DateBag }),
		dateSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:date-set-equals", Type.Boolean, new Type[] { Type.DateBag }),
		dateSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:date-subset", Type.Boolean, new Type[] { Type.DateBag }),
		dateSubtractYearMonthDuration( "subtractYearMonthDuration", "urn:oasis:names:tc:xacml:1.0:function:date-subtract-yearMonthDuration", Type.Date, new Type[] { Type.Date }),
		dateUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:date-union", Type.DateBag, new Type[] { Type.DateBag }),
		dateTimeAddDayTimeDuration( "addDayTimeDuration", "urn:oasis:names:tc:xacml:1.0:function:dateTime-add-dayTimeDuration", Type.DateTime, new Type[] { Type.DateTime }),
		dateTimeAddYearMonthDuration( "addYearMonthDuration", "urn:oasis:names:tc:xacml:1.0:function:dateTime-add-yearMonthDuration", Type.DateTime, new Type[] { Type.DateTime }),
		dateTimeAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:dateTime-at-least-one-member-of", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:dateTime-bag", Type.DateTimeBag, new Type[] { Type.String }),
		dateTimeBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:dateTime-bag-size", Type.Integer, new Type[] { Type.DateTimeBag }),
		dateTimeEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:dateTime-equal", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:dateTime-intersection", Type.DateTimeBag, new Type[] { Type.DateTimeBag }),
		dateTimeIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal", Type.Boolean, new Type[] { Type.DateTime }),
		dateTimeOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:dateTime-one-and-only", Type.DateTime, new Type[] { Type.DateTimeBag }),
		dateTimeSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:dateTime-set-equals", Type.Boolean, new Type[] { Type.DateTimeBag }),
		dateTimeSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:dateTime-subset", Type.Boolean, new Type[] { Type.DateTimeBag }),
		dateTimeSubtractDayTimeDuration( "subtractDayTimeDuration", "urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-dayTimeDuration", Type.DateTime, new Type[] { Type.DateTime }),
		dateTimeSubtractYearMonthDuration( "subtractYearMonthDuration", "urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-yearMonthDuration", Type.DateTime, new Type[] { Type.DateTime }),
		dateTimeUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:dateTime-union", Type.DateTimeBag, new Type[] { Type.DateTimeBag }),
		dayTimeDurationBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag", Type.DayTimeDurationBag, new Type[] { Type.String }),
		dayTimeDurationBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag-size", Type.Integer, new Type[] { Type.DayTimeDurationBag }),
		dayTimeDurationEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-equal", Type.Boolean, new Type[] { Type.DayTimeDuration }),
		dayTimeDurationIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-is-in", Type.Boolean, new Type[] { Type.DayTimeDuration }),
		dayTimeDurationOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-one-and-only", Type.DayTimeDuration, new Type[] { Type.DayTimeDurationBag }),
		doubleAbs( "abs", "urn:oasis:names:tc:xacml:1.0:function:double-abs", Type.Double, new Type[] { Type.Double }),
		doubleAdd( "add", "urn:oasis:names:tc:xacml:1.0:function:double-add", Type.Double, new Type[] { Type.Double }),
		doubleAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:double-at-least-one-member-of", Type.Boolean, new Type[] { Type.DoubleBag }),
		doubleBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:double-bag", Type.DoubleBag, new Type[] { Type.String }),
		doubleBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:double-bag-size", Type.Integer, new Type[] { Type.DoubleBag }),
		doubleDivide( "divide", "urn:oasis:names:tc:xacml:1.0:function:double-divide", Type.Double, new Type[] { Type.Double }),
		doubleEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:double-equal", Type.Boolean, new Type[] { Type.Double }),
		doubleGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:double-greater-than", Type.Boolean, new Type[] { Type.Double }),
		doubleGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal", Type.Boolean, new Type[] { Type.Double }),
		doubleIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:double-intersection", Type.DoubleBag, new Type[] { Type.DoubleBag }),
		doubleIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:double-is-in", Type.Boolean, new Type[] { Type.Double }),
		doubleLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:double-less-than", Type.Boolean, new Type[] { Type.Double }),
		doubleLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal", Type.Boolean, new Type[] { Type.Double }),
		doubleMultiply( "multiply", "urn:oasis:names:tc:xacml:1.0:function:double-multiply", Type.Double, new Type[] { Type.Double }),
		doubleOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:double-one-and-only", Type.Double, new Type[] { Type.DoubleBag }),
		doubleSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:double-set-equals", Type.Boolean, new Type[] { Type.DoubleBag }),
		doubleSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:double-subset", Type.Boolean, new Type[] { Type.DoubleBag }),
		doubleSubtract( "subtract", "urn:oasis:names:tc:xacml:1.0:function:double-subtract", Type.Double, new Type[] { Type.Double }),
		doubleToInteger( "toInteger", "urn:oasis:names:tc:xacml:1.0:function:double-to-integer", Type.Integer, new Type[] { Type.Double }),
		doubleUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:double-union", Type.DoubleBag, new Type[] { Type.DoubleBag }),
		floor( "floor", "urn:oasis:names:tc:xacml:1.0:function:floor", Type.Double, new Type[] { Type.Double }),
		hexBinaryAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-at-least-one-member-of", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		hexBinaryBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag", Type.HexBinaryBag, new Type[] { Type.HexBinaryBag }),
		hexBinaryBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag-size", Type.Integer, new Type[] { Type.HexBinary }),
		hexBinaryEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal", Type.Boolean, new Type[] { Type.HexBinary }),
		hexBinaryIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-intersection", Type.HexBinaryBag, new Type[] { Type.HexBinaryBag }),
		hexBinaryIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in", Type.Boolean, new Type[] { Type.HexBinary }),
		hexBinaryOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-one-and-only", Type.HexBinary, new Type[] { Type.HexBinaryBag }),
		hexBinarySetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-set-equals", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		hexBinarySubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-subset", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		hexBinaryUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:hexBinary-union", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		integerAbs( "abs", "urn:oasis:names:tc:xacml:1.0:function:integer-abs", Type.Integer, new Type[] { Type.Integer }),
		integerAdd( "add", "urn:oasis:names:tc:xacml:1.0:function:integer-add", Type.Integer, new Type[] { Type.Integer }),
		integerAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:integer-at-least-one-member-of", Type.Boolean, new Type[] { Type.IntegerBag }),
		integerBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:integer-bag", Type.IntegerBag, new Type[] { Type.String }),
		integerBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:integer-bag-size", Type.Integer, new Type[] { Type.IntegerBag }),
		integerDivide( "divide", "urn:oasis:names:tc:xacml:1.0:function:integer-divide", Type.Integer, new Type[] { Type.Integer }),
		integerEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:integer-equal", Type.Boolean, new Type[] { Type.Integer }),
		integerGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than", Type.Boolean, new Type[] { Type.Integer }),
		integerGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal", Type.Boolean, new Type[] { Type.Integer }),
		integerIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:integer-intersection", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		integerIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:integer-is-in", Type.IntegerBag, new Type[] { Type.Integer }),
		integerLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:integer-less-than", Type.Boolean, new Type[] { Type.Integer }),
		integerLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal", Type.Boolean, new Type[] { Type.Integer }),
		integerMod( "mod", "urn:oasis:names:tc:xacml:1.0:function:integer-mod", Type.Integer, new Type[] { Type.Integer }),
		integerMultiply( "multiply", "urn:oasis:names:tc:xacml:1.0:function:integer-multiply", Type.Integer, new Type[] { Type.Integer }),
		integerOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:integer-one-and-only", Type.Integer, new Type[] { Type.IntegerBag }),
		integerSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:integer-set-equals", Type.Boolean, new Type[] { Type.IntegerBag }),
		integerSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:integer-subset", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		integerSubtract( "subtract", "urn:oasis:names:tc:xacml:1.0:function:integer-subtract", Type.Integer, new Type[] { Type.Integer }),
		integerToDouble( "toDouble", "urn:oasis:names:tc:xacml:1.0:function:integer-to-double", Type.Double, new Type[] { Type.Integer }),
		integerUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:integer-union", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		map( "map", "urn:oasis:names:tc:xacml:1.0:function:map", Type.ToDo, new Type[] { Type.ToDo }),
		nOf( "of", "urn:oasis:names:tc:xacml:1.0:function:n-of", Type.ToDo, new Type[] { Type.ToDo }),
		or( "or", "urn:oasis:names:tc:xacml:1.0:function:or", Type.Boolean, new Type[] { Type.ToDo }),
		regexpStringMatch( "stringMatch", "urn:oasis:names:tc:xacml:1.0:function:regexp-string-match", Type.Boolean, new Type[] { Type.String }),
		rfc822NameAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-at-least-one-member-of", Type.Boolean, new Type[] { Type.Rfc822Name }),
		rfc822NameBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag", Type.Rfc822NameBag, new Type[] { Type.String }),
		rfc822NameBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag-size", Type.Integer, new Type[] { Type.Rfc822NameBag }),
		rfc822NameEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal", Type.Boolean, new Type[] { Type.Rfc822Name }),
		rfc822NameIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-intersection", Type.Rfc822NameBag, new Type[] { Type.Rfc822NameBag }),
		rfc822NameIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in", Type.Boolean, new Type[] { Type.Rfc822Name }),
		rfc822NameMatch( "match", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-match", Type.Boolean, new Type[] { Type.Rfc822Name }),
		rfc822NameOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-one-and-only", Type.Rfc822Name, new Type[] { Type.Rfc822NameBag }),
		rfc822NameSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-set-equals", Type.Boolean, new Type[] { Type.Rfc822NameBag }),
		rfc822NameSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-subset", Type.Boolean, new Type[] { Type.Rfc822NameBag }),
		rfc822NameUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-union", Type.Rfc822NameBag, new Type[] { Type.Rfc822NameBag }),
		rfc892NameBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-bag", Type.Rfc822NameBag, new Type[] { Type.String }),
		rfc892NameBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-bag-size", Type.Integer, new Type[] { Type.Rfc892NameBag }),
		rfc892NameIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-is-in", Type.Boolean, new Type[] { Type.Rfc892Name }),
		rfc892NameOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-one-and-only", Type.Rfc822Name, new Type[] { Type.Rfc892NameBag }),
		round( "round", "urn:oasis:names:tc:xacml:1.0:function:round", Type.Double, new Type[] { Type.Double }),
		stringAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:string-at-least-one-member-of", Type.Boolean, new Type[] { Type.String }),
		stringBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:string-bag", Type.StringBag, new Type[] { Type.String }),
		stringBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:string-bag-size", Type.Integer, new Type[] { Type.StringBag }),
		stringEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:string-equal", Type.Boolean, new Type[] { Type.String }),
		stringGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:string-greater-than", Type.Boolean, new Type[] { Type.String }),
		stringGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal", Type.Boolean, new Type[] { Type.String }),
		stringIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:string-intersection", Type.StringBag, new Type[] { Type.StringBag }),
		stringIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:string-is-in", Type.Boolean, new Type[] { Type.String }),
		stringLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:string-less-than", Type.Boolean, new Type[] { Type.String }),
		stringLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal", Type.Boolean, new Type[] { Type.String }),
		stringNormalizeSpace( "normalizeSpace", "urn:oasis:names:tc:xacml:1.0:function:string-normalize-space", Type.String, new Type[] { Type.String }),
		stringNormalizeToLowerCase( "normalizeToLowerCase", "urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case", Type.String, new Type[] { Type.String }),
		stringOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:string-one-and-only", Type.String, new Type[] { Type.StringBag }),
		stringRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:1.0:function:string-regexp-match", Type.Boolean, new Type[] { Type.String }),
		stringSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:string-set-equals", Type.Boolean, new Type[] { Type.StringBag }),
		stringSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:string-subset", Type.Boolean, new Type[] { Type.StringBag }),
		stringUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:string-union", Type.StringBag, new Type[] { Type.StringBag }),
		timeAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:time-at-least-one-member-of", Type.Boolean, new Type[] { Type.Time }),
		timeBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:time-bag", Type.TimeBag, new Type[] { Type.Time }),
		timeBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:time-bag-size", Type.Integer, new Type[] { Type.String }),
		timeEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:time-equal", Type.Boolean, new Type[] { Type.Time }),
		timeGreaterThan( "greaterThan", "urn:oasis:names:tc:xacml:1.0:function:time-greater-than", Type.Boolean, new Type[] { Type.Time }),
		timeGreaterThanOrEqual( "greaterThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal", Type.Boolean, new Type[] { Type.Time }),
		timeInRange( "inRange", "urn:oasis:names:tc:xacml:1.0:function:time-in-range", Type.Boolean, new Type[] { Type.Time }),
		timeIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:time-intersection", Type.TimeBag, new Type[] { Type.TimeBag }),
		timeIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:time-is-in", Type.Boolean, new Type[] { Type.Time }),
		timeLessThan( "lessThan", "urn:oasis:names:tc:xacml:1.0:function:time-less-than", Type.Boolean, new Type[] { Type.Time }),
		timeLessThanOrEqual( "lessThanOrEqual", "urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal", Type.Boolean, new Type[] { Type.Time }),
		timeSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:time-set-equals", Type.Boolean, new Type[] { Type.Time }),
		timeSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:time-subset", Type.Boolean, new Type[] { Type.TimeBag }),
		timeUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:time-union", Type.TimeBag, new Type[] { Type.TimeBag }),
		x500NameAtLeastOneMemberOf( "atLeastOneMemberOf", "urn:oasis:names:tc:xacml:1.0:function:x500Name-at-least-one-member-of", Type.Boolean, new Type[] { Type.X500Name }),
		x500NameBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:x500Name-bag", Type.X500NameBag, new Type[] { Type.String }),
		x500NameBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:x500Name-bag-size", Type.Integer, new Type[] { Type.X500NameBag }),
		x500NameEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:x500Name-equal", Type.Boolean, new Type[] { Type.X500Name }),
		x500NameIntersection( "intersection", "urn:oasis:names:tc:xacml:1.0:function:x500Name-intersection", Type.X500NameBag, new Type[] { Type.X500NameBag }),
		x500NameIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in", Type.Boolean, new Type[] { Type.X500Name }),
		x500NameMatch( "match", "urn:oasis:names:tc:xacml:1.0:function:x500Name-match", Type.Boolean, new Type[] { Type.X500Name }),
		x500NameOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:x500Name-one-and-only", Type.X500Name, new Type[] { Type.X500NameBag }),
		x500NameSetEquals( "setEquals", "urn:oasis:names:tc:xacml:1.0:function:x500Name-set-equals", Type.Boolean, new Type[] { Type.X500NameBag }),
		x500NameSubset( "subset", "urn:oasis:names:tc:xacml:1.0:function:x500Name-subset", Type.Boolean, new Type[] { Type.X500NameBag }),
		x500NameUnion( "union", "urn:oasis:names:tc:xacml:1.0:function:x500Name-union", Type.BooleanBag, new Type[] { Type.X500NameBag }),
		xpathNodeCount( "nodeCount", "urn:oasis:names:tc:xacml:1.0:function:xpath-node-count", Type.Integer, new Type[] { Type.ToDo}),
		xpathNodeEqual( "nodeEqual", "urn:oasis:names:tc:xacml:1.0:function:xpath-node-equal", Type.Boolean, new Type[] { Type.ToDo }),
		xpathNodeMatch( "nodeMatch", "urn:oasis:names:tc:xacml:1.0:function:xpath-node-match", Type.Boolean, new Type[] { Type.ToDo }),
		yearMonthDurationBag( "bag", "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag", Type.YearMonthDurationBag, new Type[] { Type.String }),
		yearMonthDurationBagSize( "bagSize", "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag-size", Type.Integer, new Type[] { Type.YearMonthDurationBag }),
		yearMonthDurationEqual( "equal", "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-equal", Type.Boolean, new Type[] { Type.YearMonthDuration }),
		yearMonthDurationIsIn( "isIn", "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-is-in", Type.Boolean, new Type[] { Type.YearMonthDuration }),
		yearMonthDurationOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-one-and-only", Type.YearMonthDuration, new Type[] { Type.YearMonthDurationBag }),
		anyURIRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:2.0:function:anyURI-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		dnsNameRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:2.0:function:dnsName-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		ipAddressRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:2.0:function:ipAddress-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		rfc822NameRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:2.0:function:rfc822Name-regexp-match", Type.Boolean, new Type[] { Type.Rfc822Name }),
		stringConcatenate( "concatenate", "urn:oasis:names:tc:xacml:2.0:function:string-concatenate", Type.String, new Type[] { Type.String }),
		urlStringConcatenate( "stringConcatenate", "urn:oasis:names:tc:xacml:2.0:function:url-string-concatenate", Type.String, new Type[] { Type.String }),
		x500NameRegexpMatch( "regexpMatch", "urn:oasis:names:tc:xacml:2.0:function:x500Name-regexp-match", Type.Boolean, new Type[] { Type.X500Name }),
		timeOneAndOnly( "oneAndOnly", "urn:oasis:names:tc:xacml:1.0:function:time-one-and-only", Type.Time, new Type[] { Type.TimeBag });

		final String name;
		final String uri;
		final Type returnType;
		final Type[] argumentTypes;

		Function(String name, String uri, Type returnType, Type[] argumentTypes)
		{
			this.name = name;
			this.uri = uri;
			this.returnType = returnType;
			this.argumentTypes = argumentTypes;
		}
	}
}
