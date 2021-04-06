package onlineshopping;
import java.util.*;
public class Login
{
	Scanner in=new Scanner(System.in);
	String a,b;
	int found=0;
	String user[]= {"aa","bb","cc"};
	String pass[]= {"a1","b2","c3"};
	public void login()
	{
	System.out.println("\nPlease Login to proceed");
	System.out.println("Enter your username");
	a=in.next();
	System.out.println("Enter your  password");
	b=in.next();
	}
	public void validate()
	{	for(int i=0;i<3;i++)
		{
			if((a.equals(user[i]))&&(b.equals(pass[i])))
			{	found=1;
				break;
			}
		}
		if(found==1)
			System.out.println("               You are valid user - "+a);
		else {
			System.out.println("Invalid username/password");
			login();
	}
}
}