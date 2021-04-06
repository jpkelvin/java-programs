import java.util.*;
public class crc {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int data[],div[],divisor[],n,n1,l,i,crc[],rem[];
		System.out.println("Enter the no of data bits");
		n=in.nextInt();
		System.out.println("Enter the data bits");
		data = new int[n];
		for(i=0;i<n;i++)
			data[i]=in.nextInt();
		System.out.println("Enter the no of divisor bits");
		n1=in.nextInt();
		System.out.println("Enter the divisor bits");
		divisor = new int[n1];
		for(i=0;i<n1;i++)
			divisor[i]=in.nextInt();
		l=n+n1-1;
		crc = new int[l];
		rem=new int[l];
		div=new int[l];
		for(i=0;i<data.length;i++)
			div[i]=data[i];
		System.out.println("Divident(After Appending 0's) are");
		for(i=0;i<div.length;i++)
			System.out.print(div[i]);
		System.out.println();
		for(i=0;i<div.length;i++)
			rem[i]=div[i];
		rem=divide(div,divisor,rem);
		for(i=0;i<div.length;i++)
			crc[i]=div[i]^rem[i];
		System.out.println("CRC Code");
		for(i=0;i<crc.length;i++)
			System.out.print(crc[i]);
		System.out.println("\nEnter CRC code of "+l+" bits");
		for(i=0;i<crc.length;i++)
		{
			crc[i]=in.nextInt();
		}
		for(i=0;i<crc.length;i++)
			rem[i]=crc[i];
		rem=divide(crc,divisor,rem);
		for(i=0;i<rem.length;i++)
		{
			if(rem[i]!=0)
			{
				System.out.println("Error");
				break;
			}
			if(i==rem.length-1)
				System.out.println("No Error");
		}
		System.out.println("Thank you");
	}
	private static int[] divide(int[] div, int[] divisor, int[] rem) {
		int i,c=0;
		while(true)
		{
			for(i=0;i<divisor.length;i++)
				rem[c+i]=rem[c+i]^divisor[i];
			while(rem[c]==0&& c!=rem.length-1)
				c++;
			if((rem.length-c)<divisor.length)
				break;
		}
		return rem;
	}

}
