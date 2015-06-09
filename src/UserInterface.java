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
import javax.swing.JFrame;


public class UserInterface {
	public static void main(String[] args){
		startGame();
	}
	public static void startGame(){
		JFrame window = new JFrame("A Blue Screen");
		window.setVisible(true);
		window.setSize(500, 500);
	}
}
