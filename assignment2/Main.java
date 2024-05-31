package assignment2;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtPos(1, 0);
		list.insertAtPos(1, 1);
		list.insertAtPos(2, 2);
		list.insertAtPos(3, 3);
		list.insertAtPos(4, 4);
        list.displayList();
        list.deleteAtPosition(2);
        list.displayList();
        Node node = list.node(0); 
        list.deleteAfterNode(node);
        list.displayList();
        System.out.println(list.searchNode(1));
        System.out.println(list.searchNode(5));
        
        
        Stack stack = new Stack();
     // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
     // Peeking at the top element
        System.out.println("Top element of the stack: " + stack.peek());
        
     // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop()); //Trying to pop from an empty stack
        
        
        
        
	}

}
