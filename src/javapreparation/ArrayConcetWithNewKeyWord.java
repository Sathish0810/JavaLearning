package javapreparation;

import java.util.Arrays;

public class ArrayConcetWithNewKeyWord {

	public static void main(String[] args) {
		
	//integer Array
    int a[]=new int[5];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    a[4]=50;
    
    System.out.println(Arrays.toString(a));
    
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    
    //Double array
    double d[]=new double[5];
    d[0]=10.34;
    d[1]=20.22;
    d[2]=30.61;
    d[3]=40.67;
    d[4]=50.34;
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(d[i]);
    }
    //String Array
    String s[]=new String[5];
    s[0]="Sathish";
    s[1]="Akash";
    s[2]="Rakesh";
    s[3]="Ajith";
    s[4]="vijay";
    for(int i=0;i<s.length;i++)
    {
    	System.out.println(s[i]);
    }
    
	}

}
