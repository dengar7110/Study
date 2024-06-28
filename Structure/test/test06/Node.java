package test.test06;

public class Node {
	
	private int number;
	private Node next;
	
	public Node(int number) {
		this.number = number;
		this.next = null;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getNumber() {
		return number;
	}
	
	public Node getNext() {
		return next;
	}
	
	
}
