package javapreparation;

public class ForLoopConcept {

	public static void main(String[] args) {
    //Print 1 to 10
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
		int k;
		for(k=1;k<=5;)
		{
			System.out.println(k);
			k++;
		}
		int m=1;
		for(;;)
		{
			System.out.println("Welcome to Learn java");
			if(m==5)
			{
				break;
			}
			m++;
		}
	}

}
