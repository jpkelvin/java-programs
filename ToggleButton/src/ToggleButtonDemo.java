import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code="ToggleButton" width=300 height=400></applet>*/
public class ToggleButtonDemo extends JApplet
{
	JLabel jlab=new JLabel();
	JToggleButton jtbn;
	public void init()
	{
		setLayout(new FlowLayout());
		
		jtbn=new JToggleButton("On/Off");
		jtbn.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent ie)
					{
						if(jtbn.isSelected())
							jlab.setText("Button is on");
						else
							jlab.setText("Button is Off");
					}
				});
		add(jtbn);
		add(jlab);
	}
}
