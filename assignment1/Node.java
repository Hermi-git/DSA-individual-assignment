package assignment1;
//This is a Java class named Node. It represents a node in a singly linked list.
public class Node {
	// These are the instance variables of the Node class.

	private Task task;
	private Node next;
	// This is the constructor of the Node class.
	public Node(Task task) {
		this.task =task;
		this.next=null;   // By default, a newly created node points to null
	}
	// These are the getter methods for the instance variables. They allow other parts of the code to access.
	 public Task getTask() {
	        return task;
	    }
	 public Node getNext() {
	        return next;
	    }
	
   //This is setter method. it allows other parts of the code to modify the state of the node.
	 public void setNext(Node next) {
	        this.next = next;
	    }

}
