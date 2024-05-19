package oopsAbstractClass;

public class LoginPage extends Page {
	
	public LoginPage()

	{
		System.out.println("Child class default consttt");
	}
	public LoginPage(int i)
	{
		System.out.println("parameterized constructors");
	}

	@Override
	public void pageName() {
    System.out.println("page name");		
	}

	@Override
	public void PageLinks() {
	    System.out.println("page links");		
		
	}
	
	public void pageTimeout()
	{
		System.out.println("page load time is 20");
	}

}
