package oopInterface;

public class FortisHospital extends AppolloHospital implements USMedical,UKMedical,INMedical {
    //US
	public void orthoService() {
		System.out.println("orthoService");
	}

	public void dentalServices() {
		System.out.println("dentalServices");

	}

	public void eyeServices() {
		System.out.println("eyeServices");

	}

	@Override
	public void pediaService() {
		System.out.println("pediaService");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");
		
	}

	@Override
	public void heartTransplantServices() {
		System.out.println("heartTransplantServices");
		
	}

	@Override
	public void LiverTranplantService() {
		System.out.println("LiverTranplantService");
		
	}

	@Override
	public void kidneyTransplantServices() {
		System.out.println("kidneyTransplantServices");
		
	}

	@Override
	public void byPassSurgeryServices() {
		System.out.println("byPassSurgeryServices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("emergencyServices");
		
	}

	public void covidVaccination() {
		// TODO Auto-generated method stub
		
	}

}
