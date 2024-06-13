package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
//	1. List 만들기
//	리스트에 주어진 값들을 넣고 출력하세요.
//	3, 8, 9, 4, 2, 1, 7, 5
//	출력 예시
//	[3, 8, 9, 4, 2, 1, 7, 5]
		
	List<Integer> numberList = new ArrayList<>();
	numberList.add(3);
	numberList.add(8);
	numberList.add(9);
	numberList.add(4);
	numberList.add(2);
	numberList.add(1);
	numberList.add(7);
	numberList.add(5);
	System.out.println(numberList);
		
		
//	2. 값 수정하기
//	List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
//	출력 예시
//
//	[3, 8, 9, 6, 2, 1, 7, 5]
	
	numberList.set(3, 6);
	System.out.println(numberList);
	
	
//	3. 값 삽입하기
//	List의 세번째 위치에 10을 삽입 하고 전체를 출력 하세요.
//	[3, 8, 10, 9, 6, 2, 1, 7, 5]
	
	numberList.add(2, 10);
	System.out.println(numberList);
	
	
	
//	4. 값 삭제하기
//	List에서 8과 7을 삭제하고 전체를 출력하세요.
//	출력 예시
//
//	[3, 10, 9, 6, 2, 1, 5]
	
	// index 를 통한 삭제
	numberList.remove(1);
	numberList.remove(6);
	
	// 값을 통한 삭제
	numberList.remove(Integer.valueOf(8));
	numberList.remove(Integer.valueOf(7));
	
	System.out.println(numberList);
		
		
		
	}
}
