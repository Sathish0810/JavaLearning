package constructoconcepts;

public class EployeeInfo {
	String name;
    int age;
    double salary;
    
    public EployeeInfo()
    {
    	System.out.println("Zero parameterized constructor");
    }
    public EployeeInfo(String name)
    {
    	System.out.println("single parameterized constructor");

    }
    public EployeeInfo(String name, int age, double salary)
    {
    	System.out.println("single parameterized constructor");

    }

	public static void main(String[] args) {
		EployeeInfo emp1=new EployeeInfo();
		EployeeInfo emp2=new EployeeInfo("sathish");
		EployeeInfo emp3 =new EployeeInfo("rajesh",28,22.22);
    
	}

}
