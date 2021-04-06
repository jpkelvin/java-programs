package OnlineShopApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Register"  width=2000 height=2000></applet>*/
public class Register extends JApplet
{	int i=0;
	String[] name = null,email=null,phone=null,password=null;
	public JTextField t1;
	public void init()
	{
		setLayout(null);
		getContentPane().setBackground(Color.magenta);
		this.setSize(new Dimension(2000,2000));
		final JLabel j1=new JLabel("Registration Form");
		j1.setFont(new Font("Algerian", Font.BOLD, 69));
		j1.setBounds(550,75,1000,50);
		add(j1);				
		
		final JLabel j2=new JLabel("<html><h1>Enter your name");					final JTextField t1=new JTextField(20);
		j2.setBounds(600,150,260,50);										t1.setBounds(950,165,250,25);
		add(j2);															add(t1);//store(t1);
		
		final JLabel j3=new JLabel("<html><h1>Email id");							final JTextField t2=new JTextField(20);
		j3.setBounds(600,200,260,50);										t2.setBounds(950,215,250,25);
		add(j3);															add(t2);
		
		final JLabel j4=new JLabel("<html><h1>Phone No");							final JTextField t3=new JTextField(20);
		j4.setBounds(600,250,260,50);										t3.setBounds(950,265,250,25);
		add(j4);															add(t3);
		
		final JLabel j5=new JLabel("<html><h1>Enter New Password");				final JPasswordField t4=new JPasswordField(20);
		j5.setBounds(600,300,260,50);										t4.setBounds(950,315,250,25);
		add(j5);															add(t4);
		
		final JLabel j6=new JLabel("<html><h1>Confirm Password");					final JPasswordField t5=new JPasswordField(20);
		j6.setBounds(600,350,260,50);										t5.setBounds(950,365,250,25);
		add(j6);															add(t5);
		
		
		final JCheckBox c1=new JCheckBox("");										final JLabel j7=new JLabel("<html><h2><i>I accept terms & conditions");	
		c1.setBounds(700,400,20,20);										j7.setBounds(730,230,360,360);
		add(c1);															add(j7);
		
		final JButton b1=new JButton("<html><h2>Submit");								final JButton b2=new JButton("<html><h2>Back to Home");
		b1.setBounds(1000,425,150,25);										b2.setBounds(0,5,190,25);
		add(b1);															add(b2);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	j1.hide();j2.hide();j3.hide();j4.hide();j5.hide();j6.hide();j7.hide();b1.hide();
				t1.hide();t2.hide();t3.hide();t5.hide();t4.hide();j6.hide();b1.hide();c1.hide();
				Billing r1= new Billing();				
				r1.init();
				add(r1,null);
			}
	});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				j1.hide();j2.hide();j3.hide();j4.hide();j5.hide();j6.hide();j7.hide();b1.hide();
				t1.hide();t2.hide();t3.hide();t5.hide();t4.hide();j6.hide();b1.hide();c1.hide();b2.hide();
				OnlineShop r1= new OnlineShop();				
				r1.init();
				add(r1,null);
				}
		});
	}	
	
}

