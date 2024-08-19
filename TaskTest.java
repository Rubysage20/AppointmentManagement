


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
	
// Test case for initializing a task and checking its properties
	@Test
	public void testTaskConstructor() {
		
		Task task = new Task("1", "Task 1", "Description Task 1");
		assertEquals("1", task.getTaskId());
		assertEquals("Task 1", task.getName());
		assertEquals("Description Task 1", task.getDescription());
	}
	@Test
	public void testTaskNameUpdate() {
		
		Task task = new Task ("1", "Task 1", "Description Task 1");
		task.setName("Updated Task 1");
		assertEquals("Updated Task 1", task.getName());
	}
	@Test
	public void testTaskDescriptionUpdate() {
		
		Task task = new Task ("1", "Task 1", "Description 1");
		task.setDescription("Updated Description 1");
		assertEquals("Updated Description 1", task.getDescription());
	}

}
