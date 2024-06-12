package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
	
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		
		List<Integer> array = new ArrayList<>();
		array.add(20);
		array.add(3);
		array.add(5);
		array.add(84);
		array.add(17);
		System.out.println(array);

//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//		3
		
		int value = array.get(0);
		
		for(int i = 0; i < array.size(); i++) {
			if(value > array.get(i)) {
				value = array.get(i);
			}
		}
		
		System.out.println(value);
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//		129

		Iterator<Integer> iterator = array.iterator();
		
		int sum = 0;
		while(iterator.hasNext()) {
			int value2 = iterator.next();
			sum += value2; 
			
		}
		
		System.out.println(sum);
		
//		4. 리스트 삭제
//		List 에서 짝수 인 값을 모두 삭제하고 전체 값을 출력 하세요.
//		[3, 5, 17]
		
		Iterator<Integer> iterator2 = array.iterator();
		
		while(iterator2.hasNext()) {
			int value3 = iterator2.next();
			if(value3 % 2 == 0) {
				iterator2.remove();
			}
		}
		
		System.out.println(array);
		
	}
	
}
