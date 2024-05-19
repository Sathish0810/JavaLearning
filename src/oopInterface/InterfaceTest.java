package oopInterface;

public class InterfaceTest {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.byPassSurgeryServices();
		fh.eyeServices();
		fh.emergencyServices();
		fh.bloodTest();
		
		//Up casting
		USMedical us=new FortisHospital();
		us.emergencyServices();
		
	}

}
