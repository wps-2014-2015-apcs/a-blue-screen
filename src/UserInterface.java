/*
 * 2014 - 2015 APCS A Blue Screen project.
 * 
 * @author Lucy Dong
 * @author Lukas Goodman
 * @author Jefferson Kim
 * @author Qiuyue Liu
 * @author Sarah Luettgen
 * @author Billy Miller
 * @author Michael Moran
 * @author William Qi
 * @author Kristine Xu
 * @author Ashley Yu
 * @author Jeremy Yu
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UserInterface extends JPanel
  implements ActionListener
{

  public static void main(String[] a) {
	    JFrame window = new JFrame("A Blue Screen");
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0,0,1000,500);
	    window.getContentPane().add(new MyCanvas());
	    window.setVisible(true);
	  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
