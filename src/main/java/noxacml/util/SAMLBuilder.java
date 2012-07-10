package noxacml.util;

import javax.xml.namespace.QName;

import org.opensaml.Configuration;
import org.opensaml.DefaultBootstrap;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.XMLObjectBuilder;
import org.opensaml.xml.XMLObjectBuilderFactory;

// http://www.capcourse.com/Library/OpenSAML/index.html
public class SAMLBuilder
{
	final XMLObjectBuilderFactory builderFactory;

	public SAMLBuilder()
	{
		try
		{
			DefaultBootstrap.bootstrap();
		}
		catch (Exception e)
		{
			throw new Fault(e);
		}
		this.builderFactory = Configuration.getBuilderFactory();
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public <T> T create (Class<T> cls, QName qname)
	{
		XMLObjectBuilder builder = ((XMLObjectBuilder)builderFactory.getBuilder(qname));
		if (builder == null)
		{
			throw new Fault("Null builder for qname: "+qname);
		}
		XMLObject object = builder.buildObject (qname);
	  return (T)object;
	}
}
