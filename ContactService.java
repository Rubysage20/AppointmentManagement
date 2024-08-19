import java.util.HashMap;
import java.util.Map;

public class ContactService {
private Map<String, Contact> contacts; 

public ContactService () { 
	this.contacts = new HashMap<>();
}
// add a contact to the service 
public void addContact(Contact contact) {
	contacts.put(contact.getContactID(), contact); 
}
// Delete a contact from the service 
public void deleteContact(String contactID) {
	contacts.remove(contactID);
}
// Update a specific field of a contact
public void updateContact(String contactID, String field, String value) {
	Contact contact = contacts.get(contactID);
	if (contact == null) {
		return;
	}
	switch(field) {
	
	case "firstName":
	contact.setFirstName(value);
	break;
	
	case "lastName":
		contact.setLastName(value);
		break;
		
	case "phone":
		contact.setPhone(value);
		break;
		
	case "address": 
		contact.setAddress(value);
		break;
		default:
		
			System.out.println("Invalid field");
	}
}
public Contact getContact(String contactID) {
	return
		contacts.get(contactID);
}
}
