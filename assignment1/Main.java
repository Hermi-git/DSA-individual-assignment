package assignment1;

public class Main {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();//Create a new instance of the ToDoList class.
		//This code demonstrates the usage of the ToDoList class to add tasks, view the to-do list, and mark a task as completed.
		toDoList.addToDo(new Task("Doing Assignment", "DSA assignment, OOP assignment"));
		toDoList.addToDo(new Task("Meeting", "Due 8:00pm"));
		toDoList.addToDo(new Task("Shopping", "clothes, shoes"));
		
		toDoList.viewToDoList();
		toDoList.markToDoAsCompleted("Shopping");
		toDoList.viewToDoList();
		
	}

}
