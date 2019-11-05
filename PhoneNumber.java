
/**
 * @author Larry Shannon
 *
 */
public class PhoneNumber
{
	private final String areaCode;
	private final String localCode;
	private final String phoneCode;

	/**
	 * The PhoneNumber() constructor initializes the PhoneNumber state variables by
	 * generating random values for each state variable. Precondition: none
	 * Postcondition: state variables for area code, local code and phone code are
	 * initialized
	 * 
	 * @param pPhoneNumber
	 */
	public PhoneNumber()
	{
		String tempNumber = "";
		for (int i = 0; i < 3; i++)
		{
			tempNumber += String.format("%d", (int) (Math.random() * 10));
		}
		areaCode = tempNumber;
		tempNumber = "";
		for (int i = 0; i < 3; i++)
		{
			tempNumber += String.format("%d", (int) (Math.random() * 10));
		}
		localCode = tempNumber;
		tempNumber = "";
		for (int i = 0; i < 4; i++)
		{
			tempNumber += String.format("%d", (int) (Math.random() * 10));
		}
		phoneCode = tempNumber;
	}

	/**
	 * The PhoneNumber(String,String,String) constructor initializes the PhoneNumber
	 * state variables by receiving values from the incoming arguments.
	 * Precondition: the incoming arguments must be in the formats AAA, LLL, and
	 * PPPP Postcondition: state variables for area code, local code and phone code
	 * are initialized
	 * 
	 * @param pPhoneNumber
	 */
	public PhoneNumber(String pAreaCode, String pLocalCode, String pPhoneCode)
	{
		areaCode = pAreaCode;
		localCode = pLocalCode;
		phoneCode = pPhoneCode;
	}

	/**
	 * The PhoneNumber(String) constructor initializes the PhoneNumber state
	 * variables by striping off each value from the incoming argument.
	 * Precondition: the incoming argument must be in the format (AAA)LLL-PPPP
	 * Postcondition: state variables for area code, local code and phone code are
	 * initialized
	 * 
	 * @param pPhoneNumber
	 */
	public PhoneNumber(String pPhoneNumber)
	{
		areaCode = pPhoneNumber.substring(1, 4);
		localCode = pPhoneNumber.substring(5, 8);
		phoneCode = pPhoneNumber.substring(9);
	}

	/**
	 * The toString() method uses the state variables to build a string
	 * representation of the phone number in the standard US format (AAA)LLL-PPPP
	 * Precondition: state variables properly initialized Postcondition: no change
	 */
	public String toString()
	{
		return String.format("(%s)%s-%s", areaCode, localCode, phoneCode);
	}
	
	/**
	 * The equals(PhoneNumber) method checks to see if this object has the same state variable valuses as the argument object.
	 * @param pPhone
	 * @return
	 */
	public boolean equals(PhoneNumber pPhone)
	{
		boolean areEqual = false;
		if(pPhone.areaCode.equals(this.areaCode)&&
				pPhone.localCode.equals(this.localCode)&&
				pPhone.phoneCode.equals(this.phoneCode))
			areEqual = true;
		return areEqual;
	}
	/**
	 * The compareTo(PhoneNumber) method compares the state values of two PhoneNumber objects
	 * and returns 0 if they are equal
	 * -1 if the calling object is "smaller" than the argument object
	 * 1 if the calling object is "larger" than the argument object
	 * Precondition: this object has been initialized with proper state values
	 * Postcondition: no change to the object.
	 * @param pPhone
	 * @return 
	 * 0 if they are equal
	 * -1 if the calling object is "smaller" than the argument object
	 * 1 if the calling object is "larger" than the argument object
	 */
	public int compareTo(PhoneNumber pPhone)
	{
		int compareValue = 0;// -1 this comes before pPhone, 0 this has the same state values as pPhone, 
													// 1 this comes after pPhone
		if (areaCode.compareTo(pPhone.areaCode) == 0)
			if (localCode.compareTo(pPhone.localCode) == 0)
				if (phoneCode.compareTo(pPhone.phoneCode) == 0)
					compareValue = 0;
				else
					if (phoneCode.compareTo(pPhone.phoneCode) < 0)
						compareValue = -1;
					else
						compareValue = 1;
			else
				if (localCode.compareTo(pPhone.localCode) < 0)
					compareValue = -1;
				else
					compareValue = 1;
		else
			if (areaCode.compareTo(pPhone.areaCode) < 0)
				compareValue = -1;
			else
				compareValue = 1;
		return compareValue;
	}
}
