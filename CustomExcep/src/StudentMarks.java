import java.io.*;
public class StudentMarks {
	int marks;

	public StudentMarks(int marks) {
		this.marks = marks;
	}
	public void validate() throws Invalid, FileNotFoundException
	{
		if(marks<0||marks>100)
		{
			throw new Invalid(marks+"is not valid");
		}else
			System.out.println("entey ok");
		FileReader fr =null;
		fr =new FileReader("hiii");
	}
	public static void main(String[] args) {
		StudentMarks m=new StudentMarks(-10);
		try {
			m.validate();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Invalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
