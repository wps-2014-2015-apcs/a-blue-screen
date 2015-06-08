/*
 * Author: Qiuyue Liu
 * */

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
