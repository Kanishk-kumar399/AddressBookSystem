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
	public void addNewContact(String firstName,String lastName,String address,String city,String state,int pinCode,long phoneNumber,String emailId)
	{
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
		AddressBookMain Contact1=new AddressBookMain();
		Contact1.addNewContact("yusm","dsdsan","dsdsH","agri","UP",5545,5478686,"shivssds@gmail.com");
		Contact1.addNewContact("Ram","Sharan","SHHH","Delhi","MP",3345,7688686,"shivam@gmail.com");
		Contact1.printContact();
		Contact1.deleteContact();
		System.out.println("After deleting:");
		Contact1.printContact();
	}
}
