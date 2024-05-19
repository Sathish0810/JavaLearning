package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
    String s="This is my java codei";
    System.out.println(s.length());
    System.out.println(s.charAt(1));
    System.out.println(s.indexOf('T'));
    System.out.println(s.indexOf('T'));
    System.out.println(s.indexOf('i'));
    System.out.println(s.indexOf('i', s.indexOf('i')+1));
   // System.out.println(s.index);
    
    String name="this is my   ";
    System.out.println(name.trim());
    String date="08-10-1995";
    System.out.println(date.replace('-', '/'));
    
    //split
    String st1="JAVA_SELENIUM_MAVEN";
    String str[]=st1.split("_");
    for(String e : str)
    {
    	System.out.println(e);
    }
    
    


    
	}

}
