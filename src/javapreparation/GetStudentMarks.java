package javapreparation;

public class GetStudentMarks {
	
	
	public int getMarks(String studentName)
	{
		System.out.println("Getting the Students mark from the data base");
		int marks=-1;
		switch (studentName) {
		case "sathish":
			marks=90;
			break;
		case "ajith":
			marks=80;
			break;
		case "vijay":
			marks=70;
			break;

		default:
			System.out.println("Student not found");
			break;
		}
		return marks;
	}

	public static void main(String[] args) {
    
		GetStudentMarks obj=new GetStudentMarks();
		System.out.println(obj.getMarks("vijays"));
	}

}
