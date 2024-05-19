package OOPEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Sathish", 28, 30.1, "Thanjavur");
//		e1.setName("sathish");
//		e1.setAge(28);
//		e1.setSalary(20.1);
//		e1.setCity("Chennai");
		e1.setCity("Banglore");
		
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity());
		
	}

}
