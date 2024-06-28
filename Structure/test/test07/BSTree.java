package test.test07;

public class BSTree {

	private Node root = null;
	
	
	// 노드 추가
	public void add (String id, String name, String phoneNumber) {
		Node newNode = new Node(id, name, phoneNumber);
		
		if(root == null) {
			root = newNode;
		}else {
			Node node = root;
			
			while(true) {
				// compareTo 메서드
				// 앞에것이 더 크다 : 1 
				// 뒤에것이 더 크다 : -1
				// 같다 : 0
				if(id.compareTo(node.getId()) < 0) {
					if(node.getLeft() == null) {
						node.setLeft(newNode);
						return;
					}else {
						node = node.getLeft();
					}
				}else {
					if(node.getRight() == null) {
						node.setRight(newNode);
						return;
					}else {
						node = node.getRight();
					}
				}
			}
		}
	}

	public Node search(String id) {
		Node node = root;
		
		while(true) {
			if(id.equals(node.getId())){
				return node;
			}
			
			if(id.compareTo(node.getId()) < 0) {
				node = node.getLeft();
			}else {
				node = node.getRight();
			}
			
		}
		
	}
	
	

	public void printTree() {
		inOrder(root);
	}
	
	// 트리 순회(전위, 중위, 후위)
	// 중위순회
	// Recursive(재귀) - 피보나치 수열(대표적인 재귀 코딩 문제)
	public void inOrder(Node node) {
		if(node.getLeft() != null) {
			inOrder(node.getLeft());
		}
		System.out.println(node);
		if(node.getRight() != null) {
			inOrder(node.getRight());
		}
		
	}
	
	
	
}
