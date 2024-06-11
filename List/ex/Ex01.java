package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 리스트 
		// 같은 형태의 데이터를 여러개 저장하는 자료구죠
		// 순서가 존재한다.
		
		List<Integer> numberList =  new ArrayList<>(); 
		
		// 값 추가
		numberList.add(25);
//		numberList.add("홍정원");
		numberList.add(10);
		
		System.out.println(numberList);
		
		// 값 갑입
		numberList.add(1,20);
		System.out.println(numberList);
		
		// 값 얻어 오기
		// numbers[2]
		Integer number1 = numberList.get(2);
		System.out.println(number1);
		
		int number2 = numberList.get(1);
		System.out.println(number2);
		
		System.out.println(numberList.get(0));
		
		
	}
	
}
