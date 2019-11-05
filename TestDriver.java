import java.util.Scanner;
/**
 * @author Yiyang Shi
 */
public class TestDriver
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        Listing newList = new Listing();
        Listing strList = null;
        PhoneBook myBook = new PhoneBook();
        Boolean bo;
        int count = 0;
        for (int i = 0; i < 8; i ++)
        {
            myBook.addListing(newList);
            newList = new Listing();  
        }
        System.out.println(myBook);
        do
        {
            newList = new Listing();
            strList = myBook.findListing(newList.getName());
            if (strList != null)
            {
                //System.out.println("what " + strList);
                bo = myBook.removeListing(strList); // it doesn't remove.
                count ++;
            }    
        }
        while (count < 4);
        System.out.println(myBook);
        String firstname, middlename, lastname, yorn;
        while (true)
        {
            System.out.println("Please enter the name you want to search from the list.");
            System.out.println("Please enter the firstname you want to search.");
            firstname = keyboard.nextLine();
            System.out.println("Please enter the middletname you want to search.");
            middlename = keyboard.nextLine();
            System.out.println("Please enter the lastname you want to search.");
            lastname = keyboard.nextLine();
            Name strName = new Name(firstname, middlename, lastname);
            strList = myBook.findListing(strName);
            if (strList != null)
            {
                System.out.println("Yes, i found this person whose information is : " + strList);
                break;
            }
            else 
            {
                System.out.println("Sorry, we didn't find this person. if you want to try again please enter yes, otherwise enter anything else.");
            }
            yorn = keyboard.nextLine();
            if (!yorn.toUpperCase().equals("YES"))
            {
                break;
            }
        }
        String phoneNumber;
        while (true)
        {
            System.out.println("Please enter the phone number you want to search from the list.");
            phoneNumber = keyboard.nextLine();
            PhoneNumber newNumber = new PhoneNumber(phoneNumber);
            strList = myBook.findListing(newNumber);
            if (strList != null)
            {
                System.out.println("Yes, i found this person whose information is : " + strList);
                break;
            }
            else 
            {
                System.out.println("Sorry, we didn't find this person. if you want to try again please enter yes, otherwise enter anything else.");
            }
            yorn = keyboard.nextLine();
            if (!yorn.toUpperCase().equals("YES"))
            {
                break;
            }
        }
    }
}