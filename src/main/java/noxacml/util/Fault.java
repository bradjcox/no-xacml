package noxacml.util;

@SuppressWarnings("serial")
public class Fault extends RuntimeException
{
	public Fault(String s)
	{
		super(s);
	}
	public Fault(String s, Throwable e)
	{
		super(s, e);
	}
	public Fault(Throwable e)
	{
		super(e.getMessage(), e);
	}

//	// Conveys Indeterminate result to caller from boolean functions
//	public static class Indeterminate extends Fault
//	{
//
//		public Indeterminate(String s)
//		{
//			super(s);
//		}
//	}
//
//	// Conveys NotApplicable result to caller from boolean functions
//	public static class NotApplicable extends Fault
//	{
//
//		public NotApplicable(String s)
//		{
//			super(s);
//		}
//	}
}
