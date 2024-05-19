package javapreparation;

public class ArrayLiterals {

	public static void main(String[] args) {
    String emp[]= {"Sathish","Ajith","Vijay","Rakesh"};
    for (int i=0; i<emp.length;i++)
    {
    	System.out.println(emp[i]);
    	switch (emp[i]) {
		case "Sathish":
			System.out.println("Salary is = "+1000);
			break;
		case "Ajith":
			System.out.println("Salary is = "+2000);
			break;
		case "Vijay":
			System.out.println("Salary is = "+3000);
			break;
		case "Rakesh":
			System.out.println("Salary is = "+4000);
			break;
		default:
			break;
		}
  
    	
    }
    
	}

}
