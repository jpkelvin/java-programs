package OnlineShopApplet;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Login" width=400 height=600></applet>*/
public class Login extends JApplet
{JLabel j3=new JLabel();
	public void init()
	{	final String pass[]= {"a1","b2","c3"};
		setLayout(null);
		getContentPane().setBackground(Color.pink);
		this.setSize(new Dimension(2000,2000));
		final JLabel j1=new JLabel("<html><h1>Enter your name");						final JTextField t1=new JTextField(20);
		j1.setBounds(700,95,200,30);													t1.setBounds(950,100,200,25);
		add(j1);																		add(t1);
		
		final JLabel j2=new JLabel("<html><h1>Enter your password");					final JPasswordField t2=new JPasswordField(20);
		j2.setBounds(700,140,250,50);													t2.setBounds(950,155,200,25);
		add(j2);																		add(t2);
			
		final JButton b1 =new JButton("<html><h2>Back to home");								final JButton b2 =new JButton("<html><h2>Login");
		b1.setBounds(0,0,190,25);													b2.setBounds(1000,200,90,25);
		add(b1);																		add(b2);
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				j1.hide();j2.hide();t2.hide();t1.hide();b1.hide();b2.hide();
				Billing r1= new Billing();				
				r1.init();
				add(r1,null);}
		
		});
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				j1.hide();j2.hide();t2.hide();t1.hide();b1.hide();b2.hide();
				OnlineShop r1= new OnlineShop();				
				r1.init();
				add(r1,null);
				}
		});
	}
}
