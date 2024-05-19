package javapreparation;

public class PrintAsciiTableLowerCase {

	public static void main(String[] args) {
    for(char ch='a';ch<='z';ch++)
    {
    	System.out.println(ch+" = "+(byte)ch);
    }
	}

}
