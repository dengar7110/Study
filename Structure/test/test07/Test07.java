package test.test07;

public class Test07 {
	
	public static void main(String[] args) {
		
		BSTree tree = new BSTree();
		
		tree.add("hagulu", "김인규", "010-1111-9999");
		tree.add("asd8", "홍정원", "010-4444-1111");
		tree.add("zoo", "박나래", "010-4444-1111");
		tree.add("god", "강호동", "010-4444-1111");
		tree.add("no", "서장훈", "010-4444-1111");
		tree.add("email", "이수근", "010-4444-1111");
		tree.add("victory", "탁재훈", "010-4444-1111");
		tree.add("korea", "조세호", "010-4444-1111");
		tree.add("desk", "유재석", "010-4444-1111");
		tree.add("apple", "기안84", "010-4444-1111");
		
		tree.printTree();
		
		System.out.println("==================");
		System.out.println(tree.search("email"));
		
		
	}

}
