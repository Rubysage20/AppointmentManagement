import java.util.HashMap;
import java.util.Map;

public class TaskService {
private final Map<String, Task> 
tasks = new HashMap<>();

// Add a task to the task service 
public void addTask(Task task) {
	tasks.put(task.getTaskId(), task);
}
// Delete a task from the task service based on task ID
public void deleteTask(String taskId) {
	tasks.remove(taskId);
}
// Update the name of a task based on task ID
public void updateTaskName(String taskId, String newName) {
	Task task = tasks.get(taskId);
	if(task != null) {
		task.setName(newName);
	}
}

// Update the description of a task based on task ID
public void updateTaskDescription(String taskId, String newDescription) {
	Task task = tasks.get(taskId);
	if(task != null) {
		task.setDescription(newDescription);
	}
}
}

