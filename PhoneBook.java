import java.util.ArrayList;
/**
 * @author Yiyang Shi
 */
public class PhoneBook
{
    private ArrayList<Listing> phoneBook = new ArrayList<Listing>();
    public PhoneBook()
    {

    }
    /**
     * The addListing(Listing) method adds the argument to the phone book in the proper alphabetical order
     * @param pListing
     * @return
     * @precondition: object has a phoneBook Listing ArrayList.
     * @postcondition: noun;
     * declare a boolean type variable isAdded which set up as false;
     * scan from first variable from arraylist finding the position for pListing which left varaible will be smaller than pListing, and right varaible will be greater than pListing.
     */
    public boolean addListing(Listing pListing)
	{
        boolean isAdded = false;
        if (phoneBook.size() == 0)
        {
            phoneBook.add(pListing);
            isAdded = true;
        }
        else
        {
            for (int i = 0; i < phoneBook.size(); i++)
            {
                if (i < (phoneBook.size() - 1))
                {
                    if (((pListing.compareTo(phoneBook.get(i)) >= 0)) && ((pListing.compareTo(phoneBook.get(i+1)) < 0)))
                    {
                        phoneBook.add(i+1, pListing);
                        isAdded = true;
                        break;
                    }
                }  
                else
                {
                    if (pListing.compareTo(phoneBook.get(i)) >= 0)
                    {
                        phoneBook.add(pListing);
                        isAdded = true;
                        break;
                    } 
                }
            }
        }
        if (!isAdded)
        {
            phoneBook.add(0, pListing);
            isAdded = true;
        }
            
		//To Do add code to insert pListing in the correct order I suggest using an insertion technique
		return isAdded;
    }
    /**
	 * The removeListing(Listing) method removes the listing from the phone book it is matches the argument.
	 * @param pListing
	 * @return
	 */
	public boolean removeListing(Listing pListing)
	{
		return phoneBook.remove(pListing);
    }
    /**
     * The findListing(Name) method finds an occurrence of Listing in the array list with the state values of the Name argument
	 * and returns it. If there is no matching listing the method returns a null. 
     * @param pName
     * @return
     * @precondition: noun;
     * @postcondition: noun;
     * declare a new Listing type variable foundListing;
     * scan all object in the phoneBook arraylist to find out a same object which has same name as pName;
     * return the object in phoneBook;
     */
    public Listing findListing(Name pName)
	{
        Listing foundListing = null;
        for (int i = 0; i < phoneBook.size(); i++)
        {
            if (phoneBook.get(i).equals(pName))
            {
                foundListing = new Listing(pName.getFirstName(), pName.getMiddleName(), pName.getLastName(), phoneBook.get(i).getPhone().toString());
                break;
            }
        }
		//To Do add code to do an efficient search of the phone book I suggest using a binary search
		return foundListing;
    }
    /**
     * The findListing(PhoneNumber) method finds an occurrence of Listing in the array list with the state values of the PhoneNumber argument
	 * and returns it. If there is no matching listing the method returns a null. 
     * @param pNumber
     * @return
     * @precondition: noun;
     * @postcondition: noun;
     * declare a new Listing type variable foundListing;
     * scan all object in the phoneBook arraylist to find out a same object which has same PhoneNumber as pNumber;
     * return the object in phoneBook;
     */
    public Listing findListing(PhoneNumber pNumber)
	{
        Listing foundListing = null;
        for (int i = 0; i < phoneBook.size(); i++)
        {
            if (phoneBook.get(i).equals(pNumber))
            {
                foundListing = new Listing(phoneBook.get(i).getName().getFirstName(), phoneBook.get(i).getName().getMiddleName(), phoneBook.get(i).getName().getLastName(), phoneBook.get(i).getPhone().toString());
                break;
            }
        }
		//To Do add code to do an efficient search of the phone book I suggest using a binary search
		return foundListing;
    }
    /**
     * The findListing(PhoneNumber) method finds an occurrence of Listing in the array list with the state values of the Listing argument
	 * and returns it. If there is no matching listing the method returns a null. 
     * @param pListing
     * @return
     * @precondition: noun;
     * @postcondition: noun;
     * declare a new Listing type variable foundListing;
     * scan all object in the phoneBook arraylist to find out a same object which has same all information as pListing;
     * return the object in phoneBook;
     */
    public Listing findListing(Listing pListing)
	{
        Listing foundListing = null;
        for (int i = 0; i < phoneBook.size(); i++)
        {
            if (phoneBook.get(i).equals(pListing))
            {
                foundListing = new Listing(phoneBook.get(i).getName().getFirstName(), phoneBook.get(i).getName().getMiddleName(), phoneBook.get(i).getName().getLastName(), phoneBook.get(i).getPhone().toString());
                break;
            }
        }
		//To Do add code to do an efficient search of the phone book I suggest using a binary search
		return foundListing;
    }
    /**
     * The toString() method creates a String representation of the contents of the phoneBook
     */
    public String toString()
	{
		String listings = "";
		for(Listing currentListing: phoneBook)
		{
			listings += String.format("%s\n", currentListing);
		}
		return listings;
	}
}