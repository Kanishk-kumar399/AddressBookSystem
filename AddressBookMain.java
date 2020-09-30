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
		System.out.println("Enter  your choice \n1.Add new Contact \n2.Edit Contact \n3. Delete Contact \n4.Print Book \n5.Close");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:Contact1.addNewContact();
				break;
			case 2:Contact1.editContact();
				break;
			case 3:Contact1.deleteContact();
				break;
			case 4:Contact1.printContact();
				break;
			case 5:System.exit(0);
		}
		}
	}
}
