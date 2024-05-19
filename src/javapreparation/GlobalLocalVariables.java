package javapreparation;

public class GlobalLocalVariables {
	String name;
    int age;
    String Location;
    
	public static void main(String[] args) {
    GlobalLocalVariables gl=new GlobalLocalVariables();
    gl.name="Sathish";
    gl.age=28;
    gl.Location="Thanjavur";
    
    GlobalLocalVariables gl1=new GlobalLocalVariables();
    gl1.name="Ajith";
    gl1.age=22;
    gl1.Location="Mathur";
    
    GlobalLocalVariables gl2=new GlobalLocalVariables();
    gl2.name="Rakesh";
    gl2.age=15;
    gl2.Location="Trichy";
    
    System.out.println(gl.name+ " "+gl.age+" "+gl.Location);
    System.out.println(gl1.name+ " "+gl1.age+" "+gl1.Location);
    System.out.println(gl2.name+ " "+gl2.age+" "+gl2.Location);
    
    gl=gl1;
    
    System.out.println(gl.name+ " "+gl.age+" "+gl.Location);
    System.out.println(gl1.name+ " "+gl1.age+" "+gl1.Location);
    System.out.println(gl2.name+ " "+gl2.age+" "+gl2.Location);
    
    gl1=gl2;
    
    System.out.println(gl.name+ " "+gl.age+" "+gl.Location);
    System.out.println(gl1.name+ " "+gl1.age+" "+gl1.Location);
    System.out.println(gl2.name+ " "+gl2.age+" "+gl2.Location);
    
    gl2=gl;
    
    System.out.println(gl.name+ " "+gl.age+" "+gl.Location);
    System.out.println(gl1.name+ " "+gl1.age+" "+gl1.Location);
    System.out.println(gl2.name+ " "+gl2.age+" "+gl2.Location);
    

    
	}

}
