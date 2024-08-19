import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
	
	// Map to store appointments
private Map<String, Appointment> appointments;

// Constructor to initialize the appointments map
public AppointmentService() { 
	this.appointments = new HashMap<>();
}
// Method to add an appointment with a unique appointment ID
public void addAppointment (Appointment appointment) {
	appointments.put(appointment.getAppointmentId(), appointment);
}
// Method to delete an appointment by unique appointment ID 
public void deleteAppointment(String appointmentId) { 
	appointments.remove(appointmentId); 
 }
// Method to get all appointments 
public Map<String, Appointment> getAppointments() {
	return appointments;
	}
}

