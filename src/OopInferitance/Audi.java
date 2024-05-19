package OopInferitance;

public class Audi extends Car {
	
	@Override
	public void start()
	{
		System.out.println("Audi------Start");
	}
	
	public void autoParking()
	{
		System.out.println("Audi------autoParking");
	}
	public void autoBrake()
	{
		System.out.println("Audi------autoBrake");
	}

}
