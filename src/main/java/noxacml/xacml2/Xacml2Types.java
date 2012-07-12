package noxacml.xacml2;

import noxacml.util.Fault;

public class Xacml2Types
{
	public NoxName getNoxName(String name)
	{
		NoxName n = NoxName.valueOf(name);
		return n;
	}
	public Type getType(String typeName)
	{
		Type t = Type.valueOf(typeName);
		if (t == null)
			throw new Fault("Type not found: "+typeName);
		return t;
	}
	public Function getFunction(String name, Type type)
	{
		for (NoxSynonym s: NoxSynonym.values())
		{
			String x = s.synonym;
			if (x.equals(name))
			{
				String n = s.name();
				Function f = this.getFunction(getNoxName(n), type);
				return f;
			}
		}
		Function f = this.getFunction(getNoxName(name), type);
		return f;
	}
	public Function getFunction(NoxName noxName, Type type)
	{
		for (Function f: Function.values())
		{
			if (f.argumentTypes[0] == type && f.noxFunctionName.equals(noxName))
			{
				return f;
			}
		}
		throw new Fault("Function: "+noxName+" not found for type:"+type);
	}

	public enum NoxName
	{
		abs,
		add,
		addDayTimeDuration,
		addYearMonthDuration,
		allOf,
		allOfAll,
		allOfAny,
		and,
		anyOf,
		anyOfAll,
		anyOfAny,
		atLeastOneMemberOf,
		bag,
		bagSize,
		concatenate,
		divide,
		equal,
		floor,
		greaterThan,
		greaterThanOrEqual,
		inRange,
		intersection,
		isIn,
		lessThan,
		lessThanOrEqual,
		map,
		match,
		mod,
		multiply,
		nodeCount,
		nodeEqual,
		nodeMatch,
		normalizeSpace,
		normalizeToLowerCase,
		not,
		of,
		oneAndOnly,
		oneBagSize,
		or,
		regexpMatch,
		round,
		setEquals,
		stringConcatenate,
		stringMatch,
		subset,
		subtract,
		subtractDayTimeDuration,
		subtractYearMonthDuration,
		toDouble,
		toInteger,
		union;

		public String toString()
		{
			return name();
		}
	}

	public enum NoxSynonym
	{
		and("&&"),
		or("||"),
		not("!"),
		mod("%"),
		equal("=="),
		greaterThan(">"),
		greaterThanOrEqual(">="),
		lessThan("<"),
		lessThanOrEqual("<=");

		public final String synonym;

		NoxSynonym(String synonym)
		{
			this.synonym = synonym;
		}
		public String toString()
		{
			return name();
		}
	}

	public enum Type
	{
		ToDoBag(null, null),
		ToDo(Type.ToDoBag, null),

		AnyURIBag(null, null),
		AnyURI(Type.AnyURIBag, "http://www.w3.org/2001/XMLSchema#anyURI"),

		Base64BinaryBag(null, null),
		Base64Binary(Type.Base64BinaryBag, "http://www.w3.org/2001/XMLSchema#base64Binary"),

		DayTimeDurationBag(null, null),
		DayTimeDuration(Type.DayTimeDurationBag, "http://www.w3.org/TR/2002/WD-xquery-operators-20020816#dayTimeDuration"),

		HexBinaryBag(null, null),
		HexBinary(Type.HexBinaryBag, "http://www.w3.org/2001/XMLSchema#hexBinary"),

		Rfc822NameBag(null, null),
		Rfc822Name(Type.Rfc822NameBag, "urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name"),

		Rfc892NameBag(null, null),
		Rfc892Name(Type.Rfc892NameBag, "urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name"),

		DateBag(null, null),
		Date(Type.DateBag, "http://www.w3.org/2001/XMLSchema#date"),

		DateTimeBag(null, null),
		DateTime(Type.DateTimeBag, "http://www.w3.org/2001/XMLSchema#dateTime"),

		TimeBag(null, null),
		Time(Type.TimeBag, "http://www.w3.org/2001/XMLSchema#time"),

		X500NameBag(null, null),
		X500Name(Type.X500NameBag, "urn:oasis:names:tc:xacml:1.0:data-type:x500Name"),

		BooleanBag(null, null),
		Boolean(Type.BooleanBag, "http://www.w3.org/2001/XMLSchema#boolean"),

		DoubleBag(null, null),
		Double(Type.DoubleBag, "http://www.w3.org/2001/XMLSchema#double"),

		IntegerBag(null, null),
		Integer(Type.IntegerBag, "http://www.w3.org/2001/XMLSchema#integer"),

		StringBag(null, null),
		String(Type.StringBag, "http://www.w3.org/2001/XMLSchema#string"),

		YearMonthDurationBag(null, null),
		YearMonthDuration(Type.YearMonthDurationBag, "http://www.w3.org/TR/2002/WD-xquery-operators-20020816#yearMonthDuration"),

		IpAddressBag(null, null),
		IpAddress(Type.IpAddressBag, "urn:oasis:names:tc:xacml:2.0:data-type:ipAddress"),

		DnsNameBag(null, null),
		DnsName(Type.DnsNameBag, "urn:oasis:names:tc:xacml:2.0:data-type:dnsName");

		public final Type type;
		public final String uri;

		Type(Type type, String uri)
		{
			this.type = type;
			this.uri = uri;
		}
		public String toString()
		{
			return name();
		}
	}
	public enum Function
	{
		doubleAbs(NoxName.abs, "urn:oasis:names:tc:xacml:1.0:function:double-abs", Type.Double, new Type[] { Type.Double }),
		integerAbs(NoxName.abs, "urn:oasis:names:tc:xacml:1.0:function:integer-abs", Type.Integer, new Type[] { Type.Integer }),

		doubleAdd(NoxName.add, "urn:oasis:names:tc:xacml:1.0:function:double-add", Type.Double, new Type[] { Type.Double, Type.Double }),
		integerAdd(NoxName.add, "urn:oasis:names:tc:xacml:1.0:function:integer-add", Type.Integer, new Type[] { Type.Integer, Type.Integer }),

		dateTimeAddDayTimeDuration(NoxName.addDayTimeDuration, "urn:oasis:names:tc:xacml:1.0:function:dateTime-add-dayTimeDuration", Type.DateTime, new Type[] { Type.DateTime, Type.DayTimeDuration }),
		dateAddYearMonthDuration(NoxName.addYearMonthDuration, "urn:oasis:names:tc:xacml:1.0:function:date-add-yearMonthDuration", Type.Date, new Type[] { Type.Date, Type.YearMonthDuration }),
		dateTimeAddYearMonthDuration(NoxName.addYearMonthDuration, "urn:oasis:names:tc:xacml:1.0:function:dateTime-add-yearMonthDuration", Type.DateTime, new Type[] { Type.DateTime, Type.YearMonthDuration }),

		allOf(NoxName.allOf, "urn:oasis:names:tc:xacml:1.0:function:all-of", Type.Boolean, new Type[] { Type.ToDo }),
		allOfAll(NoxName.allOfAll, "urn:oasis:names:tc:xacml:1.0:function:all-of-all", Type.Boolean, new Type[] { Type.ToDo }),
		allOfAny(NoxName.allOfAny, "urn:oasis:names:tc:xacml:1.0:function:all-of-any", Type.Boolean, new Type[] { Type.ToDo }),

		and(NoxName.and, "urn:oasis:names:tc:xacml:1.0:function:and", Type.Boolean, new Type[] { Type.Boolean, Type.Boolean }),

		anyOf(NoxName.anyOf, "urn:oasis:names:tc:xacml:1.0:function:any-of", Type.Boolean, new Type[] { Type.ToDo }),
		anyOfAll(NoxName.anyOfAll, "urn:oasis:names:tc:xacml:1.0:function:any-of-all", Type.Boolean, new Type[] { Type.ToDo }),
		anyOfAny(NoxName.anyOfAny, "urn:oasis:names:tc:xacml:1.0:function:any-of-any", Type.Boolean, new Type[] { Type.ToDo }),

		anyURIAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:anyURI-at-least-one-member-of", Type.Boolean, new Type[] { Type.AnyURI }),
		base64BinaryAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-at-least-one-member-of", Type.Boolean, new Type[] { Type.Base64Binary }),
		booleanAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:boolean-at-least-one-member-of", Type.Boolean, new Type[] { Type.Boolean }),
		dateAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:date-at-least-one-member-of", Type.Boolean, new Type[] { Type.DateBag }),
		dateTimeAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:dateTime-at-least-one-member-of", Type.Boolean, new Type[] { Type.DateTime }),
		doubleAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:double-at-least-one-member-of", Type.Boolean, new Type[] { Type.DoubleBag }),
		hexBinaryAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-at-least-one-member-of", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		integerAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:integer-at-least-one-member-of", Type.Boolean, new Type[] { Type.IntegerBag }),
		rfc822NameAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-at-least-one-member-of", Type.Boolean, new Type[] { Type.Rfc822Name }),
		stringAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:string-at-least-one-member-of", Type.Boolean, new Type[] { Type.String }),
		timeAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:time-at-least-one-member-of", Type.Boolean, new Type[] { Type.Time }),
		x500NameAtLeastOneMemberOf(NoxName.atLeastOneMemberOf, "urn:oasis:names:tc:xacml:1.0:function:x500Name-at-least-one-member-of", Type.Boolean, new Type[] { Type.X500Name }),

		anyURIBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:anyURI-bag", Type.AnyURIBag, new Type[] { Type.String }),
		base64BinaryBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag", Type.Base64BinaryBag, new Type[] { Type.String }),
		booleanBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:boolean-bag", Type.BooleanBag, new Type[] { Type.String }),
		dateBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:date-bag", Type.DateBag, new Type[] { Type.String }),
		dateTimeBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:dateTime-bag", Type.DateTimeBag, new Type[] { Type.String }),
		dayTimeDurationBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag", Type.DayTimeDurationBag, new Type[] { Type.String }),
		doubleBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:double-bag", Type.DoubleBag, new Type[] { Type.String }),
		hexBinaryBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag", Type.HexBinaryBag, new Type[] { Type.String }),
		integerBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:integer-bag", Type.IntegerBag, new Type[] { Type.String }),
		rfc822NameBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag", Type.Rfc822NameBag, new Type[] { Type.String }),
		rfc892NameBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-bag", Type.Rfc822NameBag, new Type[] { Type.String }),
		stringBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:string-bag", Type.StringBag, new Type[] { Type.String }),
		timeBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:time-bag", Type.TimeBag, new Type[] { Type.String }),
		x500NameBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:x500Name-bag", Type.X500NameBag, new Type[] { Type.String }),
		yearMonthDurationBag(NoxName.bag, "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag", Type.YearMonthDurationBag, new Type[] { Type.String }),

		anyURIBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:anyURI-bag-size", Type.Integer, new Type[] { Type.AnyURIBag }),
		base64BinaryBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag-size", Type.Integer, new Type[] { Type.Base64BinaryBag }),
		booleanBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:boolean-bag-size", Type.Integer, new Type[] { Type.BooleanBag }),
		dateBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:date-bag-size", Type.Integer, new Type[] { Type.DateBag }),
		dateTimeBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:dateTime-bag-size", Type.Integer, new Type[] { Type.DateTimeBag }),
		dayTimeDurationBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag-size", Type.Integer, new Type[] { Type.DayTimeDurationBag }),
		doubleBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:double-bag-size", Type.Integer, new Type[] { Type.DoubleBag }),
		hexBinaryBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag-size", Type.Integer, new Type[] { Type.HexBinary }),
		integerBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:integer-bag-size", Type.Integer, new Type[] { Type.IntegerBag }),
		rfc822NameBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag-size", Type.Integer, new Type[] { Type.Rfc822NameBag }),
		rfc892NameBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-bag-size", Type.Integer, new Type[] { Type.Rfc892NameBag }),
		stringBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:string-bag-size", Type.Integer, new Type[] { Type.StringBag }),
		timeBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:time-bag-size", Type.Integer, new Type[] { Type.TimeBag }),
		x500NameBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:x500Name-bag-size", Type.Integer, new Type[] { Type.X500NameBag }),
		yearMonthDurationBagSize(NoxName.bagSize, "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag-size", Type.Integer, new Type[] { Type.YearMonthDurationBag }),

		stringConcatenate(NoxName.concatenate, "urn:oasis:names:tc:xacml:2.0:function:string-concatenate", Type.String, new Type[] { Type.String }),
		doubleDivide(NoxName.divide, "urn:oasis:names:tc:xacml:1.0:function:double-divide", Type.Double, new Type[] { Type.Double }),
		integerDivide(NoxName.divide, "urn:oasis:names:tc:xacml:1.0:function:integer-divide", Type.Integer, new Type[] { Type.Integer }),

		anyURIEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:anyURI-equal", Type.Boolean, new Type[] { Type.AnyURI }),
		base64BinaryEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal", Type.Boolean, new Type[] { Type.Base64Binary }),
		booleanEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:boolean-equal", Type.Boolean, new Type[] { Type.Boolean }),
		dateEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:date-equal", Type.Boolean, new Type[] { Type.Date }),
		dateTimeEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:dateTime-equal", Type.Boolean, new Type[] { Type.DateTime }),
		dayTimeDurationEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-equal", Type.Boolean, new Type[] { Type.DayTimeDuration }),
		doubleEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:double-equal", Type.Boolean, new Type[] { Type.Double }),
		hexBinaryEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal", Type.Boolean, new Type[] { Type.HexBinary }),
		integerEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:integer-equal", Type.Boolean, new Type[] { Type.Integer }),
		rfc822NameEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal", Type.Boolean, new Type[] { Type.Rfc822Name }),
		stringEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:string-equal", Type.Boolean, new Type[] { Type.String }),
		timeEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:time-equal", Type.Boolean, new Type[] { Type.Time }),
		x500NameEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:x500Name-equal", Type.Boolean, new Type[] { Type.X500Name }),
		yearMonthDurationEqual(NoxName.equal, "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-equal", Type.Boolean, new Type[] { Type.YearMonthDuration }),

		floor(NoxName.floor, "urn:oasis:names:tc:xacml:1.0:function:floor", Type.Double, new Type[] { Type.Double }),

		dateGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:date-greater-than", Type.Boolean, new Type[] { Type.Date }),
		dateTimeGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than", Type.Boolean, new Type[] { Type.DateTime }),
		doubleGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:double-greater-than", Type.Boolean, new Type[] { Type.Double }),
		integerGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than", Type.Boolean, new Type[] { Type.Integer }),
		stringGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:string-greater-than", Type.Boolean, new Type[] { Type.String }),
		timeGreaterThan(NoxName.greaterThan, "urn:oasis:names:tc:xacml:1.0:function:time-greater-than", Type.Boolean, new Type[] { Type.Time }),

		dateGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal", Type.Boolean, new Type[] { Type.Date }),
		dateTimeGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal", Type.Boolean, new Type[] { Type.DateTime }),
		doubleGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal", Type.Boolean, new Type[] { Type.Double }),
		integerGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal", Type.Boolean, new Type[] { Type.Integer }),
		stringGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal", Type.Boolean, new Type[] { Type.String }),
		timeGreaterThanOrEqual(NoxName.greaterThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal", Type.Boolean, new Type[] { Type.Time }),

		timeInRange(NoxName.inRange, "urn:oasis:names:tc:xacml:1.0:function:time-in-range", Type.Boolean, new Type[] { Type.Time }),

		anyURIIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:anyURI-intersection", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		base64BinaryIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-intersection", Type.Base64BinaryBag, new Type[] { Type.Base64BinaryBag }),
		booleanIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:boolean-intersection", Type.BooleanBag, new Type[] { Type.BooleanBag }),
		dateIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:date-intersection", Type.DateBag, new Type[] { Type.DateBag }),
		dateTimeIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:dateTime-intersection", Type.DateTimeBag, new Type[] { Type.DateTimeBag }),
		doubleIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:double-intersection", Type.DoubleBag, new Type[] { Type.DoubleBag }),
		hexBinaryIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-intersection", Type.HexBinaryBag, new Type[] { Type.HexBinaryBag }),
		integerIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:integer-intersection", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		rfc822NameIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-intersection", Type.Rfc822NameBag, new Type[] { Type.Rfc822NameBag }),
		stringIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:string-intersection", Type.StringBag, new Type[] { Type.StringBag }),
		timeIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:time-intersection", Type.TimeBag, new Type[] { Type.TimeBag }),
		x500NameIntersection(NoxName.intersection, "urn:oasis:names:tc:xacml:1.0:function:x500Name-intersection", Type.X500NameBag, new Type[] { Type.X500NameBag }),

		anyURIIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in", Type.Boolean, new Type[] { Type.AnyURI }),
		base64BinaryIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in", Type.Boolean, new Type[] { Type.Base64Binary }),
		booleanIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:boolean-is-in", Type.Boolean, new Type[] { Type.Boolean }),
		dateIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:date-is-in", Type.Boolean, new Type[] { Type.Date }),
		dateTimeIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in", Type.Boolean, new Type[] { Type.DateTime }),
		dayTimeDurationIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-is-in", Type.Boolean, new Type[] { Type.DayTimeDuration }),
		doubleIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:double-is-in", Type.Boolean, new Type[] { Type.Double }),
		hexBinaryIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in", Type.Boolean, new Type[] { Type.HexBinary }),
		integerIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:integer-is-in", Type.Boolean, new Type[] { Type.Integer }),
		rfc822NameIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in", Type.Boolean, new Type[] { Type.Rfc822Name }),
		rfc892NameIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-is-in", Type.Boolean, new Type[] { Type.Rfc892Name }),
		stringIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:string-is-in", Type.Boolean, new Type[] { Type.String }),
		timeIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:time-is-in", Type.Boolean, new Type[] { Type.Time }),
		x500NameIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in", Type.Boolean, new Type[] { Type.X500Name }),
		yearMonthDurationIsIn(NoxName.isIn, "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-is-in", Type.Boolean, new Type[] { Type.YearMonthDuration }),

		dateLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:date-less-than", Type.Boolean, new Type[] { Type.Date }),
		dateTimeLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than", Type.Boolean, new Type[] { Type.DateTime }),
		doubleLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:double-less-than", Type.Boolean, new Type[] { Type.Double }),
		integerLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:integer-less-than", Type.Boolean, new Type[] { Type.Integer }),
		stringLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:string-less-than", Type.Boolean, new Type[] { Type.String }),
		timeLessThan(NoxName.lessThan, "urn:oasis:names:tc:xacml:1.0:function:time-less-than", Type.Boolean, new Type[] { Type.Time }),

		dateLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal", Type.Boolean, new Type[] { Type.Date }),
		dateTimeLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal", Type.Boolean, new Type[] { Type.DateTime }),
		doubleLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal", Type.Boolean, new Type[] { Type.Double }),
		integerLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal", Type.Boolean, new Type[] { Type.Integer }),
		stringLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal", Type.Boolean, new Type[] { Type.String }),
		timeLessThanOrEqual(NoxName.lessThanOrEqual, "urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal", Type.Boolean, new Type[] { Type.Time }),

		map(NoxName.map, "urn:oasis:names:tc:xacml:1.0:function:map", Type.ToDo, new Type[] { Type.ToDo }),

		rfc822NameMatch(NoxName.match, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-match", Type.Boolean, new Type[] { Type.Rfc822Name }),
		x500NameMatch(NoxName.match, "urn:oasis:names:tc:xacml:1.0:function:x500Name-match", Type.Boolean, new Type[] { Type.X500Name }),

		integerMod(NoxName.mod, "urn:oasis:names:tc:xacml:1.0:function:integer-mod", Type.Integer, new Type[] { Type.Integer }),

		doubleMultiply(NoxName.multiply, "urn:oasis:names:tc:xacml:1.0:function:double-multiply", Type.Double, new Type[] { Type.Double }),
		integerMultiply(NoxName.multiply, "urn:oasis:names:tc:xacml:1.0:function:integer-multiply", Type.Integer, new Type[] { Type.Integer }),

		xpathNodeCount(NoxName.nodeCount, "urn:oasis:names:tc:xacml:1.0:function:xpath-node-count", Type.Integer, new Type[] { Type.ToDo }),
		xpathNodeEqual(NoxName.nodeEqual, "urn:oasis:names:tc:xacml:1.0:function:xpath-node-equal", Type.Boolean, new Type[] { Type.ToDo }),
		xpathNodeMatch(NoxName.nodeMatch, "urn:oasis:names:tc:xacml:1.0:function:xpath-node-match", Type.Boolean, new Type[] { Type.ToDo }),

		stringNormalizeSpace(NoxName.normalizeSpace, "urn:oasis:names:tc:xacml:1.0:function:string-normalize-space", Type.String, new Type[] { Type.String }),
		stringNormalizeToLowerCase(NoxName.normalizeToLowerCase, "urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case", Type.String, new Type[] { Type.String }),

		not(NoxName.not, "urn:oasis:names:tc:xacml:1.0:function:not", Type.Boolean, new Type[] { Type.Boolean }),
		nOf(NoxName.of, "urn:oasis:names:tc:xacml:1.0:function:n-of", Type.ToDo, new Type[] { Type.ToDo }),

		anyURIOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:anyURI-one-and-only", Type.AnyURI, new Type[] { Type.AnyURIBag }),
		base64BinaryOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-one-and-only", Type.Base64Binary, new Type[] { Type.Base64BinaryBag }),
		booleanOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:boolean-one-and-only", Type.Boolean, new Type[] { Type.BooleanBag }),
		dateOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:date-one-and-only", Type.Date, new Type[] { Type.DateBag }),
		dateTimeOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:dateTime-one-and-only", Type.DateTime, new Type[] { Type.DateTimeBag }),
		dayTimeDurationOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-one-and-only", Type.DayTimeDuration, new Type[] { Type.DayTimeDurationBag }),
		doubleOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:double-one-and-only", Type.Double, new Type[] { Type.DoubleBag }),
		hexBinaryOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-one-and-only", Type.HexBinary, new Type[] { Type.HexBinaryBag }),
		integerOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:integer-one-and-only", Type.Integer, new Type[] { Type.IntegerBag }),
		rfc822NameOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-one-and-only", Type.Rfc822Name, new Type[] { Type.Rfc822NameBag }),
		rfc892NameOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:rfc892Name-one-and-only", Type.Rfc822Name, new Type[] { Type.Rfc892NameBag }),
		stringOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:string-one-and-only", Type.String, new Type[] { Type.StringBag }),
		x500NameOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:x500Name-one-and-only", Type.X500Name, new Type[] { Type.X500NameBag }),
		yearMonthDurationOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-one-and-only", Type.YearMonthDuration, new Type[] { Type.YearMonthDurationBag }),
		timeOneAndOnly(NoxName.oneAndOnly, "urn:oasis:names:tc:xacml:1.0:function:time-one-and-only", Type.Time, new Type[] { Type.TimeBag }),
		booleanOneBagSize(NoxName.oneBagSize, "urn:oasis:names:tc:xacml:1.0:function:boolean-one-bag-size", Type.Boolean, new Type[] { Type.BooleanBag }),

		or(NoxName.or, "urn:oasis:names:tc:xacml:1.0:function:or", Type.Boolean, new Type[] { Type.Boolean }),

		stringRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:1.0:function:string-regexp-match", Type.Boolean, new Type[] { Type.String }),
		anyURIRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:2.0:function:anyURI-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		dnsNameRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:2.0:function:dnsName-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		ipAddressRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:2.0:function:ipAddress-regexp-match", Type.Boolean, new Type[] { Type.ToDo }),
		rfc822NameRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:2.0:function:rfc822Name-regexp-match", Type.Boolean, new Type[] { Type.Rfc822Name }),
		x500NameRegexpMatch(NoxName.regexpMatch, "urn:oasis:names:tc:xacml:2.0:function:x500Name-regexp-match", Type.Boolean, new Type[] { Type.X500Name }),

		round(NoxName.round, "urn:oasis:names:tc:xacml:1.0:function:round", Type.Double, new Type[] { Type.Double }),

		anyURISetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:anyURI-set-equals", Type.Boolean, new Type[] { Type.AnyURIBag }),
		base64BinarySetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-set-equals", Type.Boolean, new Type[] { Type.Base64BinaryBag }),
		booleanSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:boolean-set-equals", Type.Boolean, new Type[] { Type.BooleanBag }),
		dateSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:date-set-equals", Type.Boolean, new Type[] { Type.DateBag }),
		dateTimeSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:dateTime-set-equals", Type.Boolean, new Type[] { Type.DateTimeBag }),
		doubleSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:double-set-equals", Type.Boolean, new Type[] { Type.DoubleBag }),
		hexBinarySetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-set-equals", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		integerSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:integer-set-equals", Type.Boolean, new Type[] { Type.IntegerBag }),
		rfc822NameSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-set-equals", Type.Boolean, new Type[] { Type.Rfc822NameBag }),
		stringSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:string-set-equals", Type.Boolean, new Type[] { Type.StringBag }),
		timeSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:time-set-equals", Type.Boolean, new Type[] { Type.TimeBag }),
		x500NameSetEquals(NoxName.setEquals, "urn:oasis:names:tc:xacml:1.0:function:x500Name-set-equals", Type.Boolean, new Type[] { Type.X500NameBag }),

		urlStringConcatenate(NoxName.stringConcatenate, "urn:oasis:names:tc:xacml:2.0:function:url-string-concatenate", Type.String, new Type[] { Type.String }),
		regexpStringMatch(NoxName.stringMatch, "urn:oasis:names:tc:xacml:1.0:function:regexp-string-match", Type.Boolean, new Type[] { Type.String }),

		anyURISubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:anyURI-subset", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		base64BinarySubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-subset", Type.Boolean, new Type[] { Type.Base64BinaryBag }),
		booleanSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:boolean-subset", Type.Boolean, new Type[] { Type.BooleanBag }),
		dateSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:date-subset", Type.Boolean, new Type[] { Type.DateBag }),
		dateTimeSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:dateTime-subset", Type.Boolean, new Type[] { Type.DateTimeBag }),
		doubleSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:double-subset", Type.Boolean, new Type[] { Type.DoubleBag }),
		hexBinarySubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-subset", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		integerSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:integer-subset", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		rfc822NameSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-subset", Type.Boolean, new Type[] { Type.Rfc822NameBag }),
		stringSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:string-subset", Type.Boolean, new Type[] { Type.StringBag }),
		timeSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:time-subset", Type.Boolean, new Type[] { Type.TimeBag }),
		x500NameSubset(NoxName.subset, "urn:oasis:names:tc:xacml:1.0:function:x500Name-subset", Type.Boolean, new Type[] { Type.X500NameBag }),
		doubleSubtract(NoxName.subtract, "urn:oasis:names:tc:xacml:1.0:function:double-subtract", Type.Double, new Type[] { Type.Double }),
		integerSubtract(NoxName.subtract, "urn:oasis:names:tc:xacml:1.0:function:integer-subtract", Type.Integer, new Type[] { Type.Integer }),

		dateTimeSubtractDayTimeDuration(NoxName.subtractDayTimeDuration, "urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-dayTimeDuration", Type.DateTime, new Type[] { Type.DateTime }),
		dateSubtractYearMonthDuration(NoxName.subtractYearMonthDuration, "urn:oasis:names:tc:xacml:1.0:function:date-subtract-yearMonthDuration", Type.Date, new Type[] { Type.Date }),
		dateTimeSubtractYearMonthDuration(NoxName.subtractYearMonthDuration, "urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-yearMonthDuration", Type.DateTime, new Type[] { Type.DateTime }),

		integerToDouble(NoxName.toDouble, "urn:oasis:names:tc:xacml:1.0:function:integer-to-double", Type.Double, new Type[] { Type.Integer }),
		doubleToInteger(NoxName.toInteger, "urn:oasis:names:tc:xacml:1.0:function:double-to-integer", Type.Integer, new Type[] { Type.Double }),

		anyURIUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:anyURI-union", Type.AnyURIBag, new Type[] { Type.AnyURIBag }),
		base64BinaryUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-union", Type.Base64BinaryBag, new Type[] { Type.Base64BinaryBag }),
		booleanUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:boolean-union", Type.BooleanBag, new Type[] { Type.BooleanBag }),
		dateUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:date-union", Type.DateBag, new Type[] { Type.DateBag }),
		dateTimeUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:dateTime-union", Type.DateTimeBag, new Type[] { Type.DateTimeBag }),
		doubleUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:double-union", Type.DoubleBag, new Type[] { Type.DoubleBag }),
		hexBinaryUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-union", Type.Boolean, new Type[] { Type.HexBinaryBag }),
		integerUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:integer-union", Type.IntegerBag, new Type[] { Type.IntegerBag }),
		rfc822NameUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-union", Type.Rfc822NameBag, new Type[] { Type.Rfc822NameBag }),
		stringUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:string-union", Type.StringBag, new Type[] { Type.StringBag }),
		timeUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:time-union", Type.TimeBag, new Type[] { Type.TimeBag }),
		x500NameUnion(NoxName.union, "urn:oasis:names:tc:xacml:1.0:function:x500Name-union", Type.BooleanBag, new Type[] { Type.X500NameBag });

		final NoxName noxFunctionName;
		final String oasisFunctionURI;
		final Type returnType;
		final Type[] argumentTypes;

		Function(NoxName noxFunctionName, String oasisFunctionURI, Type returnType, Type[] argumentTypes)
		{
			this.noxFunctionName = noxFunctionName;
			this.oasisFunctionURI = oasisFunctionURI;
			this.returnType = returnType;
			this.argumentTypes = argumentTypes;
		}
		public String toString()
		{
			return name();
		}
	}
}
