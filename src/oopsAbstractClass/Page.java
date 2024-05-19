package oopsAbstractClass;

public abstract class Page {
	
	public abstract void pageName();
	public abstract void PageLinks();
	
	public void pageTimeout()
	{
		System.out.println("page load time is 20");
	}
	public Page(int i)
	{
		System.out.println("parentt parameterized constructors");
	}
	public Page()
	{
		System.out.println("Parent class default constructor");
	}

	

}
