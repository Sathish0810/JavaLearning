package javapreparation;

import java.util.ArrayList;

public class EmployeeNameInEachOrganization {
	
	public ArrayList<String> employeeName(String companyName)
	{
		System.out.println(companyName);
		ArrayList<String> ar=new ArrayList<String>();
		if(companyName.equalsIgnoreCase("IBM"))
		{
			ar.add("sathish");
			ar.add("ajith");
			ar.add("vijay");
		}
		else if(companyName.equalsIgnoreCase("google"))
		{
			ar.add("rakesh");
			ar.add("gokul");
			ar.add("pavithra");
		}
		else if(companyName.equalsIgnoreCase("MS"))
		{
			ar.add("raja");
			ar.add("ajay");
			ar.add("rohit");
		}
		return ar;
	}

	public static void main(String[] args) {
    
		EmployeeNameInEachOrganization obj=new EmployeeNameInEachOrganization();
		ArrayList<String>IbmEmpList=obj.employeeName("ibm");
		ArrayList<String>GoogleEmpList=obj.employeeName("google");
		ArrayList<String>MsEmpList=obj.employeeName("MS");
		System.out.println(IbmEmpList);
		System.out.println(GoogleEmpList);
		System.out.println(MsEmpList);

		
	}

}
