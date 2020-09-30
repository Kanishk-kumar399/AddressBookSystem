import java.util.*;
public class AddressBookMain
{
	Scanner sc=new Scanner(System.in);
	private ArrayList<Contact> contactArray;
	private Map<String,Contact> contactMap;
	public AddressBookMain()
	{
		contactArray=new ArrayList<>();
		contactMap=new HashMap<>();
	}
	public void addNewContact()
	{
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println("Enter last Name");
		String lastName=sc.next();
		System.out.println("Enter the Address");
		String address=sc.next();
		System.out.println("Enter the City");
		String city=sc.next();
		System.out.println("Enter the State");
		String state=sc.next();
		System.out.println("Enter the Pincode");
		int pinCode=sc.nextInt();
		System.out.println("Enter the Number");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter the Email");
		String emailId=sc.next();
		Contact obj=new Contact(firstName,lastName,address,city,state,pinCode,phoneNumber,emailId);
		contactArray.add(obj);
		contactMap.put(firstName,obj);
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	public void deleteContact()
	{
		System.out.println("Enter The First Name to delete the contact details");
		String fn=sc.nextLine();
		Contact obj=contactMap.get(fn);
		contactArray.remove(obj);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		AddressBookMain Contact1=new AddressBookMain();
		while(true)
		{
		System.out.println("Do You Want to Add Contact(Y/N)");
		char choice=s.next().charAt(0);
			if(choice=='Y')
			{
			Contact1.addNewContact();
			Contact1.printContact();
			}
			else
			System.exit(0);
		}
	}
}
