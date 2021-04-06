
public class StudentEnroll {
	private String id,name,branch;
	private static int count;
	private static String orgname;
	public StudentEnroll(String id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public void showData()
	{
		System.out.println(id+" "+name+" "+branch+" "+count);
	}
	static {
		count=100;
		orgname="GcEM";
		System.out.println("Static block 1 is invoked");
		//id=121;
	}
	static {
		count=200;
		orgname="Dee";
		System.out.println("Static block 2 is invokerf");
	}
}
