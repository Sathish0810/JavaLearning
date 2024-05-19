package javapreparation;

public class MethodsInJava {
    
	//No input, No return
	public void methodsInJava()
	{
		System.out.println("Test");
	}
	//No input return something
	public int totalAmount()
	{
		System.out.println("Printing total amount");
		int i=10;
		int tax=5;
		int total=i+tax;
		return total;
		
	}
	//Input and return something
	public int add(int a, int b)
	{
		System.out.println("Addition of two numbers");
		int add=a+b;
		return add;
	}
	public static void main(String[] args) {
		MethodsInJava obj=new MethodsInJava();
		obj.methodsInJava();
		int num=obj.totalAmount();
		System.out.println(num);
		int sum=obj.add(99, 77);
		System.out.println(sum);
	}

}
