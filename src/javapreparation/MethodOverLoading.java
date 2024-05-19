package javapreparation;

public class MethodOverLoading {
	
	public int test(String name,int i, int j)
	{
		System.out.println(name);
		int k=i+j;
		return k;
	}
	public int test(String name,int i)
	{
		System.out.println(name);
		int k=i;
		return k;
	}

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println(obj.test("sathish", 100, 90));
		
    
	}

}
