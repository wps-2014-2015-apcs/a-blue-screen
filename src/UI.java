import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class UI extends JComponent {

	  public void paint(Graphics g) {
		    g.drawRect (800, 20, 150, 200); 
		    setBackground(Color.WHITE);
		    g.drawString("Resources", 840, 40);
		    
		    g.drawRect (20, 20, 300, 400); 
		    g.drawString("Story", 150, 40);
		    
	  }
  
  
}

