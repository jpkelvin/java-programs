import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TextSwing" width= 400 height=400></applet>*/
public class TextSwing extends JApplet
{
	public void init()
	{
		setLayout(new FlowLayout());
		setBackground(Color.black);
		JLabel l1=new JLabel("Enter your name");
		add(l1);
		
		final JTextField t1=new JTextField(20);
		add(t1);
		
		t1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						showStatus(t1.getText()+"  Welcome");
					}
				});
	}
}
