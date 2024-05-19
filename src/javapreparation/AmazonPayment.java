package javapreparation;

public class AmazonPayment {
	
	public boolean payment(String upi, int otp)
	{
		boolean flag=true;
		System.out.println("upi validation success"+" "+upi+" "+ "Now Enter OTP to complete the Payment");
		System.out.println(otp+" "+"Entered OTP is valid, Your order placed successfully");
		return flag;
	}

	public static void main(String[] args) {
		AmazonPayment obj=new AmazonPayment();
		boolean isPaymentDone=obj.payment("neelasathish@ybl", 1234);
		if(isPaymentDone)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("FAIL");
		}
    
	}

}
