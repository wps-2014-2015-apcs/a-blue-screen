/**
 * @author Sarah Luettgen
 */

public abstract class Resource {
	//Fields
	private int number;
	
	//Constructors
	public Resource()
	{
		number = 0;
	}
	
	public Resource(int number)
	{
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
	
	public abstract String toString();
}
