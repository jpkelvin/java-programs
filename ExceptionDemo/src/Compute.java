import java.util.*;
public class Compute {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a,b;
		for(int i=0;i<2;i++)
		{
		System.out.println("Enter the value of a & b");
		a=in.nextInt();
		b=in.nextInt();
		try{
			int c=a/b;
			System.out.println("quotient ="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program ended");
		}
		}
	}

}
