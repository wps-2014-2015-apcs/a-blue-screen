/**
 * @author Sarah Luettgen
 */

public class Candy extends Resource
{
	public Candy()
	{
		super();
	}
	
	public Candy(int number)
	{
		super(number);
	}
	
	public String toString() 
	{
		return "candy: " + getNumber();
	}
}