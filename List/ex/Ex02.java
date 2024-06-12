package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 리스트와 반복문
		List<String> fruitList = new ArrayList<>();
		fruitList.add("banana");
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("banana");
		fruitList.add("banana");
		fruitList.add("banana");
		fruitList.add("banana");
		fruitList.add("banana");
		
		//index 기반의 반복문
		for(int i = 0; i < fruitList.size(); i++) {
			String fruit = fruitList.get(i);
			
//			if(fruit.equals("banana")) {
//				fruitList.remove(i);
//			}
//			System.out.print(fruit + " ");
		}
		System.out.println(fruitList);

		// 향상된 for 문 - foreach
		for(String fruit : fruitList) {
			System.out.print(fruit + " ");
//			if(fruit.equals("banana")) {
//				fruitList.remove(fruit);
//			}
		}
		System.out.println();
		
		// Iterator
		Iterator<String> iter = fruitList.iterator();
		
		while(iter.hasNext()) {
			String fruit = iter.next();
//			System.out.print(fruit + " ");
			if(fruit.equals("banana")) {
				iter.remove();
			}
		}
		System.out.println(fruitList);		
		
	}
	

}
