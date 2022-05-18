//need to add validation, but general Array List practice.  
public class Contacts{

    private String contactName;
    private String phoneNumber;

    public Contacts(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nNAME: " + contactName + "\nPHONE NUMBER: " + phoneNumber;
        //"Name: " + contactName + '\'' +
        //"Phone Number " + PhoneNumber + '\'';
    }

}
