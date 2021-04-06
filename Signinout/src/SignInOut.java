import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="SignInOut" width = 400 height= 400></applet>*/
public class SignInOut extends JApplet
{
	JLabel jlab=new JLabel("<html><h1><i>Welcome</i></h1></html>");
	public void init()
	{
		add(jlab);
		setLayout(new FlowLayout());
		final JButton j1=new JButton("<html><h1><i>Sign In");
		add(j1);
		final JButton j2=new JButton("<html><h1><i>Sign Up");
		add(j2);
		j1.addActionListener(new ActionListener()
		{
				public  void actionPerformed(ActionEvent ae)
				{
					j1.hide();
					j2.hide();
					final JLabel j1=new JLabel("<html><h1><i>Enter your Name</i></h1></html>");
					jlab.setText("<html><head><h1>Hi Please Login</h1></head></html>");
					add(jlab);
					add(j1);
					final JTextField j2=new JTextField(20);
					add(j2);
					final JLabel j3=new JLabel("<html><h1><i>Enter your Password</i></h1></html>");
					add(j3);
					final JPasswordField j4= new JPasswordField(20);
					add(j4);
					final JButton j5= new JButton("<html><h1><i>Submit");
					add(j5);
					j5.addActionListener(new ActionListener()
					{
						public  void actionPerformed(ActionEvent ae)
						{
							j1.hide();j2.hide();j3.hide();j4.hide();j5.hide();
							jlab.setText("<html><h1><i>Welcome  "+j2.getText());
							add(jlab);
							JButton j5= new JButton("<html><h1><i>SignOut");
							add(j5);
							j5.addActionListener(new ActionListener()
							{
								public  void actionPerformed(ActionEvent ae)
								{
									jlab.setText("<html><h1><i>Thankyou</i></h1></html>");
								}
							});
						}	
					});
				}
		});
		j2.addActionListener(new ActionListener()
		{
				public  void actionPerformed(ActionEvent ae)
				{
					j1.hide();
					j2.hide();
					jlab.setText("<html><head><h1>Register");
					add(jlab);
					final JLabel j1=new JLabel("<html><h1><i>Enter your Name</i></h1></html>");
					add(j1);
					final JTextField j2=new JTextField(20);
					add(j2);
					final JLabel j3=new JLabel("<html><h1><i>Select your age</i></h1></html>");
					add(j3);
					final JRadioButton j4= new JRadioButton("<html><h1><i>18-20");
					j4.addActionListener(this);
					add(j4);
					final JRadioButton j5= new JRadioButton("<html><h1><i>20-40");
					j5.addActionListener(this);
					add(j5);
					final JLabel j6=new JLabel("<html><h1><i>Select Gender</i></h1></html>");
					add(j6);
					final JCheckBox j7=new JCheckBox("<html><h1><i>Male");
					final JCheckBox j8=new JCheckBox("<html><h1><i>Female");
					add(j7);
					add(j8);
					final JButton j9= new JButton("<html><h1><i>Submit");
					add(j9);
					j9.addActionListener(new ActionListener()
					{
						public  void actionPerformed(ActionEvent ae)
						{
							j1.hide();j2.hide();j3.hide();j4.hide();j5.hide();j6.hide();j7.hide();j8.hide();j9.hide();
							jlab.setText("<html><h1><i>"+j2.getText()+"<br>"+j5.getActionCommand()+"<br>"+j7.getActionCommand());	
							add(jlab);
							JLabel j1=new JLabel("<html><h1><i>"+"<br>"+"ThankYou For Registering</i></h1></html>");
							add(j1);
							
						}
					});
				}
		});
	}
}
