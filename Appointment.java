import java.util.Date;
import java.lang.IllegalArgumentException;
public class Appointment {
	
private String appointmentId; 
private Date appointmentDate;
private String description; 


// Constructor for creating an Appointment object

public Appointment(String appointmentId, Date appointmentDate, String description) {
	if(appointmentId == null || appointmentId.length() > 10) {
		
	// throws illegalargumentexception if the appointment id is null or more than 10 characters
		throw new IllegalArgumentException("Appointment ID must not be null and must be at most 10 characters long.");
	}
	//throws illegalargumentexception if the appointment date is null, or in the past.
	if (appointmentDate == null || appointmentDate.before(new Date())) {
		throw new IllegalArgumentException("Appointment Date must not be null and must be in the future."); 
	} 
	// throws illegalargumentexception if the description is null. or more than 50 characters.
	if (description == null || description.length() > 50) {
		throw new IllegalArgumentException("Description must not be null and must be at most 50 characters long. ");
	}
	this.appointmentId = appointmentId; 
	this.appointmentDate = appointmentDate;
	this.description = description;
}
// Getters 
public String getAppointmentId() {
	return appointmentId;
}
public Date getAppointmentDate() {
	return appointmentDate;

}
public String getDescription( ) {
	return description;
 }
}

