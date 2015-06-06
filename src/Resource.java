/**
 * @author Sarah Luettgen
 */

public class Resource {
	
	//Fields
	private int number;
	private String name;
	
	//Constructors
	public Resource(String name)
	{
		this.name = name;
		number = 0;
	}
	
	public Resource(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	
	//Methods
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int num)
	{
		number = num;
	}
	
	public String toString()
	{
		return "" + name + "(s): " + number;
	}
}
