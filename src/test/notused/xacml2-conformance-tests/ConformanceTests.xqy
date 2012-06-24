xquery version "1.0";
(:
declare namespace soap="http://schemas.xmlsoap.org/soap/envelope/";
declare namespace oasis="urn:oasis:names:tc:xacml:2.0:context:schema:os";
declare namespace samlp="http://www.oasis.org/xacml-samlp";
declare namespace ldap="java:com.technica.pbac.util.LdapQuery";
declare copy-namespaces no-preserve, inherit;
:)
declare copy-namespaces no-preserve, inherit;
declare namespace xhtml="http://www.w3.org/1999/xhtml";
declare default element namespace "http://www.w3.org/1999/xhtml";

let $doc := fn:doc("ConformanceTests.xml")
let $case := $doc//ol/li/i/a/../..
for $elmt in $case
let $text := $elmt/text()
let $rq := data($elmt/i/a[1]/@href)
let $po := data($elmt/i/a[2]/@href)
let $rs := data($elmt/i/a[3]/@href)

return 
	<case>
		<description>{$text}</description>
		<request>{$rq}</request>
		<policy>{$po}</policy>
		<response>{$rs}</response>
	</case>
(:
for $li in $doc//li
return <li>$li</li>
:)

