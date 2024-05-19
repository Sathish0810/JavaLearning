package javapreparation;

public class StringConcatenation {

	public static void main(String[] args) {
    int a=10;
    int b=20;
    String x="Hello";
    String y="Selenium";
    String s1="Automation";
    String s2="Testing";
    double l1=20.20;
    double l2=11.22;
    
    System.out.println(a+b);
    System.out.println(x+y);
    System.out.println(a+b+x+y);
    System.out.println(x+y+a+b);
    System.out.println(x+y+(a+b));
    System.out.println(x+y+(a+b)+s1+s2);
    System.out.println(x+y+a+b+s1+s2);
    System.out.println(x+y+a+b+l1+l2);
    System.out.println(l1+l2+a+b+x+y);
    
    
    char g='a';
    char h='b';
    System.out.println(s1+s2+g+h);
    System.out.println(g+h+s1+s2);
    System.out.println((byte)'*');//to find the ASCII value

    
   
    
	}

}
