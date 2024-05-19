package javapreparation;

public class SwitchCaseConcept {

	public static void main(String[] args) {
    String browser="IE";
    switch (browser) {
	case "chrome":
		System.out.println("Launch chrome browser");
		break;
	case "firefox":
		System.out.println("Launch firefox browser");
		break;
	case "edge":
		System.out.println("Launch edge browser");
		break;
	case "IE":
		System.out.println("Launch IE browser");
		break;
	default:
		System.out.println("Please pass the correct browser");
		break;
	}
	}

}
