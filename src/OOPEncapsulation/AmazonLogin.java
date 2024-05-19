package OOPEncapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		LoginTest l1=new LoginTest("sathish", "123456");
		System.out.println(l1.getUserName()+" "+ l1.getPwd());
		l1.doLogin(l1.getUserName(), l1.getPwd());
	}

}
