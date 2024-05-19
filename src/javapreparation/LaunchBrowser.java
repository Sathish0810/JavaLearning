package javapreparation;

public class LaunchBrowser {
	
	public boolean getBrowser(String browserName)
	{
		boolean flag =true;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("Browser launched successfully");
		}
		else if(browserName.equals("FF"))
		{
			System.out.println("Browser launched successfully");
		}
		else if(browserName.equals("Edge"))
		{
			System.out.println("Browser launched successfully");
		}
		else if(browserName.equals("IE"))
		{
			System.out.println("Browser launched successfully");
		}
		else
		{
			System.out.println("Browser not found");
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {
		LaunchBrowser browser=new LaunchBrowser();
		boolean isLaunched=browser.getBrowser("opera");
		if(isLaunched)
		{
			System.out.println("Open the URL");
		}
		else
		{
			System.out.println("Do not open the URL");
		}
		
	}

}
