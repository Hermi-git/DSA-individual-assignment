package assignment2;

public class Node {
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value=value;
		this.next= null;
	}
   Node getNext() {
	   return next;
   }
   public int getValue() {
	   return value;
   }
   public void setNext(Node next) {
       this.next = next;
   }
}



