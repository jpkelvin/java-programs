import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
public class RadioButtonDemo extends JApplet implements ActionListener
{
	JLabel jlab=new JLabel();
	JRadioButton r1=new JRadioButton();
	public void init()
	{
		String[] a= {"Prince","Kelvin","Jhon","Jack","Monica","Jeselene"};
		setLayout(new FlowLayout());
		for(int i=0;i<5;i++)
		{
		
		r1=new JRadioButton(a[i]);
		r1.addActionListener(this);
		add(r1);
		}
		jlab= new JLabel("Select Any",JLabel.CENTER);
		add(jlab);
	}
public void actionPerformed(ActionEvent ae)
{
		jlab.setText("You Selected "+ae.getActionCommand());
}
}