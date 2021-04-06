public class StudentEnroll {
private String id,name,branch;
public static int count=0;
public StudentEnroll(String id, String name, String branch) 
{
	this.id = id;
	this.name = name;
	this.branch = branch;
	count++;
}
public void showData()
{
	System.out.println(name+"\t"+branch+"\t"+id+"\t"+count);
	}
}
