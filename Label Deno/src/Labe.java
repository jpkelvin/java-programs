import javax.swing.JApplet;
import javax.swing.JLabel;
/* <applet code="Labe" width=300 height=300></applet>*/
public class Labe extends JApplet
{
	public void init()
	{
		JLabel j=new JLabel("Hi Kelvin",JLabel.CENTER);
		add(j);
	}
}