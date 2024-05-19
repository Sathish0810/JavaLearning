package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {
    String browser="ie";
    
    if(browser.equals("chrome"))
    {
    	System.out.println("Open chrome browser");
    }
    else if(browser.equals("firefox"))
    {
    	System.out.println("Open firefox browser");
    }
    else if(browser.equals("edge"))
    {
    	System.out.println("Open edge browser");
    }
    else
    {
    	throw new MyException("browserNotfoundException");
    }
	}

}
