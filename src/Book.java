/**
 * @author Sarah Luettgen
 */

public class Book extends Resource 
{
	public Book()
	{
		super();
	}
	
	public Book(int number)
	{
		super(number);
	}
	
	public String toString() 
	{
		return "books: " + getNumber();
	}
}
