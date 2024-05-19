package ExceptionHandling;

public class TryCatchBlock {
	int age;

	public static void main(String[] args) {
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    TryCatchBlock tcb=new TryCatchBlock();
    tcb=null;
    try {
    tcb.age=10;
    }
    catch(NullPointerException e)
    {
    	System.out.println("NPA is found");
	}    
    		
    try {
    int i=9/0;
    }
    catch(ArithmeticException e)
    {
    	System.out.println("AE is found");
    	e.printStackTrace();
    }
    
    System.out.println("Hey Sathish");

	}

}
