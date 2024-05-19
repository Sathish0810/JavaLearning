package WebDriverArchitecture;

public class FirefoxDrive implements WebDriver {

	public FirefoxDrive()
	{
		System.out.println("Firefox browser launched successfully");
	}
	@Override
	public void openUrl(String URL) {
		
		System.out.println(URL+" "+"loaded successfully");

	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "amazon";
	}

	@Override
	public void sendKeys(String element, String Value) {
    System.out.println("Entered "+Value+" "+"in"+" "+element);
	}

	@Override
	public void close() {
		System.out.println("Close the browser");
	}

	@Override
	public void findElement(String element) {
    System.out.println(element +" "+"is found");
	}

}