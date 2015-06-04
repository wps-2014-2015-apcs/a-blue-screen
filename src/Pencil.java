/**
 * @author Sarah Luettgen
 */

public class Pencil extends Resource
{
	public Pencil()
	{
		super();
	}
	
	public Pencil(int number)
	{
		super(number);
	}
	
	public String toString() 
	{
		return "pencils: " + getNumber();
	}
	
}
