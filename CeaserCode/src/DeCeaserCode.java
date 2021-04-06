import java.util.*;
public class DeCeaserCode {
	public static void main(String[] args)
	{
		String b;
		char str[]=new char[10];
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner in=new Scanner(System.in);
		for(int k=0;k<=2;k++)
		{
			int m=0;
			System.out.println("Enter the cipher text");
			b=in.next();
			String c = b.toLowerCase();
			char[] a=c.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<alphabet.length;j++)
				{
					if(a[i]==alphabet[j])
					{
						str[m]= alphabet[j-4];
						m++;
						break;
					}
				}
			}
			System.out.print("The Decrypted Original Text is - ");
			String d=new String(str);
	     	System.out.println(d.toUpperCase());
		}
		System.out.println("Thank You");
	}
}
