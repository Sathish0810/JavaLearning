package OOPEncapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String city;

	public Employee(String name, int age, double salary, String city) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

}
