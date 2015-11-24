package test;

public abstract class B {

	protected void preprocess()
	{
		System.out.println("preprocess");
	}	
	
	protected void postprocess()
	{
		System.out.println("postprocess");
	}
	
	public final C process()
	{
		preprocess();
		try
		{
			C c = new C();
			c.setName("Real");
			return c;
		}
		finally{
			postprocess();
		}
	}
}
