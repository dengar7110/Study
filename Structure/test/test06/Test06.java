package test.test06;

public class Test06 {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		Node head = node1;

//		head.getNumber();
//		Node node = head.getNext();
//		node.getNumber();
//		node.getNext();
	
		Node node = head;
		
		while(node != null) {
			System.out.println(node.getNumber());
			node = node.getNext();
		}
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
	
	
	}	
	
}
