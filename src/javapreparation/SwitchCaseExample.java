package javapreparation;

public class SwitchCaseExample {

	public static void main(String[] args) {
    String name="Sathish";
    int marks=0;
    switch (name) {
	case "Sathish":
		System.out.println(name+" PASSED");
		marks=100-20;
		System.out.println(marks);
		break;
	case "naveen":
		System.out.println(name+" PASSED");
		marks=100-300;
		break;
	case "rajesh":
		System.out.println(name+" PASSED");
		marks=100-400;
		break;

	default:
		System.out.println(name+" not found");
		marks=-1;
		System.out.println(marks);
		break;
	}
    
    //Tests performs in various environment
    
    String envName="QA   ";
    switch (envName.toLowerCase().trim()) {
	case "dev":
		System.out.println("Run Tests on DEV environment");
		break;
	case "qa":
		System.out.println("Run Tests on qa environment");
		break;
	case "uat":
		System.out.println("Run Tests on uat environment");
		break;
	case "prod":
		System.out.println("Run Tests on prod environment");
		break;
	default:
		System.out.println("Check the environment");
		break;
	}
    		
	}

}
