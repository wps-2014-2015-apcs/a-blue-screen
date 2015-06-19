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

//To be deleted; obsolete
public class UserInterface extends JPanel
implements ActionListener
{
	private int time;
	//TODO: add button to change to map view, add resources w/ numbers, add buttons for verbs

	private JButton homework = new JButton();
	private Timer homeworkTimer = new Timer(10000, gameOver());
	private Timer homeworkCountDownTimer = new Timer(1000, hwCountDown());
	private int homeworkTime = 10;
	
	private JButton chargeLaptop = new JButton();
	private Timer chargeLaptopTimer = new Timer (20000, gameOver());
	private Timer chargeLaptopCountDownTimer = new Timer(1000, chargeLaptopCountDown());
	private int chargeLaptopTime = 20;
	
	private JButton collectPencilsButton = new JButton();
	private Timer collectPencilsTimer = new Timer(20000, collectPencilsTimer());
	private Timer collectPencilsCountDownTimer = new Timer(1000, collectPencilsCountDown());
	private int collectPencilsTime = 20;
	
	private Resource pencil;
	private Resource health;
	private Resource grade;
	Timer clock;

	public UserInterface() 
	{
		time = 0; //Timer should be used to produce pop-up events, reload resource collections
		clock = new Timer(30, this); 
		clock.start();
		homeworkCountDownTimer.start();
		homeworkTimer.start();
		chargeLaptopCountDownTimer.start();
		chargeLaptopTimer.start();
		collectPencilsTimer.start();
		collectPencilsCountDownTimer.start();
		/*pencil = new Verbs("pencil", 0);
		health = new Verbs("health", 50);*/

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
		g.drawString("feild that contains first part of story", 30, 55);

		//   System.out.println("paint buttons");
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
		
		collectPencilsButton.setText("Collect Pencil (" + collectPencilsTime + ")");
		add(collectPencilsButton);
		
		ActionListener collectPencils = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Verbs.collectPencils();
				collectPencilsButton.disable();
				collectPencilsTimer.restart();
				collectPencilsCountDownTimer.restart();
				collectPencilsTime = 20;
				collectPencilsButton.repaint();
			}
		};
		
		collectPencilsButton.addActionListener(collectPencils);
		collectPencilsButton.addActionListener(collectPencilsCountDown());
		
	}


	private ActionListener chargeLaptopCountDown() {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chargeLaptopTime--;
			}
		};


	}


	private ActionListener collectPencilsTimer() {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				collectPencilsButton.enable();
			}
		};
	}
	
	private ActionListener collectPencilsCountDown(){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				collectPencilsTime--;
			}
		};
	}
	
	

	public void paintGameOver(Graphics g){
		setBackground(Color.red);
	}

	
	public ActionListener gameOver(){
		ActionListener gameOver = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clock.stop();
				System.out.println("gameOver");
			}
		};
		return gameOver;
	}

	private ActionListener hwCountDown(){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				homeworkTime--;
			}
		};
	}

	public void actionPerformed(ActionEvent e) 
	{
		repaint();
	}

	public static void main(String[] a) 
	{
		JFrame window = new JFrame("A Blue Screen");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0,0,1000,500);
		window.getContentPane().add(new UserInterface());
		window.setVisible(true);
	}



}