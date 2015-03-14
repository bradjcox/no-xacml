XACML is an XML-based access control language; a non-extendable functional language with just enough semantics to express access control policy and no more. But those semantics come wrapped in visual barbed wire; an XML-based syntax so ugly it makes your eyes bleed. XACML makes COBOL and even MUMPS look good.

NoXacml is a terse dialect of the same semantics with a Java-like syntax that people can read and write easily. A compiler turns NoXacml programs into standard XML-based XACML text for conversing with machines.

The NoXACML compiler is still under development and the language itself is still evolving. There are no released versions yet.

# Example #

OASIS provides [an extensive suite of conformance tests](https://www.oasis-open.org/committees/download.php/14877/ConformanceTests.html) that were used to test the compilers. The following is one of the  tests rewritten in NoXACML. In english, the policy is: "Julius Hibbert can read or write Bart Simpson's medical record." The XACML version is a whole page of inscrutable XML.

```
policy IIA001 denyOverrides
{
	rule IIA1
	{
		permit if 
		(
			"Julius Hibbert".isIn(subject.id) &&
			"http://medico.com/record/patient/BartSimpson".uri().isIn(resource.id) &&
			( "read".isIn(action.id) || "write".isIn(action.id) )
		)
	}
}
```

# Details #

NoXACML emerged from [GOSAC-N (Government Open Source Access Control - Next Generation)](http://www.gosac-n.org/category/keywords/XACML),  a [Technica Corporation](http://technicacorp.com) project to provide an open source ABAC (attribute-based access control) system for the US government.  GOSAC-N is available on [forge.mil](http://forge.mil). It provides PEPs (Policy Enforcement Points), a PDP (Policy Decision Point) secured to stringent government specs via TLS and SAML2, and browser-based capabilities that will evolve into a full-featured PAP (Policy Administration Point) over time.

At first the PDP was based on [Sun's XACML interpreter](http://sunxacml.sourceforge.net/). Then we developed a pair of compilers (for XACML 2.0 and 3.0) that compiles XACML to Java source. Compilation can be done off-line so that the PDP loads policies as Java byte-codes or on-the-fly where the PDP  dynamically compiles XML files to byte codes for execution. The compilers are proprietary but the forge.mil site includes working binary copies. [This AFCEA paper](http://bradjcox.blogspot.com) compares the XACML 2.0 compiler's performance with Sun's interpreter.

The compilers use JAXB to build a DOM model of XACML as its expression tree. The NoXACML compiler  builds the same DOM model from NoXACL. The DOM model can then be compiled to Java  or converted to the usual XML by JAXB's serialization for exchange as a standard language.