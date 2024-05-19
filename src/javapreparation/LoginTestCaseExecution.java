package javapreparation;

public class LoginTestCaseExecution {

	public static void main(String[] args) {
    if(LoginTestCases.isForgetLinkPresent())
    {
    	System.out.println("You can change password");
    }
    LoginTestCases ln=new LoginTestCases();
    ln.doLogin("neelasathish8@gmail.com", "Clinique$5");
	}

}
