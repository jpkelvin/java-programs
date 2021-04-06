import java.util.Scanner;
public class StaffMain 
{

	public static void main(String[] args) 
	{
		Teaching a[]=new Teaching[10];
		Technical b[]=new Technical[10];
		Contract c[]=new Contract[10];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the teaching staff details");
			a[i]=new Teaching();
			a[i].read();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the technical staff details");
			b[i]=new Technical();
			b[i].read();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Contract staff details");
			c[i]=new Contract();
			c[i].read();
		}
		System.out.println("--------------Teaching Staff Details---------------------------------");
		System.out.println("Id\tName\tPhone\tSalary\tDomain\tPublications\n");
		for(int i=0;i<3;i++)
		{
			a[i].display();
		}
		System.out.println("--------------Technical Staff Details---------------------------------");
		System.out.println("Id\tName\tPhone\tSalary\tSkills\n");
		for(int i=0;i<3;i++)
		{
			b[i].display();
		}
		System.out.println("--------------Contract Staff Details---------------------------------");
		System.out.println("Id\tName\tPhone\tSalary\tContractPeriod\n");
		for(int i=0;i<3;i++)
		{
			c[i].display();
		}

	}

}
class Staff
{
	String a,b,c,d;
	void read()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the Staff id, name , phone, sal");
		a=in.next();
		b=in.next();
		c=in.next();
		d=in.next();		
	}
	void display()
	{
		System.out.print(a+" \t"+b+" \t"+c+" \t"+d);
	}
}
class Teaching extends Staff
{
	String dom,pub;
	void read()
	{
		super.read();
		Scanner in =new Scanner(System.in);
		System.out.println("enter the Staff domain& publication");
		dom=in.next();
		pub=in.next();
	}
	void display()
	{
		super.display();
		System.out.print("\t"+dom+"\t"+pub+"\n");
	}
}
class Technical extends Staff
{
	String skills;
	void read()
	{
		super.read();
		Scanner in =new Scanner(System.in);
		System.out.println("enter the Staff skills");
		skills=in.next();
	}
	void display()
	{
		super.display();
		System.out.print("\t"+skills+"\n");
	}
}
class Contract extends Staff
{	
	String con;
	void read()
	{
		super.read();
		Scanner in =new Scanner(System.in);
		System.out.println("enter the Staff Contract period");
		con=in.next();
	}
	void display()
	{
		super.display();
		System.out.print("\t"+con+"\n");
	}
	
}
