package javapreparation;

public class Car {
	
	String name;
	String colour;
	int price;
	static final int wheels=4;

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.name="innova";
		c1.colour="white";
		c1.price=30;
		
		Car c2=new Car();
		c2.name="toyota";
		c2.colour="red";
		c2.price=40;
		
		Car c3=new Car();
		c3.name="crysta";
		c3.colour="blue";
		c3.price=50;
		
		System.out.println(c1.name+" "+c1.colour+" "+c1.price+" "+Car.wheels);
		System.out.println(c2.name+" "+c2.colour+" "+c2.price+" "+Car.wheels);
		System.out.println(c3.name+" "+c3.colour+" "+c3.price+" "+Car.wheels);
		
		System.out.println(Car.wheels);
		System.out.println(wheels);

		
		
		
    
	}

}
