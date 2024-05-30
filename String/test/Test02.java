package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		1. 정수 문자열 변환
//		아래와 같이 생년월일이 저장된 정수 변수가 있다.
//		해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요.
		int year = 2000;
		int month = 11;
		int day = 15;
//		출력 예시
//
//		20001115
		System.out.println("해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요.");
		
		String yearStr = String.valueOf(year);
		String monthStr = String.valueOf(month);
		String dayStr = String.valueOf(day);
		System.out.println(yearStr + monthStr + dayStr);
		
//		String yearStr = year + "";
//		String monthStr = month + "";
//		String dayStr = day + "";
		
		String yearStr2 = Integer.toString(year);
		String monthStr2 = Integer.toString(month);
		String dayStr2 = Integer.toString(day);
		System.out.println(yearStr2 + monthStr2 + dayStr2);
		
		
//		2. 문자열 정수 변환
//		아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력 하세요 (한국 나이)
		String yearString = "1995";
//		출력 예시
//
//		1995년생의 나이는 29살
		int age = 2024 - Integer.parseInt(yearString);
		System.out.println(yearString + "년생의 나이는" + age + "살");
		
		
//		3. 개수 세기
//		아래 배열에 물품 목록이 저장되어 있다.
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
//		제품명을 입력받고 해당 제품이 배열에 몇 개 있는지 출력하세요.
//		입력 예시
//
//		제품명 : 육개장
//		출력 예시
//
//		3개
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제품명 : ");
		
		int count = 0;
		String merchandise = sc.next();
		
		for(int i = 0; i < goods.length; i++) {
			if(merchandise.equals(goods[i])) {
				count++;
			}
		}
		
		System.out.println(count + " 개");
		
		
	}

}
