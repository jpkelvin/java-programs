abstract public class TestData {
	String name;
	int age;
	public TestData(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	public void showBasicDetails()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
	}
abstract public void showDetails();
}