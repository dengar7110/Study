package test.test06;

public class LinkedList {

	private Node head = null;
	
	// 값 추가 기능
	public void add(int number) {
		
		Node newNode = new Node(number);
		
		if(head == null) {
			head = newNode;
		}else if(head != null) {
			Node node = head;
			
			while(node.getNext() != null) {
				node = node.getNext();
			}
		
			node.setNext(newNode);
		}
		
		
	}
	
	// 특정 index 값 얻어 오는 기능
//	public int get(int index) {
//		
//	}
	
	// 전체 내용 리턴하는 toString
	@Override
	public String toString() {
		
		String result ="";
		Node node = head;
		while(node != null) {
			result += node.getNumber() + " ";
			node = node.getNext();
		}
		
		return result;
	}
	
	
	// ++ 중간에 값 삽입, index 기반 값 삭제
	
	
	
}
