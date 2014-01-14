package hipster.model;

import java.util.Arrays;

/**
 * Creates the Hipster object.
 * @author Michael Tuero
 *@version 1.2 11/20/13 added getter/setters, overloaded constructor for additional hipsters.
 */
public class HipsterModel
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String [] hipsterBooks;
	
	
	public HipsterModel()
	{
		hipsterBooks = new String[5];
		name = "Michael";
		hipsterType = "Boss Hipster";
		hipsterPhrase = "Chill";
		
		fillTheBooks();
	}
	public HipsterModel(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getHipsterType()
	{
		return hipsterType;
	}
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
	public void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "Beautiful Creatures";
		hipsterBooks[2] = "That One Book";
		hipsterBooks[3] = "Cirque Du Freak";
		hipsterBooks[4] = "V for Vendetta";
	}
	
	public String alphabetizeBooks(String[] books)
	{
		String alphabetizedBooks = "";
		
		Arrays.sort(books);
		
		for (String temp : books)
		{
			alphabetizedBooks += temp + ", ";
			
		}
		
		return alphabetizedBooks;
	}
	
	
	
}
