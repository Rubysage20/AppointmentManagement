
public class Task {
private String taskId; 
public String name;
public String description;

// Constructor to initialize Task object 
public Task(String taskId, String name, String description) {
	this.taskId = taskId;
	this.name = name;
	this.description = description;
}

// Getter for taskId
public String getTaskId() {
	return taskId;
}
// Getter and setter for name 

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
// Getter and setter for description 
public String getDescription() { 
	return description;
}

public void setDescription(String description) { 
	this.description = description;
}

}
