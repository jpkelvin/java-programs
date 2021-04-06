import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StatusWindow 
{
JLabel l1;
StatusWindow()
{

JFrame f1 = new JFrame("An Event Example");
f1.setLayout(new FlowLayout());
f1.setSize(220, 90);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButton b1 = new JButton("SUBMIT");
l1 = new JLabel("");

b1.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent ae) {
l1.setText("SUBMIITED");
}
});


f1.add(b1);
f1.add(l1);

f1.setVisible(true);
}

public static void main(String args[])
{
 StatusWindow   e=new  StatusWindow();
}
}