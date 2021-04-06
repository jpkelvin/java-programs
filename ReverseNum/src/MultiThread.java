import java.util.*;
public class MultiThread 
{
	public static void main(String[] args)
	{
		System.out.println("@@@@@@@@@@@@ Random No is generated & Square & Cube is computed @@@@@@@@@@@@@@@@");
		RandNum obj1=new RandNum();
		obj1.start();
	}
}
class RandNum extends Thread
{
	int n;
	Random r =new Random();
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		n=r.nextInt(10);
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
class Square extends Thread
{
	int n;

	public Square(int n) {
		this.n = n;
	}
	public void run()
	{
		System.out.println("The square of the number is "+n*n);
	}
	
	
}
class Cube extends Thread
{
	int n;

	public Cube(int n) {
		this.n = n;
	}
	public void run()
	{
		System.out.println("The cube of the number is "+n*n*n);
	}
}