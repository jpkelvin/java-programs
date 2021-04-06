import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code ="PasswordApplet" width=400 height=400></applet>*/
public class PasswordApplet extends JApplet
{
	String pass[]= {"a1","b2","c3"};
	public void init()
	{
		setLayout(new FlowLayout());
		JLabel l1= new JLabel("Enter your username\n");
		add(l1);
		
		JTextField t1=new JTextField(20);
		add(t1);
		
		JLabel l2= new JLabel("Enter your password\n");
		add(l2);
		
		final JPasswordField t2=new JPasswordField(20);
		add(t2);
		
		JButton b1= new JButton("Submit");
		add(b1);
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						String a= new String(t2.getPassword());
						if(a.equals(pass[1]))
						showStatus("Welcome");
						else
							showStatus("Invalid User");
					}
				});
	}
}
