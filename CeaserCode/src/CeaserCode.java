import java.util.*;
public class CeaserCode {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String a;
		char b[]=new char[10];
		for(int k=0;k<=2;k++)
		{
			int m=0;
			System.out.println("Enter a Plain Text");
			a=in.next();
			String c = a.toLowerCase();
			char[] str= c.toCharArray();
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<alphabet.length;j++)
				{
					if(str[i]==alphabet[j])
					{
						b[m]=alphabet[j+4];
						m++;
						break;
					}
				}
			}
			System.out.print("The Encrypted Cypher Text is - ");
			String d=new String(b);
			System.out.println(d.toUpperCase());
		}
		System.out.println("Thank You");
	}
}
