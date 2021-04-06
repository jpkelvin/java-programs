public class Employee extends TestData{
	String emp;
	int sal;
	public Employee(String name, int age, String emp, int sal) {
		super(name, age);
		this.emp = emp;
		this.sal = sal;
	}
	public void showDetails()
	{
		System.out.println("emp id "+emp);
		System.out.println("emp sal "+sal);
	}
}