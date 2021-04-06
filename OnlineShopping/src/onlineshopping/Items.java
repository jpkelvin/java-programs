package onlineshopping;
import java.util.Scanner;
public class Items 
{
	Scanner in=new Scanner(System.in);
	public int a[]=new int[10];
	public int ch[]=new int[10];
	public int ch1[]=new int[10];
	public int ch2,i=0,c=0,k;
	public String PremiumCakes[]= {"DarkChoco","ChocoAlmond","ChocoWalnut"};
	public String OrdinaryCakes[]= {"ChocoVanilla","BlackForest","Vanilla"};
	public int price[]= {800,900,1000};
	public int price1[]= {600,700,750};
	public void Menu()
	{
		System.out.println("Here are variety of flavours for you to choose from!!!");
		System.out.println("@@@@@@ 1. Premium Cakes  @@@@@@@@@@@@@@@@@@@@  2.Ordinary Cakes  @@@@@@");
		for(int i=0;i<3;i++)
		{
			System.out.println(i+"-"+PremiumCakes[i]+"\tRs-"+price[i]+"\t\t\t"+i+"-"+OrdinaryCakes[i]+"\tRs-"+price1[i]);
		}
	}
	public void Shop()
	{	
		do
		{
			System.out.println("Select the product & enter the product category code to proceed!!");
			ch[i]=in.nextInt();
			System.out.println("Enter the product code & quantity");
			ch1[i]=in.nextInt();
			a[i]=in.nextInt();
			System.out.println("Do you wish to continue(1/0)");
			ch2=in.nextInt();
			i++;
		}while(ch2!=0);
	}
	public void display()
	{
		for(i=0;i<2;i++)
		{
			if(ch[i]==1)
			{
				System.out.print(PremiumCakes[ch1[i]]+"\t"+a[0]+"\tRs-"+price[ch1[i]]*a[i]);
				//c=c+price[ch1[i]]*a[i];
			}
			else
			{
				System.out.print("\n"+OrdinaryCakes[ch1[i]]+"\t"+a[1]+"\tRs-"+price1[ch1[i]]*a[i]);
				//c=c+price1[ch1[i]]*a[i];
			}
		}
	}
	public void sum()
	{

		for(i=0;i<2;i++)
		{
			if(ch[i]==1)
			{
				System.out.print(i+"\t"+PremiumCakes[ch1[i]]+"\t"+a[0]+"\tRs-"+price[ch1[i]]*a[i]);
				c=c+price[ch1[i]]*a[i];
			}
			else
			{
				System.out.print("\n"+i+"\t"+OrdinaryCakes[ch1[i]]+"\t"+a[1]+"\tRs-"+price1[ch1[i]]*a[i]);
				c=c+price1[ch1[i]]*a[i];
			}
		}
		System.out.println("\n-------------------------------------------------------------");
		System.out.println(" \n                                  Total Rs-"+c);
	}
}
