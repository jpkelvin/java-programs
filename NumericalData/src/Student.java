
public class Student extends TestData {
	String name;
	int roll;
	
	public Student(String name, int age, String name2, int roll) {
		super(name, age);
		name = name2;
		this.roll = roll;
	}

	public void showDetails()
	{
		System.out.println("roll no"+roll);
		System.out.println("name  "+name);
	}
	

	
}
