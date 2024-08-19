import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest
{
  @Test
 public void testAddAppointmentService() {
	  
	  // Create an instance of Appointment Service
	AppointmentService appointmentService = new AppointmentService(); 
	
	// Current date for testing 
	Date currentDate = new Date();
	Appointment appointment = new Appointment("Appt12345", currentDate, "Meeting with Client"); 
	
	// Add appointment to the service
		appointmentService.addAppointment(appointment);
		
		// Check if the appointment was added successfully
		assertTrue(appointmentService.getAppointments().containsKey("Appt12345")); 
  }
		
	//Test to verify deleting an appointment from the service
  @Test
  public void testDeletrAppointment() {
	  // Create an instance of appointment service
	  AppointmentService appointmentService = new AppointmentService(); 
	  
	  // Create a new appointment
	  Date currentDate = new Date();
	  Appointment appointment = new Appointment("Appt12345", currentDate, "Meeting with Client"); 
	  
		// Add appointment to the service
		appointmentService.addAppointment(appointment);
		
	  // Delete the appointment from the service. 
		appointmentService.deleteAppointment("Appt12345");
		
		// Check if the appointment was deleted successfully
		assertFalse(appointmentService.getAppointments().containsKey("Appt12345")); 
	}
}


