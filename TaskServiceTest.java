


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskServiceTest {
// Test case for adding a task to task service 
	@Test
	public void testAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("1", "Task 1", "Description of Task 1"); 
		taskService.addTask(task);
		assertNotNull(taskService.getTask("1"));
	}
// Test case for deleting a task from task service 
	@Test 
	public void testDeleteTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("1", "Task 1", "Description of Task 1");
		taskService.addTask(task);
		taskService.deleteTask("1");
		assertNull(taskService.getTask("1"));
	}
	
	// Test case for updating the name of a task in task service 
	@Test
	public void testUpdateTaskName() {
		// Create a task service 
		TaskService taskService = new TaskService();
		
		// Add a task to the task service 
		Task task = new Task("1", "Task 1", "Description of Task 1");
		taskService.addTask(task);
		
		// Update the name of the task 
		taskService.updateTaskName("1", "Updated Task");
		
		// Check if the name of the task has been updated 
		assertEquals("Updated Task 1", ((Task) taskService.getTask("1")).getName());
	}
	// Test case for updating the description of task in task service 
	@Test 
	public void testUpdateTaskDescription() {
		// Create a task service 
		TaskService taskService = new TaskService(); 
		
		// Add a task to the task service 
		Task task = new Task("1", "Task 1", "Description of Task 1"); 
		taskService.addTask(task);
		
		// Update the description of the task 
		taskService.updateTaskDescription("1", "Updated description of Task 1");
		
		// Check if the description of the task has been updated 
		assertEquals("Updated description of Task 1", ((Task) taskService.getTask("1")).getDescription());
	}
	
}
