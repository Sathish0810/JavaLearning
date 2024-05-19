package javapreparation;

public class MethodChaining {
	
	public void test1()
	{
		System.out.println("test1");
		test2();
	}
	public void test2()
	{
		System.out.println("test2");
		st3();
	}
	public void test3()
	{
		System.out.println("test3");
	}
	public static void st1()
	{
		System.out.println("static1");
		st2();
	}
	public static void st2()
	{
		System.out.println("static2");
		MethodChaining mn=new MethodChaining();
		mn.test2();
	}
	public static void st3()
	{
		System.out.println("static3");
	}

	public static void main(String[] args) {
 
	}

}
