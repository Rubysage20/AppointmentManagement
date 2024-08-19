
public class Contact {
private String contactID;
private String firstName;
private String lastName;
private String phone; 
private String address;

public Contact(String contactID, String firstName, String lastName, String phone, String address) {
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.address = address;
}
// Getters 
public String getContactID() { 
	return contactID;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getPhone() {
	return phone;
}
public String getAddress() {
	return address;
}
// Setters
public void setContactID(String contactID) {
	this.contactID = contactID;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public void setAddress(String address) {
	this.address = address;
 }
}
