import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.lang.IllegalArgumentException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

public class AppointmentTest {

    @SuppressWarnings("deprecation")
	@Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testValidAppointmentCreation() {
    	//test creating a valid appointment with a future date and description
        Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day in milliseconds
        Appointment appointment = new Appointment("A001", futureDate, "Meeting with client");

        assertNotNull(appointment);
        assertEquals("A001", appointment.getAppointmentId());
        assertEquals(futureDate, appointment.getAppointmentDate());
        assertEquals("Meeting with client", appointment.getDescription());
    }
     // Test creating an appointment with a null id, which should throw an exception
    @Test
    public void testInvalidAppointmentCreation_NullId() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Appointment ID must not be null and must be at most 10 characters long.");

        Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day in milliseconds
        new Appointment(null, futureDate, "Meeting with client");
    }
    // Test creating an appointment with a past date, which should throw an illegal argument exception

    @Test
    public void testInvalidAppointmentCreation_PastDate() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Appointment Date must not be null and must be in the future.");

        Date pastDate = new Date(System.currentTimeMillis() - 86400000); // Subtracting one day in milliseconds
        new Appointment("A002", pastDate, "Meeting with client");
    }
    // Test creating an appointment with a null description, which should throw an IllegalArgumentException

    @Test
    public void testInvalidAppointmentCreation_NullDescription() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Description must not be null and must be at most 50 characters long.");

        Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day in milliseconds
        new Appointment("A003", futureDate, null);
    }
//  Test creating an appointment with an appointment of more than 10 characters, which should throw an exception 
    @Test
    public void testInvalidAppointmentCreation_LongId() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Appointment ID must not be null and must be at most 10 characters long.");

        Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day in milliseconds
        new Appointment("A0123456789", futureDate, "Meeting with client");
    }

    @Test
    public void testInvalidAppointmentCreation_LongDescription() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Description must not be null and must be at most 50 characters long.");

        Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day in milliseconds
        new Appointment("A004", futureDate, "Meeting with a client that has a long name and description");
    }
}