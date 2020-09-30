public class Contact
{
        public String firstName;
        public String lastName;
        public String address;
        public String state;
        public String city;
        public int pinCode;
        public int phoneNumber;
        public String emailId;

        public Contact(String firstName,String lastName,String address,String city,String state,int pinCode,int phoneNumber,String emailId)
        {
         this.firstName=firstName;
         this.lastName=lastName;
         this.address=address;
         this.city=city;
         this.state=state;
         this.pinCode=pinCode;
         this.phoneNumber=phoneNumber;
         this.emailId=emailId;
        }
	@Override
	public String toString()
        {
        return "First Name: "+firstName+" \nLast Name: "+lastName+"\nAddress :"+address+"\nCity: "+city+"\nPincode: "+pinCode+"\nState: "+state+"\nPhoneNumber: "+phoneNumber+"\nEmail ID: "+emailId;
        }
}
