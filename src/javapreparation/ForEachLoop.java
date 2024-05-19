package javapreparation;

public class ForEachLoop {

	public static void main(String[] args) {
    int a[]=new int[4];
    a[0]=56;
    a[1]=98;
    a[2]=97;
    a[3]=97;
    
    for(int e : a)
    {
    	System.out.println(e);
    }
    System.out.println("------------------");
    //print Reverse
    for(int i=a.length-1;i>=0;i--)
    {
    	System.out.println(a[i]);
    }
    		
	}

}
