package javapreparation;

public class LoopConcepts {

	public static void main(String[] args) {
    //Print 1 to 10
		int i=1;
		while(i<=10)
		{
			//System.out.println(i);
			i++;
		}
		
		//Print the odd numbers from 1 to 100
		int j=1;
		while(j<=100)
		{
			//System.out.println(j);
			j=j+2;
		}
		int k=1;
		while(true)
		{
			System.out.println("Welcome to JAVA");
			if(k==5)
			{
				break;
			}
			k++;
		}
	}

}
