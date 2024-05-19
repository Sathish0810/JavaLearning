package WebDriverArchitecture;

public interface WebDriver {
	
	public void openUrl(String URL);
	public String getTitle();
	public void sendKeys(String element, String Value);
	public void close();
	public void findElement(String element);
	

}
