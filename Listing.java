/**
 * 
 */
/**
 * @author Larry Shannon
 *
 */
public class Listing
{
	private final Name name;
	private final PhoneNumber phone;
	
	public Listing()
	{
		name = new Name();
		phone = new PhoneNumber();
	}
	
	public Listing(String pFName, String pMName, String pLName, String pNumber)
	{
		name = new Name(pFName,pMName,pLName);
		phone = new PhoneNumber(pNumber);
	}
	
	public String toString()
	{
		return String.format("%s, %s", name, phone);
	}
	public PhoneNumber getPhone()
	{
		return phone;
	}
	public Name getName()
	{
		return name;
	}
	public boolean equals(Listing pListing)
	{
		return this.name.equals(pListing.name) && this.phone.equals(pListing.phone);
	}
	public boolean equals(Name pName)
	{
		return this.name.equals(pName);
	}
	public boolean equals(PhoneNumber pPhone)
	{
		return this.phone.equals(pPhone);
	}
	public int compareTo(Listing pListing)
	{
		int comparisonValue = 0;//-1 this comes before pListing, 0 this has the same state values as pListing, 1 this comes after pListing
		if(this.name.compareTo(pListing.name) == 0)
			if(this.phone.compareTo(pListing.phone) == 0)
				comparisonValue = 0;
			else
				if(this.phone.compareTo(pListing.phone) < 0)
					comparisonValue = -1;
				else
					comparisonValue = 1;
		else
			if(this.name.compareTo(pListing.name) < 0)
				comparisonValue = -1;
			else
				comparisonValue = 1;
		return comparisonValue;
	}

}
