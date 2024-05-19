package builderpattern;

public class Shopping {

	public Shopping login() {
		System.out.println("Logged in to the account");
		return this;
	}

	public Shopping login(String un, String pwd) {
		System.out.println("Logged in to the account");
		return this;

	}

	public Shopping search(String product) {
		System.out.println(product + " " + "is displayed");
		return this;

	}

	public Shopping addtoCart(String product) {
		System.out.println(product + " " + "added to the cart successfully");
		return this;

	}

	public Shopping doPayment(String upi) {
		System.out.println("Payment completed successfully with " + upi);
		return this;

	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("Payment completed successfully with " + cc + " " + cvv);
		return this;

	}

	public Shopping orderConfirmation() {
		System.out.println("Order completed successfully");
		return this;

	}

}
