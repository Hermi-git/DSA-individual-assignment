package assignment1;
//This is a java class named Task.
public class Task {
    //These are instance variables of the Task class that represent the state of the task
	private String title;
     private String description;
     private boolean completed;
     
     // This is the constructor of the Task class. It is used to create a new task with a title and description.

     public Task(String title, String description) {
    	 this.title =title;
    	 this.description =description;
    	 this.completed = false;      // By default, a newly created task is marked as incomplete.
     }
  // These are the getter methods for the instance variables. They allow other parts of the code to access the state of the task.
     public String getTitle() {
    	 return title;
     }
     public String getDescription() {
    	 return description;
     }
     public boolean isCompleted() {
    	 return completed;
     }
  // This is a setter method for the completed instance variable. It allows other parts of the code to mark a task as completed.
     public void markCompleted() {
    	 this.completed =true;
     }
     
     
     
}
