/*\
|*|2014 - 2015 APCS A Blue Screen project.
|*|
|*|@author Lucy Dong
|*|@author Lukas Goodman
|*|@author Jefferson Kim
|*|@author Qiuyue Liu
|*|@author Sarah Luettgen
|*|@author Billy Miller
|*|@author Michael Moran
|*|@author William Qi
|*|@author Kristine Xu
|*|@author Ashley Yu
|*|@author Jeremy Yu
|*|
\*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MapInterface extends JPanel{
  private String inMap = "main";
  private Map main = new Map();
  private Map school = new Map(Map.school,Map.school[0].length / 2, Map.school[0].length);
  
  public MapInterface(){
    addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
          if(inMap.equals("main"))
            main.movePlayer("LEFT");
        if (key == KeyEvent.VK_RIGHT)
          if(inMap.equals("main"))
            main.movePlayer("RIGHT");
        if (key == KeyEvent.VK_UP)
          if(inMap.equals("main"))
            main.movePlayer("UP");
        if (key == KeyEvent.VK_DOWN)
          if(inMap.equals("main"))
            main.movePlayer("DOWN");
        System.out.println("testing 1 2 3");
        repaint();
      }
      public void keyTyped(KeyEvent e){;}
      public void keyReleased(KeyEvent e){;}
    });
  }
  
//get Methods
  public Map getMain(){return main;}
  public Map getSchool(){return school;}
  
  public void paintComponent(Graphics g) {
    setBackground(Color.WHITE);
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.drawRect(275,25,420,420);
    String[][] printMap = main.getData();
    int yLoc = 40;
    int xLoc = 280;
    for(int r = 0; r < 21; r++) {
      for(int c = 0; c < 21; c++){
        if(printMap[r][c].toString().equals("?"))g.setColor(Color.GRAY);
        else g.setColor(Color.BLUE);
        g.drawString(printMap[r][c].toString(), xLoc, yLoc);
        xLoc += 20;
      }
      xLoc = 280;
      yLoc += 20;
    }
  }
  public static void main(String[]a) {
    JFrame window = new JFrame("A Blue Screen");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(0,0,1000,500);
    window.getContentPane().add(new MapInterface());
    window.setVisible(true);
  }
}
