package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		1. 자릿수 쪼개기
//		네 자릿수 숫자를 입력 받아서 천의 자리부터 한 줄씩 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		1
//		2
//		3
//		4
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		System.out.println(number.charAt(0));
		System.out.println(number.charAt(1));
		System.out.println(number.charAt(2));
		System.out.println(number.charAt(3));
		
		
//		2. 자릿수 쪼개기 역순
//		네 자릿수를 입력 받아서 일의 자리부터 한 줄씩 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		4
//		3
//		2
//		1
		Scanner sc2 = new Scanner(System.in);
		
		String number2 = sc.next();
		System.out.println(number2.charAt(3));
		System.out.println(number2.charAt(2));
		System.out.println(number2.charAt(1));
		System.out.println(number2.charAt(0));

		
//		3. 자릿수 합 구하기
//		네 자릿수를 입력 받아서 각 자릿수의 합을 출력하세요.
//		입력 예시
//
//		입력
//		1234
//		출력 예시
//
//		합계는 10 입니다. 
		
		Scanner sc3 = new Scanner(System.in);
		String number3 = sc.next();
		int answer = (number3.charAt(0) - '0') + (number3.charAt(1) - '0') + (number3.charAt(2) - '0') + (number3.charAt(3) - '0');
	
		System.out.println("합계는 " + answer + " 입니다.");
		
		
		
//		4. 역순 출력
//		세 자리 수를 입력 받아서 역순으로 출력하세요
//		입력 예시
//
//		입력 : 123
//		출력 예시
//
//		출력 : 321

		Scanner sc4 = new Scanner(System.in);
		String number4 = sc.next();
		System.out.println("출력 : " + number4.charAt(2) + number4.charAt(1) + number4.charAt(0));
		
		
		
	}

}
