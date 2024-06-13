package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
		// 리스트 메소드
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(5);
		numberList.add(3);
		numberList.add(8);
		numberList.add(1);
		numberList.add(4);

		// 리스트에 특정 값이 있는지 확인
		// 리스트에 8 이 있는지 확인
		System.out.println(numberList.contains(8));
		
		if(numberList.contains(4)) {
			System.out.println("4가 있다");
		}
		
		// 정렬 (sorting)
		System.out.println(numberList);
		// 오름차순
		numberList.sort(Comparator.naturalOrder());
		System.out.println(numberList);
	
		// 내림차순
		numberList.sort(Comparator.reverseOrder());
		System.out.println(numberList);
		
		numberList.clear();
		
		// 리스트가 비어 있는지 확인
		if(numberList.isEmpty()) {
			System.out.println("비어있다!");
		}
		
	}
	
}
