package WebDriverArchitecture;

public class BrowserTest {

	public static void main(String[] args) {
      WebDriver driver=null;
      String browser="firefox";
      if(browser.equals("chrome"))		
      {
    	  driver=new ChromeDriver();
      }
      else if(browser.equals("firefox"))		
      {
    	  driver=new FirefoxDrive();
      }
      if(browser.equals("safari"))		
      {
    	  driver=new SafariDriver();
      }
		
		
		driver.openUrl("amazon.com");
		driver.getTitle();
		driver.findElement("emailaddress");
		driver.sendKeys("emailaddress", "neelasathish8");
		driver.close();
	}

}
