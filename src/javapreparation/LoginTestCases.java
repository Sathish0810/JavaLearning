package javapreparation;

public class LoginTestCases {
	
	public static boolean isForgetLinkPresent()
	{
		System.out.println("Forget password link is present");
		return true;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with"+" "+ un+ " "+pwd);
		System.out.println("User logged in successfully");
	}
	

}
