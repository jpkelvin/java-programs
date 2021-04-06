import java.awt.Color;

import javax.swing.*;
/* <applet code="LabelSwing" width=300 height=300></applet>*/
public class LabelSwing extends JApplet
{
	public void init()
	{
		setBackground(Color.BLUE);
		ImageIcon i=new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\kelvin.jpg");
		JLabel j=new JLabel("Kelvin",i,JLabel.CENTER);
		add(j);
	}
}
