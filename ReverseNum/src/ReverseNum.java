import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		int n,res;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number(Single digit not allowed)");
		n=in.nextInt();
		res= rev(n);
		System.out.println("\nThe resversed no of - "+n+"\t is - "+res );
	}
	static int rev(int a)
	{
		int sum=0,rem;
		while(a!=0)
		{ 
			rem=a%10;
			sum=sum*10 + rem;
			a=a/10;
			System.out.print(rem+" ");
		}
		return sum;
	}
}
