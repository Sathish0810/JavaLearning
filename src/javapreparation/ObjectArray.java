package javapreparation;

public class ObjectArray {

	public static void main(String[] args) {
    Object obj[]=new Object[4];
    obj[0]="Sathish";
    obj[1]=10;
    obj[2]=10.22;
    obj[3]=true;
    
    for(Object e : obj)
    {
    	System.out.println(e);
    }
    System.out.println(obj[0]);
    char str[]=new char[4];
    System.out.println(str[0]);
	}
	
	
}
