import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	public void testAddContact() {
		// Test adding a contact to the service 
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1234567890", "Jerald", "Doe", "1234567890", "123 Light St");
		contactService.addContact(contact);
		
		// check if the contact was added successfully 
		assertEquals(contact, contactService.getContact("1234567890"));
	}
	@Test 
	public void testDeleteContact() {
		// Test deleting a contact from the service 
		ContactService contactService = new ContactService(); 
		Contact contact = new Contact("1234567890", "Jerald", "Doe", "1234567890", "123 Light St"); 
		
		contactService.addContact(contact);
		contactService.deleteContact("1234567890");
		
		// Check if the contact was deleted successfully 
		assertNull(contactService.getContact("1234567890"));
	}
	@Test
	public void testUpdateContact() {
		
		// test updating a contact field in the service 
		ContactService contactService = new ContactService(); 
		
		Contact contact = new Contact("1234567890", "Jerald", "Doe", "1234567890", "123 Light St");
		
		contactService.addContact(contact);
		contactService.updateContact("1234567890", "firstName", "Valerie");
		
		// Check is the contact's first name was updated successfully
		assertEquals("Valerie", contactService.getContact("1234567890").getFirstName());
	}

}
