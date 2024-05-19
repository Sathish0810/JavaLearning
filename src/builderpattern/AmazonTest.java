package builderpattern;

public class AmazonTest {

	public static void main(String[] args) {
    Shopping shop=new Shopping();
    shop.login("neelasathish8@gmail.com", "Clinique$5").search("iphone").addtoCart("iphone")
    .doPayment("neelasathish8@ybl").orderConfirmation();
	}

}
