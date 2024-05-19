package javapreparation;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
    ArrayList<Object> ar=new ArrayList<Object>();
    ar.add("Sathish");
    ar.add(100);
    ar.add(22.33);
    System.out.println(ar);
    System.out.println(ar.get(0));
    for(int i=0;i<ar.size();i++)
    {
    System.out.println(ar.get(i));
    }
   //Generics
    ArrayList<String>employeeList=new ArrayList<String>();
    employeeList.add("Sathish");
    employeeList.add("Rajesh");
    employeeList.add("Akash");
    
    for(String str : employeeList)
    {
    	System.out.println(str);
    }
    
	}

}
