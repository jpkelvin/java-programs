
public class StudentEnroll {
	private String id,name;
	private static int count;
	private static String orgname="GCEM";
	public StudentEnroll(String id, String name, int count) {
		this.id = id;
		this.name = name;
		this.count = count;
	}
	public void showData()
	{
		System.out.println(id+"\t"+name+"\t"+count);
	}
	public static void setOrgName(String org,StudentEnroll s)
	{
		orgname=org;
		s.id="newid";
	}
	public static void showOrgData()
	{
		System.out.println("\nOrganization Data0");
		System.out.println("Name "+orgname);
		System.out.println("total stud enrolled "+count);
		
	}
}

