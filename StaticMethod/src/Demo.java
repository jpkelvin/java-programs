
public class Demo {
	public static void main(String args[])
	{
		StudentEnroll s1=new StudentEnroll("1727","kelvin",8345);
		StudentEnroll s2=new StudentEnroll("1727","elvin",8345);
		StudentEnroll s3=new StudentEnroll("1727","lvin",8345);
		s1.showData();
		s3.showData();
		s2.showData();
		StudentEnroll.showOrgData();
		StudentEnroll.setOrgName("Gcem Bangalore",s1);
		s1.showData();
		s3.showData();
		s2.showData();
		StudentEnroll.showOrgData();
	}
	

}
