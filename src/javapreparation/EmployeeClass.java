package javapreparation;

public class EmployeeClass {
	String name;
	long phoneNum;
	String Location;
	int salary;
	boolean isPermanent;
	char gender;
	int age;
	static final String companyName="CAPGEMINI";
	static String CEO_NAME="Aiman Ezzat";

	public static void main(String[] args) {
		
		//Print default values
		//Object creation
		EmployeeClass empInfo=new EmployeeClass();
		empInfo.name="Sathish";
		empInfo.phoneNum=9361646532l;
		empInfo.Location="Chennai";
		empInfo.salary=10000;
		empInfo.isPermanent=true;
		empInfo.gender='M';
		empInfo.age=28;
		
		EmployeeClass empInfo1=new EmployeeClass();
		empInfo1.name="Rajesh";
		empInfo1.phoneNum=9361646533l;
		empInfo1.Location="Banglore";
		empInfo1.salary=20000;
		empInfo1.isPermanent=false;
		empInfo1.gender='M';
		empInfo1.age=28;
		
		EmployeeClass empInfo2=new EmployeeClass();
		empInfo2.name="Indhu";
		empInfo2.phoneNum=8056551963l;
		empInfo2.Location="Chennai";
		empInfo2.salary=600000;
		empInfo2.isPermanent=true;
		empInfo2.gender='F';
		empInfo2.age=28;

		System.out.println(empInfo.name+" " +empInfo.phoneNum+" "+empInfo.Location+" "+empInfo.salary
				+" "+empInfo.isPermanent+" "+empInfo.gender+" "+empInfo.age+" "+
				EmployeeClass.companyName+" "+EmployeeClass.CEO_NAME);
		
		System.out.println(empInfo1.name+" " +empInfo1.phoneNum+" "+empInfo1.Location+" "+empInfo1.salary
				+" "+empInfo1.isPermanent+" "+empInfo1.gender+" "+empInfo1.age+" "+
				EmployeeClass.companyName+" "+EmployeeClass.CEO_NAME);
		
		System.out.println(empInfo2.name+" " +empInfo2.phoneNum+" "+empInfo2.Location+" "+empInfo2.salary
				+" "+empInfo2.isPermanent+" "+empInfo2.gender+" "+empInfo2.age+" "+
				EmployeeClass.companyName+" "+EmployeeClass.CEO_NAME);
   
	}

}
