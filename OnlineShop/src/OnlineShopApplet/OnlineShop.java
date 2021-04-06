package OnlineShopApplet;
import OnlineShopApplet.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageProducer;
/*<applet code="Login"  width=400 height=400></applet>*/
public class OnlineShop extends JApplet{
	JTabbedPane tabbedPane;
	JLabel j1,j;JButton b1,b2;
	ImageIcon i= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\s1.jpg");
	ImageIcon i1= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\s2.jpg");
	ImageIcon i2= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\boys1.jpg");
	ImageIcon i3= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\boys2.jpg");
	ImageIcon i4= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\girl1.jpg");
	ImageIcon i5= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\girl2.jpg");
	ImageIcon i6= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\Saree.png");
	public void init()
	{
		
		
		ImageIcon i7= new ImageIcon("D:\\Eclipse\\Programs\\OnlineShop\\src\\OnlineShopApplet\\pics\\home.jpg");
		setLayout(null);
		getContentPane().setBackground(Color.blue);
		this.setSize(new Dimension(2000,2000));
		
		final JLabel j1= new JLabel("PRINCE FASHION");
		j1.setFont(new Font("Algerian", Font.BOLD, 99));
		j1.setForeground(Color.white);
		j1.setBounds(0,1, 1000, 200);
		add(j1);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);		JTabbedPane tabbedPane_0 = new JTabbedPane(JTabbedPane.RIGHT);				JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.RIGHT);				JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.RIGHT);			JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.RIGHT);		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane.setFont(new Font("Algerian", Font.PLAIN, 99));				tabbedPane.addTab("Home", null, tabbedPane_0);								tabbedPane.addTab("Men", null, tabbedPane_1);								tabbedPane.addTab("Women", null, tabbedPane_2);							tabbedPane.addTab("Boys", null, tabbedPane_3);						tabbedPane.addTab("Girls", null, tabbedPane_4);
		getContentPane().add(tabbedPane, BorderLayout.NORTH);			
		tabbedPane.setBounds(0, 150, 2000, 800);
		
		JButton b= new JButton("WELCOMES YOU",i7);
		b.setForeground(Color.BLUE);
		b.setFont(new Font("Algerian", Font.ITALIC, 120));
		b.setBackground(new Color(255, 255, 255));
		tabbedPane_0.addTab("Home",i7, b, null);
		
		JButton b0= new JButton("<html> Rs-1800/-<br>BuyNow",i);	JButton b5= new JButton("<html> Rs-2800/-<br>BuyNow",i1);	JButton b6= new JButton("<html> Rs-3800/-<br>BuyNow",i2);	JButton b7= new JButton("<html>Rs-2800/-<br>BuyNow",i3);	JButton b8= new JButton("<html> Rs-2800/-<br>BuyNow",i4);	JButton b9= new JButton("<html> Rs-2800/-<br>BuyNow",i5);	JButton b10= new JButton("<html> Rs-3800/-<br>BuyNow",i6);
		b0.setFont(new Font("Algerian", Font.PLAIN, 60));			b5.setFont(new Font("Algerian", Font.PLAIN, 50));			b6.setFont(new Font("Algerian", Font.PLAIN, 50));			b7.setFont(new Font("Algerian", Font.PLAIN, 50));			b8.setFont(new Font("Algerian", Font.PLAIN, 50));			b9.setFont(new Font("Algerian", Font.PLAIN, 50));			b10.setFont(new Font("Algerian", Font.PLAIN, 50));
		b0.setBackground(new Color(255, 255, 255));					b5.setBackground(new Color(255, 255, 255));					b6.setBackground(new Color(255, 255, 255));					b7.setBackground(new Color(255, 255, 255));					b8.setBackground(new Color(255, 255, 255));					b9.setBackground(new Color(255, 255, 255));					b10.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Shrits",i, b0, null);					tabbedPane_1.addTab("Shirts",i1, b5, null);					tabbedPane_3.addTab("Boys",i2, b6, null);					tabbedPane_3.addTab("Boys",i3, b7, null);					tabbedPane_4.addTab("Girls",i4, b8, null);					tabbedPane_4.addTab("Girls",i5, b9, null);					tabbedPane_2.addTab("Girls", i6, b10, null);
		
		final JButton b1 =new JButton("<html><h2>Login");								final JButton b2 =new JButton("<html><h2>SingUp");
		b1.setBounds(1500,100,190,55);													b2.setBounds(1700,100,190,55);
		add(b1);																		add(b2);

b1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b0.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b5.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b6.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
		Billing b1= new Billing();
		b1.init();
		add(b1,null);
	}
});
b7.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b8.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b9.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b10.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b0.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b5.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Login r1= new Login();				
		r1.init();
		add(r1,null);
	}
});
b2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{	
		tabbedPane.hide();j1.hide();
		b1.hide();b2.hide();
		Register r1= new Register();				
		r1.init();
		add(r1,null);
	}
});


		
}
}
