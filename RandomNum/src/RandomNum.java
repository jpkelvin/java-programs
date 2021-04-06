import java.util.*;
public class RandomNum {

	public static void main(String[] args) {
		System.out.println("Rabdom Number is getting generated");
		RandNum obj=new RandNum();
		obj.start();
	}

}
class RandNum extends Thread
{
	int n;
	Random r= new Random();
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			n=r.nextInt(10);
			System.out.println(n);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}