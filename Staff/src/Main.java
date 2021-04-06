import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*<applet code="Main" width =300 height=300></applet>*/

public class Main extends Applet implements MouseListener

{
    String msg="hj";
    
int mx=0,my=0;
    
public void init()
    
{
        
addMouseListener(this);
    
}
    
public void mousePressed(MouseEvent m)
    
{
        
mx=m.getX();
        my=m.getY();
        msg="hai";
        
repaint();
            }
            
public void paint(Graphics g)
            
{
                g.drawString(msg,mx,my);
            
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}