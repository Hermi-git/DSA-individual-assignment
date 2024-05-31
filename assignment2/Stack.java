package assignment2;

//5. Implementing a Stack Using Linked Lists
public class Stack {
	
	 private Node top; // Top of the stack

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.setNext(top);
	        top = newNode;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack underflow");
	            return -1;
	        }

	        int data = top.getValue();
	        top = top.getNext();
	        return data;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return top.getValue();
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }
	}


