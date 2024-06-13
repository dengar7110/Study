package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	
	public static void main(String[] args) {
		
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(20);
		numberList.add(3);
		numberList.add(5);
		numberList.add(84);
		numberList.add(17);
		
		System.out.println(numberList);
		
		
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//		3
		
		int min = numberList.get(0);
		
		for(int i = 0; i < numberList.size(); i++) {
			if(min > numberList.get(i)) {
				min = numberList.get(i);
			}
		}
		System.out.println("최소값 : " + min);
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//		129
		
		Iterator<Integer> iter = numberList.iterator();
		
		int sum = 0;
		while(iter.hasNext()) {
			int number = iter.next();
			sum += number;
		}
		System.out.println("총 합계 : " + sum);
		
		
//		4. 리스트 삭제
//		List 에서 짝수 인 값을 모두 삭제하고 전체 값을 출력 하세요.
//		[3, 5, 17]
		
//		Iterator<Integer> iter2 = numberList.iterator();
		
		iter = numberList.iterator();
		
		while(iter.hasNext()) {
			int number = iter.next();
			if(number % 2 == 0) {
				iter.remove();
			}
		}
		System.out.println(numberList);
	}

}
