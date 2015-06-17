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
public class MapInterface extends JPanel {
  private Map main = new Map();
  private Map school = new Map(Map.school);
  public MapInterface(){
  }
  public Map getMain(){return main;}
  public Map getSchool(){return school;}
   public void paintComponent(Graphics g)
   {
     setBackground(Color.WHITE);
     super.paintComponent(g);
     g.setColor(Color.BLUE);
     g.drawRect(275,25,400,400);
   }
  public static void main(String[]a){
    JFrame window = new JFrame("A Blue Screen");
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setBounds(0,0,1000,500);
     window.getContentPane().add(new MapInterface());
     window.setVisible(true);
  }
}
