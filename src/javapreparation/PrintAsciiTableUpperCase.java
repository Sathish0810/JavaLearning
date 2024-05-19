package javapreparation;

public class PrintAsciiTableUpperCase {

	public static void main(String[] args) {
		for(char ch='A';ch<='Z';ch++)
	    {
	    	System.out.println(ch+" = "+(byte)ch);
	    }
	}

}
