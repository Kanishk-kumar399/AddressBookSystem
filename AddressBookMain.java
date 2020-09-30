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
	public void editContact()
	{
		System.out.println("Enter The First Name to edit the contact details");
		String fn=sc.nextLine();
		Contact obj=contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the Address");
		String ad=sc.next();
		obj.setAddress(ad);
		System.out.println("Enter the City");
		String ci=sc.next();
		obj.setCity(ci);
		System.out.println("Enter the State");
		String st=sc.next();
		obj.setState(st);
		System.out.println("Enter the Pincode");
		int pin=sc.nextInt();
		obj.setPinCode(pin);
		System.out.println("Enter the Number");
		long num=sc.nextLong();
		obj.setPhoneNumber(num);
		System.out.println("Enter the Email");
		String em=sc.next();
		obj.setEmailId(em);
	}
	public static void main(String args[])
	{
		AddressBookMain Contact1=new AddressBookMain();
		Contact1.addNewContact("yusm","dsdsan","dsdsH","agri","UP",5545,5478686,"shivssds@gmail.com");
		Contact1.addNewContact("Ram","Sharan","SHHH","Delhi","MP",3345,7688686,"shivam@gmail.com");
		Contact1.printContact();
		Contact1.editContact();
		System.out.println("After Editing:");
		Contact1.printContact();
	}
}
