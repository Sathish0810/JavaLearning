package javapreparation;

public class CallByValueCallByReference {
	
	String name;
	int age;
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void getEmployeeInfo(CallByValueCallByReference ob)
	{
		ob.name="sathish";
		ob.age=30;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		CallByValueCallByReference obj=new CallByValueCallByReference();
		obj.add(20, 30);
		obj.getEmployeeInfo(obj);
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.name="Ajith";
		obj.age=20;
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.getEmployeeInfo(obj);

	}

}
