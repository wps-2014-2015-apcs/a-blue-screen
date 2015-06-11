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
 */

/**
 * The verbs of the project. 
 */
public class Verbs extends Resource {
	
	//fields
	public static Resource pencils = new Resource("Pencils", 0);
	public static Resource coffee = new Resource("Coffee", 0);
	public static Resource grade = new Resource("Grade", 0);
	public static Resource health = new Resource("Health", 0);
	public static Resource computerCharge = new Resource("Computer charge", 75);
	
	//hi
	
	public Verbs(String name)
	{
		super(name);
	}
	
	public Verbs(String name, int number)
	{
		super(name, number);
	}
	
	//if "no more pencils" --> displays "Not enough pencils"
	//if you DO have pencils --> displays "Your assignment is finished"
		//Grade: +2
		//Pencils "Number": -1
	    //Timer: available every 10 seconds 
	public void doHomework()
	{
		String finished = "Your assignment is finished."; 
		String notEnough = "Not enough pencils.";
		if (pencils.getNumber() == 0)
		{
			System.out.print(notEnough); 
		}
		else 
		{
			pencils.setNumber(getNumber() - 1);
			grade.setNumber(getNumber() + 2);
			System.out.print(finished); 
		}
	}
	
	//Pencils: between +1 and +5
	//Timer: available every 10 seconds
	public void collectPencils()
	{
		int random = (int)(Math.random() * 5); 
		pencils.setNumber(getNumber() + random);
	}
	
}
