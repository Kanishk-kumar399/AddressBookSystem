import java.util.ArrayList;
public class AddressBookMain
{
	int numOfContact=0;
	private Contact[] contactArray;
	
	public AddressBookMain()
	{
		contactArray=new Contact[5];
	}
	private void addNewContact(String firstName,String lastName,String address,String city,String state,int pinCode,int phoneNumber,String emailId)
	{
		contactArray[numOfContact]=new Contact(firstName,lastName,address,city,state,pinCode,phoneNumber,emailId);
		System.out.println(contactArray[numOfContact]);
		numOfContact++;
	}

	public static void main(String args[])
	{
		AddressBookMain Contact1=new AddressBookMain();
		Contact1.addNewContact("Kumar","Kanishk","SH-3/40","Varanasi","UP",2210,884024123,"kanishk@gmail.com");
		Contact1.addNewContact("Ram","Sharan","SHHH","Delhi","MP",3345,7688686,"shivam@gmail.com");
	}
}
