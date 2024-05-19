package ExceptionHandling;



public class MultipleCatchBlock {
	   int age;
	public static void main(String[] args) {
		MultipleCatchBlock mc=new MultipleCatchBlock();
		mc=null;
		System.out.println("Hiii");
		try {
			//mc.age=10;
			int k=9/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("NPA");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE");
			e.printStackTrace();
		}
    
    	
    	
    }
	}


