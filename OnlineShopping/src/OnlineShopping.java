import onlineshopping.*;

import onlineshopping.Billing;
import onlineshopping.Items;
import onlineshopping.Login;

public class OnlineShopping 
{

	public static void main(String[] args) 
	{	
		System.out.println("*****************WELCOME TO DELICIOUS CAKES******************");
		System.out.println("-------------------------------------------------------------");
		Items obj1 =new Items();
		obj1.Menu();
		obj1.Shop();
		System.out.println("Your Cart");
		obj1.display();
		Login obj=new Login();
		obj.login();
		obj.validate();
		Billing obj2=new Billing();
		obj2.bill();
		System.out.println("-------------------------------------------------------------");
		obj1.sum();
		System.out.println("-------------------Thankyou for Shopping---------------------");
	}
}