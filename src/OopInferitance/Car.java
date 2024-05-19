package OopInferitance;

public class Car extends Vehicle {
	
	@Override
	public void start()
	{
		System.out.println("Car------Start");
	}
	public void stop()
	{
		System.out.println("Car------stop");
	}
	public void fuelRefill()
	{
		System.out.println("Car------fuelRefill");
	}
	public void gear()
	{
		System.out.println("Car------gear");
	}
	

}
