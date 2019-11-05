
/**
 * 
 * @author Larry Shannon
 *
 */
public class Name extends Object
{
	private final String firstName;
	private final String middleName;
	private final String lastName;
	public Name()
	{
		String[] maleNames = {"Tom","Sam","Lars","Abdul","Mohamod","Jack","Ezekeal","Benjamin","Nick","Chuck"};
		String[] femaleNames = {"Tina","Sam","May","Sariah","Linda","Jazel","Sarah","Betty","Lou","Abbagail"};
		String[] lastNames = {"Hanks","Jones","Foster","Abib","McKnight","Helm","Stokes","Quam","Kook","Hill"};
		int gender = (int)(Math.random() * 2);
		int index = (int)(Math.random() * 10);
		if(gender == 0)
		{
			firstName = femaleNames[index];
			index = (int)(Math.random() * 10);
			middleName = femaleNames[index];
		}
		else
		{
			firstName = maleNames[index];
			index = (int)(Math.random() * 10);
			middleName = maleNames[index];
		}
		index = (int)(Math.random() * 10);
		lastName = lastNames[index];
		
	}
	public Name(String pFName, String pMName, String pLName)
	{
		firstName = pFName;
		middleName = pMName;
		lastName = pLName;
		
	}
	public Name(Name pName) 
	{
		firstName = pName.firstName;
		middleName = pName.middleName;
		lastName = pName.lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String toString()
	{
		return getFirstName() + " " + getMiddleName() + " " + getLastName();
	}
	public boolean equals(Name nameToCheck)
	{
		boolean areEqual = false;
		if(nameToCheck.getFirstName().equals(this.getFirstName())&&
				nameToCheck.getMiddleName().equals(this.getMiddleName())&&
				nameToCheck.getLastName().equals(this.getLastName()))
			areEqual = true;
		return areEqual;
	}
	public int compareTo(Name pName)
	{
		int compareValue = 0;//-1 this comes before pName, 0 this has the same state values as pName, 1 this comes after pName
		if(lastName.compareTo(pName.lastName) == 0)
			if(firstName.compareTo(pName.firstName) == 0)
				if(middleName.compareTo(pName.middleName) == 0)
					compareValue = 0;
				else
					if(middleName.compareTo(pName.middleName) < 0)
						compareValue = -1;
					else
						compareValue = 1;
			else
				if(firstName.compareTo(pName.firstName) < 0)
					compareValue = -1;
				else
					compareValue = 1;
		else
			if(lastName.compareTo(pName.lastName) < 0)
				compareValue = -1;
			else
				compareValue = 1;
		return compareValue;
	}

}
