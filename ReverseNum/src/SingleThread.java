import java.util.*;
public class SingleThread {

	public static void main(String[] args) {
		int n;
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number to generate multiplication table");
		n=in.nextInt();
		Table obj1=new Table(n);
		obj1.start();
	}
}
class Table extends Thread
{
	int n;
	
	public Table(int n) {
		this.n = n;
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	
}
