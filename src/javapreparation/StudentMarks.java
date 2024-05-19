package javapreparation;

public class StudentMarks {
	
public int studentName(String name)
{
	int marks=-1;
	if(name.equalsIgnoreCase("sathish"))
	{
		marks=80;
	}
	else if(name.equalsIgnoreCase("ajith"))
	{
		marks=70;
	}
	else if(name.equalsIgnoreCase("vijay"))
	{
		marks=50;
	}
	else
	{
		System.out.println("Student name is not found in the data base");
	}
	return marks;
}

	public static void main(String[] args) {
		
		StudentMarks obj=new StudentMarks();
		System.out.println(obj.studentName("Raj"));
	}

}
