package javapreparation;

public class FindTheGreatestOfFourNumbers {

	public static void main(String[] args) {
    int a=100;
    int b=800;
    int c=300;
    int d=400;
    
    if(a>b && a>c && a>d)
    {
    	System.out.println(a+" is the greatest number");
    }
    else if(b>c && b>d)
    {
    	System.out.println(b+" is the greatest number");

    }
    else if(c>d)
    {
    	System.out.println(c+" is the greatest number");

    }
    else
    {
    	System.out.println(d+" is the greatest number");

    }
	}

}
