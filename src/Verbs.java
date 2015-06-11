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
	Resource pencils = new Resource("pencils", 0);
	
	
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
		//Pencils: -1
	    //Timer: available every 10 seconds 
	public void doHomework()
	{
		
	}
	
	//Pencils: +1
	//Timer: available every 10 seconds
	public void collectPencils()
	{
	 
	}
	
}
