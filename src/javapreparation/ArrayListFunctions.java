package javapreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFunctions {

	public static void main(String[] args) {
    ArrayList<String> arr=new ArrayList<String>(Arrays.asList("Sathish","Rakesh","Akash","Ajith"));
    
    System.out.println(arr);
    
    System.out.println("---------------------");
    
    for(String e : arr)
    	System.out.println(e);
    
    List<String>myList=Arrays.asList("csk", "RR", "SRH");
    System.out.println(myList);
    
    //To remove from ArrayList
    arr.remove(0);
    System.out.println(arr);
    
    //To Sort
    Collections.sort(arr);
    System.out.println(arr);
    
    //To add multiple data
    
    ArrayList<String>multipleName=new ArrayList<String>(Collections.nCopies(0, "Sathish"));
    System.out.println(multipleName);
    
	}

}
