package javapreparation;

public class StaticMethods {
	
	public static String Test()
	{
		System.out.println("This is static method");
		return "static";
	}

	public static void main(String[] args) {
		
		System.out.println(StaticMethods.Test());

	}

}
