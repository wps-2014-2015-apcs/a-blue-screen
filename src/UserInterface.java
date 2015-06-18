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

public class UserInterface extends JPanel
  implements ActionListener
{
   private int time;
   //TODO: add button to change to map view, add resources w/ numbers, add buttons for verbs
   private String story;
   Timer homeworkTimer = new Timer(10000, gameOver());
   private JButton homework = new JButton();
	private Timer homeworkTimer = new Timer(10000, gameOver());
	private Timer homeworkCountDownTimer = new Timer(1000, hwCountDown());
	private int homeworkTime = 10;
	private JButton chargeLaptop = new JButton();
	private Timer chargeLaptopTimer = new Timer (20000, gameOver());
	private Timer chargeLaptopCountDownTimer = new Timer(1000, chargeLaptopCountDown());
	private int chargeLaptopTime = 20;
	
   public UserInterface() 
   {
      time = 0; //Timer should be used to produce pop-up events, reload resource collections
      Timer clock = new Timer(30, this); 
      clock.start();
      story="Welcome.";
		homeworkCountDownTimer.start();
		homeworkTimer.start();
		chargeLaptopCountDownTimer.start();
		chargeLaptopTimer.start();
		pencil = new Resource("pencil", 0);
		health = new Resource("health", 50);
   }
   
   public void setStory(String s)
   {
	   story = s;
   }
 
   public void paintComponent(Graphics g)
   {
     setBackground(Color.BLUE);
     super.paintComponent(g);
     

     g.setColor(Color.WHITE);
     g.drawRect (800, 20, 180, 200); 
     g.drawString("Resources", 840, 40);
     g.drawString(Verbs.pencils.toString(), 810, 55);
     g.drawString(Verbs.coffee.toString(), 810, 70);
     g.drawString(Verbs.computerCharge.toString(), 810, 85);
     
     g.drawRect (800, 230,180, 190);
     g.drawString("Stats", 860, 250);
     g.drawString(Verbs.health.toString(), 810, 265); 
     g.drawString(Verbs.grade.toString(), 810, 280); 
     
     g.drawRect (20, 20, 300, 400); 
     g.drawString("Story", 150, 40);
     g.drawString(story, 30, 55);
     paintButtons();
     
   }
   
   public void paintButtons(){

		homework.setText("Do Homework" + " (" + homeworkTime + ")");
		add(homework);

		ActionListener hw = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				homeworkTimer.restart();
				homeworkCountDownTimer.restart();
				homeworkTime = 10;
				homework.repaint();
				Verbs.doHomework();
			}
		};

		homework.addActionListener(hw);
		homework.addActionListener(hwCountDown());

		chargeLaptop.setText("Charge the laptop (" + chargeLaptopTime + ")");
		add(chargeLaptop);

		ActionListener laptop = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chargeLaptopTimer.restart();
				chargeLaptopCountDownTimer.restart();
				chargeLaptopTime = 20;
				chargeLaptop.repaint();
			}
		};
		chargeLaptop.addActionListener(laptop);
		chargeLaptop.addActionListener(chargeLaptopCountDown());
	}


	private ActionListener chargeLaptopCountDown() {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chargeLaptopTime--;
			}
		};


	}



   public static void main(String[] a) 
   {
     JFrame window = new JFrame("A Blue Screen");
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setBounds(0,0,1000,500);
     window.getContentPane().add(new UserInterface());
     window.setVisible(true);
   }
   
   public void paintGameOver(Graphics g){
	   setBackground(Color.red);
   }
   
   public ActionListener gameOver(){
	   ActionListener gameOver = new ActionListener(){
		   public void actionPerformed(ActionEvent e){
			   System.out.println("gameOver");
		   }
	   };
	   return gameOver;
   }

   private ActionListener hwCountDown(){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("1 sec");
				homeworkTime--;
				System.out.println(homeworkTime);

			}
		};
	}

   public void actionPerformed(ActionEvent e) 
   {
    time++;
    repaint();
   }
}
