public class Contact
{
        public String firstName;
        public String lastName;
        public String address;
        public String state;
        public String city;
        public int pinCode;
        public long phoneNumber;
        public String emailId;

        public Contact(String firstName,String lastName,String address,String city,String state,int pinCode,long phoneNumber,String emailId)
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
	public String getFirstName(){
            return this.firstName;
        }
        public void setFirstName(String firstName){
            this.firstName=firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public void setLastName(String lastName){
            this.lastName=lastName;
        }
	 public String getAddress(){
            return this.address;
        }
        public void setAddress(String address){
            this.address=address;
        }
        public String getCity(){
            return this.city;
        }
        public void setCity(String city){
            this.city=city;
        }
        public String getState(){
            return this.state;
        }
        public void setState(String state){
            this.state = state;
        }
        public int getPinCode(){
            return this.pinCode;
        }
        public void setPinCode(int pinCode ){
            this.pinCode =pinCode ;
        }
        public long getPhoneNumber(){
            return this.phoneNumber;
        }
        public void setPhoneNumber(long phoneNumber ){
            this.phoneNumber=phoneNumber ;
        }
        public String getEmailId(){
            return this.emailId;
        }
        public void setEmailId(String emailId){
            this.emailId =emailId ;
        }
	@Override
	public String toString()
        {
        return "First Name:  "+firstName+" \nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nPincode: "+pinCode+"\nState: "+state+"\nPhoneNumber: "+phoneNumber+"\nEmail ID: "+emailId+"\n";
        }
}
