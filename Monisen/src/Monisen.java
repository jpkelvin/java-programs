import java.util.Scanner;
import java.lang.Math;
public class Monisen {

	public static void main(String[] args)
	{
		int p,m; int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a limit to generate Monisen Numbers");
		n=in.nextInt();
		Moni obj=new Moni();
		for(p=2;p<n;p++)
		{
			if(obj.prime(p)!=0)
			{
				m=(int)Math.pow(2, p)-1;
				if(obj.prime(m)!=0)
				{
					System.out.println(p+"-"+m);
				}
			}
		}
		
	}

}
class Moni
{
	int prime(int p)
	{  
		for(int i=2;i<p;i++)
		{
			if(p%i==0)
				return 0;
		}
		return 1;
	}
}