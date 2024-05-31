package assignment1;
//This is a Java class named ToDoList.
public class ToDoList {
         private Node head;   //This is a private instance variable 'head' of type Node.
         
        //This is a public method 'addToDo' that takes a Task object as a parameter to add a new task on todolist.
         public void addToDo(Task task) {
        	 Node newNode = new Node(task); //This line creates a new Node object with the given Task object
        	//This if statement checks if the lnkedlist has no any element.
        	 if (head ==null) {
        		 head = newNode; // newNode is assigned to the first value of the linked list "head".
        		 }
        	 else  //If head is not null, this block of code is executed
        	 {
        	 Node currentNode = head; //This line initializes a new Node 'currentNode' to traverse the linked list starting from the head
        	 
        	 while(currentNode.getNext() != null) //This line loops until the last node in the linked list is reached
        	 {
        		 currentNode= currentNode.getNext();
        	 }
        	 currentNode.setNext(newNode); //Once the last node is reached, this line sets the next node to the new node. 
        	 
         }
        }
         //This is a public method 'markToDoAsCompleted' that takes a title as a parameter to mark a task as completed.

         public void markToDoAsCompleted(String title) {
        	Node currentNode = head; //initialize a new Node 'currentNode' to traverse the linked list starting from the head
       	 
        	while (currentNode != null) //This loops until the last node in the linked list is reached
        	{
        		if (title.equals(currentNode.getTask().getTitle())) //this line checks if the title of the current task matches the given title
        		{
        		       currentNode.getTask().markCompleted();//If the titles match, this line marks the task as completed.
        		       return;  //exits the method after marking the task as completed  
        		       }

        		 currentNode = currentNode.getNext(); //This line update the currentNode to the next node.

        		    }
        		
        }
         //This is a public method 'viewToDoList' to display the tasks.
        public void viewToDoList() {
        	//If the linked list is empty, this line prints a message indicating there are no tasks assign.
        	if (head == null) {
        		System.out.println("There is no task!");
        		return;
        	}
        	System.out.println("***TO-DO-LIST***"); //prints a heading for the todolist.
        	Node currentNode =head;
        	while(currentNode!=null) {
        		String completionStatus; //declares a variable 'completionStatus' to store whether a task is completed or pending
        		//If the task is completed, this line sets 'completionStatus' to "Completed" other wise sets 'completionStatus' to "Pending"
        		if (currentNode.getTask().isCompleted()) {
        		    completionStatus = (String) "Completed";
        		} else {
        		    completionStatus = (String) "Pending";
        		}
        		//prints the title of the task along with its completion status
        		System.out.println(currentNode.getTask().getTitle() + ": " + completionStatus);
        		currentNode =currentNode.getNext(); //update current node to next node.
        		
       
        	}
        	
        }
         
         
         
}
