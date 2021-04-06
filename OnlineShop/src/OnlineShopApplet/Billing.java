package OnlineShopApplet;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Login"  width=2000 height=2000></applet>*/
public class Billing extends JApplet {
	JLabel jlab=new JLabel();
	JCheckBox r1=new JCheckBox();
	int i,p,q,r;
	public void init()
	{
		
		setLayout(null);
		getContentPane().setBackground(Color.cyan);
		this.setSize(new Dimension(2000,2000));
		final JLabel  j1=new JLabel("Enter Shipping Details & place Order");
		j1.setFont(new Font("Algerian", Font.BOLD, 39));
		j1.setBounds(550,75,1000,50);
		add(j1);

		final JLabel j2=new JLabel("<html><h1>Name");						final JTextField t1=new JTextField(20);
		j2.setBounds(600,150,260,50);										t1.setBounds(950,165,250,25);
		add(j2);															add(t1);//store(t1);
		
		final JLabel j3=new JLabel("<html><h1>Phone No");					final JTextField t2=new JTextField(20);
		j3.setBounds(600,200,260,50);										t2.setBounds(950,215,250,25);
		add(j3);															add(t2);
		
		final JLabel j4=new JLabel("<html><h1>Select Product");				final Choice ch1=new Choice();	    	ch1.add("Shirt1 Rs-1800/-");   ch1.add("Saree Rs-3800/-"); ch1.add("Boys1 Rs-3800/-");
		j4.setBounds(600,250,260,50);										ch1.setBounds(950,265,250,25);			ch1.add("Shirt2 Rs-2800/-");   ch1.add("Boys1 Rs-2800/-"); ch1.add("Girls Rs-2800/-");
		add(j4);															add(ch1);								ch1.add("Girls2 Rs-3800/-");
		
		final JLabel j5=new JLabel("<html><h1>Price");						final JTextField t3=new JTextField(20);
		j5.setBounds(600,300,260,50);										t3.setBounds(950,315,250,25);
		add(j5);															add(t3);
		
		final JLabel j6=new JLabel("<html><h1>Quantity");					final Choice ch2=new Choice();	
		j6.setBounds(600,350,260,50);										ch2.setBounds(950,365,250,25);
		add(j6);															add(ch2);						for(i=1;i<=10;i++)
																												ch2.add(String.valueOf(i));
		
		final JLabel j7=new JLabel("<html><h1>Enter your Address");				final JTextField t5=new JTextField(20);
		j7.setBounds(600,400,260,50);										t5.setBounds(950,415,250,75);
		add(j7);															add(t5);
		
		final JButton b1=new JButton("Confirm Order");
		b1.setBounds(1000,500,150,25);
		add(b1);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	setLayout(null);
				getContentPane().setBackground(Color.white);
				setSize(new Dimension(1500,700));
				
					j1.hide();j2.hide();j3.hide();j4.hide();j5.hide();j6.hide();j7.hide();
					b1.hide();t1.hide();t2.hide();t3.hide();t5.hide();ch1.hide();ch2.hide();
					p=Integer.parseInt(t3.getText());
					q=Integer.parseInt(ch2.getSelectedItem());
					r=p*q;
					JLabel  a0=new JLabel("Invoice Details");
					a0.setFont(new Font("Algerian", Font.BOLD, 59));a0.setForeground(Color.BLUE);
					a0.setBounds(550,75,1000,50);
					add(a0);
					for(int i=0;i<1000;i+=25) {
					JLabel a1=new JLabel("*");
					a1.setFont(new Font("Algerian", Font.BOLD, 39));
					a1.setBounds(i+250,105,1983,150);
					add(a1);
					}
					JLabel a=new JLabel("Name  -");							JLabel a1=new JLabel(t1.getText());
					a.setFont(new Font("Algerian", Font.BOLD, 39));				a1.setFont(new Font("Algerian", Font.BOLD, 49));
					a.setBounds(300,150,250,150);								a1.setBounds(600,150,250,150);
					add(a);														add(a1);
					
					JLabel b=new JLabel("Address  -");							JLabel b1=new JLabel(t5.getText());
					b.setFont(new Font("Algerian", Font.BOLD, 39));				b1.setFont(new Font("Algerian", Font.BOLD, 49));
					b.setBounds(300,200,250,150);								b1.setBounds(600,200,250,150);
					add(b);														add(b1);
					
					JLabel c=new JLabel("Phone No  -");							JLabel c1=new JLabel(t2.getText());
					c.setFont(new Font("Algerian", Font.BOLD, 39));				c1.setFont(new Font("Algerian", Font.BOLD, 49));
					c.setBounds(300,250,250,150);								c1.setBounds(600,250,250,150);
					add(c);														add(c1);
					
					JLabel f=new JLabel("Product  -");							JLabel f1=new JLabel(ch1.getSelectedItem());
					f.setFont(new Font("Algerian", Font.BOLD, 39));				f1.setFont(new Font("Algerian", Font.BOLD, 49));
					f.setBounds(500,300,250,150);								f1.setBounds(800,300,660,150);
					add(f);														add(f1);
					
					JLabel g=new JLabel("Quantity -");							JLabel g1=new JLabel(ch2.getSelectedItem());
					g.setFont(new Font("Algerian", Font.BOLD, 39));				g1.setFont(new Font("Algerian", Font.BOLD, 49));
					g.setBounds(500,350,250,150);								g1.setBounds(800,350,660,150);
					add(g);														add(g1);
					
					for(int i=0;i<1000;i+=25) {
						JLabel a3=new JLabel("-");
						a3.setFont(new Font("Algerian", Font.BOLD, 39));
						a3.setBounds(i+250,375,1983,150);
						add(a3);
						}
					
					JLabel d=new JLabel("Total Amount-"+String.valueOf(r));
					d.setFont(new Font("Algerian", Font.BOLD, 29));
					d.setBounds(600,400,450,150);
					add(d);
					
					for(int i=0;i<1000;i+=25) {
						JLabel a2=new JLabel("*");
						a2.setFont(new Font("Algerian", Font.BOLD, 39));
						a2.setBounds(i+250,445,1983,150);
						add(a2);
						}
					
					JLabel g2=new JLabel("...............Thankyou for Shopping.............");
					g2.setFont(new Font("Algerian", Font.BOLD, 29));
					g2.setBounds(400,490,650,150);
					add(g2);
			};
		});
	}
}
