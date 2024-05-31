package assignment2;

public class LinkedList {
	private Node head;
    
	public LinkedList() {
		this.head =null;
	}
	//1. Inserting a Node at Any Given Position in a Singly Linked List
	public void insertAtPos(int data, int position) {
        // Check for invalid positions
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            // Insert at the beginning, even if head is null
            newNode.setNext(head);
            head = newNode;
            System.out.println("Inserted " + data + " at first position " + position);
            return;
        }

        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.getNext();
            count++;
        }

        if (current == null) {
            System.out.println("The position specified is not within the valid range.");
            return;
        }

        // Insert after the current node
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        System.out.println("Inserted " + data + " at position " + position);
    }
	public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

//2. Deleting a Node at Any Given Position
public void deleteAtPosition(int position) {
    if (position < 1) {
        System.out.println("Invalid position: " + position);
        return;
    }

    if (position == 1) {
        // Delete the head node
        head = head.getNext();
        System.out.println("delete "+ head + "from first position"+ position);
        return;
    }

    Node current = head;
    int count = 1;
    while (current != null && count < position - 1) {
        current = current.getNext();
        count++;
    }

    if (current == null || current.getNext() == null) {
        System.out.println("The position specified is not within the valid range.");
        return;
    }

    // Delete the node after the current node
    current.setNext(current.getNext().getNext());
    System.out.println("The element is deleted from position "+ position);

}
// 3. Deleting a Node After a Given Node
 public void deleteAfterNode(Node prevNode) {
    if (prevNode == null || prevNode.getNext() == null) {
        System.out.println("Cannot delete after last node");
        return;
    }

    prevNode.setNext(prevNode.getNext().getNext());
    System.out.println("The node deleted after "+ prevNode.getValue());
}
 public Node node(int index) {
     Node current = head;
     int count = 0;
     while (current != null) {
         if (count == index) {
             return current;
         }
         count++;
         current = current.getNext();
     }
     return null;
 }

// 4. Searching a Node in a Singly Linked List
public boolean searchNode(int data) {
    Node current = head;
    while (current != null) {
        if (current.getValue()==data) {
            return true;
        }
        current = current.getNext();
    }
    return false;
}
}

