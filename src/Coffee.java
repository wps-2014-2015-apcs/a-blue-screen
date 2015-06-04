/**
 * @author Sarah Luettgen
 */

public class Coffee extends Resource
{
	public Coffee()
	{
		super();
	}
	
	public Coffee(int number)
	{
		super(number);
	}
	
	public String toString() 
	{
		return "coffee: " + getNumber();
	}
}
