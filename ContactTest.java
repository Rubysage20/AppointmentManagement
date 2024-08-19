import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void testContactCreation() {
		// test contact creation with valid data
		Contact contact = new Contact("1234567890", "Jerald", "Doe", "1234567890", "123 Light St");
		// Assertions for contact fields
		assertEquals("1234567890" , contact.getContactID());
		assertEquals("Jerald", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Light St", contact.getAddress());
	}

}
