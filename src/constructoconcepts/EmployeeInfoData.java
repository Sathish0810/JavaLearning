package constructoconcepts;

public class EmployeeInfoData {

	String firstName;
	String lastName;
	String emailAddress;
	String Phone;
	String password;
	String city;

	public EmployeeInfoData(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public EmployeeInfoData(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public EmployeeInfoData(String firstName) {
		super();
		this.firstName = firstName;
	}

	public EmployeeInfoData(String firstName, String lastName, String phone, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Phone = phone;
		this.password = password;
	}

	public EmployeeInfoData(String firstName, String lastName, String emailAddress, String phone, String password,
			String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		Phone = phone;
		this.password = password;
		this.city = city;
	}

	public static void main(String[] args) {
		
		EmployeeInfoData emp=new EmployeeInfoData("Neela", "Sathish");
		System.out.println(emp.firstName+emp.lastName);
		emp.firstName="N.neela";
		System.out.println(emp.firstName+emp.lastName);
		
		EmployeeInfoData emp1=new EmployeeInfoData("Ajith", "Kumar", "ajith@gmail.com");
		
		
		System.out.println(emp1.firstName+emp1.lastName+" "+emp1.emailAddress);

		

	}

}
