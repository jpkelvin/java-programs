import java.util.*;
public class SquCube {
	public static void main(String[] args) {
		int n;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number");
		n=in.nextInt();
		Square obj=new Square(n);
		obj.start();
		Cube obj1=new Cube(n);
		obj1.start();
	}
}
class Square extends Thread
{
	int n;
	public Square(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println("Square of no is "+n*n);
	}
}
class Cube extends Thread
{
	int n;
	public Cube(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println("Cube of no is "+n*n*n);
	}
}
