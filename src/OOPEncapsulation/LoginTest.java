package OOPEncapsulation;

public class LoginTest {

	private String UserName;
	private String pwd;

	public LoginTest(String userName, String pwd) {
		UserName = userName;
		this.pwd = pwd;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	
	public void doLogin(String userName, String password)
	{
		System.out.println("User logged in succesfully with"+" "+userName+" "+password);
		isUserActive(userName);
	}
	
	private boolean isUserActive(String userName)
	{
		System.out.println(userName+" "+"is active");
		return true;
	}
}
