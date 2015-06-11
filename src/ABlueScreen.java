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
 * @author Jeremy Yu
 * 
 */
 
public class ABlueScreen {
    public static void main(String[] args) {
	    JFrame window = new JFrame("A Blue Screen");
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0,0,1000,500);
	    window.getContentPane().add(new UserInterface());
	    window.setVisible(true);
    }
}
