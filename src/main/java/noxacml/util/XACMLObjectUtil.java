package noxacml.util;

import org.opensaml.xacml.XACMLObject;
import org.opensaml.xml.Configuration;
import org.opensaml.xml.io.Marshaller;
import org.opensaml.xml.io.MarshallerFactory;
import org.opensaml.xml.util.XMLHelper;
import org.w3c.dom.Element;

public class XACMLObjectUtil
{
	public static String toString(XACMLObject o)
	{
		Element e = toElement(o);
		String s = XMLHelper.prettyPrintXML(e);
		return s;
	}
	public static Element toElement(XACMLObject o)
	{
		MarshallerFactory marshallerFactory = Configuration.getMarshallerFactory();
		Marshaller marshaller = marshallerFactory.getMarshaller(o);
		try
		{
			Element elmt = marshaller.marshall(o);
			return elmt;
		}
		catch (Exception e)
		{
			throw new Fault(e);
		}
	}

}
