package test.test07;

public class Node {

	private String id;
	private String name;
	private String phoneNumber;
	private Node left;
	private Node right;
	
	public Node(String id, String name, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.left = null;
		this.right = null;
	}

	public String getId() {
		return id;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "ID : " + id + " 이름 : " + name + " 전화번호 : " + phoneNumber; 
	}
	
	
}
