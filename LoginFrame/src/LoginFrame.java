import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
public class LoginFrame
{
	public static void main(String[] args) {
		Login obj= new Login();
		obj.LoginFrame();
	}
}
class Login
{
	String pass[]= {"a1","b2","c3"};
	String user[]= {"aa","bb","cc"};
	int found=0;
	void LoginFrame()
	{

		JFrame f1=new JFrame("A Login form");
		f1.setLayout(new FlowLayout());
		f1.setSize(300, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l2=new JLabel("Enter your name");
		f1.add(l2);
	
		JTextField t1=new JTextField("",20);
		f1.add(t1);

		JLabel l3=new JLabel("Enter your password",JLabel.LEFT);
		f1.add(l3);

		JPasswordField t2=new JPasswordField(20);
		t2.setEchoChar('*');
		f1.add(t2);
	
		JButton obj1= new JButton("Submit");
		f1.add(obj1);
	
		t1.setBackground(Color.CYAN);
		t2.setBackground(Color.YELLOW);
		t2.setForeground(Color.RED);
		JLabel l1=new JLabel("");
		f1.add(l1);
		
		obj1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				String a= new  String(t1.getText());
				String b= new  String(t2.getPassword());
				for(int i=0;i<3;i++)
				{
					if((a.equals(user[i]))&&(b.equals(pass[i])))
					{	found=1;
						break;
					}
				}
				if(found==1)
					l1.setText("Submitted");
				else
					l1.setText("Incorrect password");
			}
	});
	f1.setVisible(true);
	}
}
