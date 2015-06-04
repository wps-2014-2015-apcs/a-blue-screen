/**
 * @author Sarah Luettgen
 */

public class ComputerUpgrade extends Resource
{
	public ComputerUpgrade()
	{
		super();
	}
	
	public ComputerUpgrade(int number)
	{
		super(number);
	}
	
	public String toString() 
	{
		return "computer upgrades: " + getNumber();
	}
}