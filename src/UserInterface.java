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
	  private int time;
	  //TODO: add button to change to map view, add resources w/ numbers, add buttons for verbs
	  
	  public UserInterface() 
	  {
		    time = 0; //Timer should be used to produce pop-up events, reload resource collections
		    Timer clock = new Timer(30, this); 
		    clock.start();
	  }
	
	  public void paintComponent(Graphics g)
	  {
	    setBackground(Color.BLUE);
	    super.paintComponent(g);

	    g.setColor(Color.WHITE);
	    g.drawRect (800, 20, 150, 200); 
	    g.drawString("Resources", 840, 40);
	    
	    g.drawRect (20, 20, 300, 400); 
	    g.drawString("Story", 150, 40);
	 
	  }

	  public static void main(String[] a) 
	  {
	    JFrame window = new JFrame("A Blue Screen");
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0,0,1000,500);
	    window.getContentPane().add(new UserInterface());
	    window.setVisible(true);
	  }


	  public void actionPerformed(ActionEvent e) 
	  {
		  time++;
		  repaint();
	  }
}
