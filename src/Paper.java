/**
 * @author Sarah Luettgen
 */

public class Paper extends Resource
{
	public Paper()
	{
		super();
	}
	
	public Paper(int number)
	{
		super(number);
	}
	
	public String toString() {
		return "paper: " + getNumber();
	}
}
