package OopInferitance;

public class TestInferitance {

	public static void main(String[] args) {
    BMW b =new BMW();
    b.start();
    b.autoParking();
    b.autoBrake();
    b.vehicleEngine();
    
    System.out.println("--------------------");
    Car c=new Car();
    c.start();
    
    System.out.println("-------------------");
    Car c1=new BMW();
    c1.start();
    c1.fuelRefill();
    //c1.autoParking --- Reference check will fail for the individual methods in Top casting
    
    System.out.println("-----------------------");
    
    BMW b1=(BMW)new Car();//-----Will give class cast exception on run time, down casting is not possible in JAVA
    
	}

}
