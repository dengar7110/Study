package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		1. 사칙연산
//		두 수를 입력 받아서 덧셈 뺄셈 곱하기 나누기한 결과를 출력하세요
//		입력 예시
//
//		입력1 : 5
//		입력2 : 9
//		출력 예시
//
//		덧셈 : 14
//		뺄셈 : -4
//		곱셈 : 45
//		나눗셈 : 0
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("두 수를 입력 받아서 덧셈 뺄셈 곱하기 나누기한 결과를 출력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiply = num1 * num2;
		int divide = num1 / num2;
		
		System.out.println("덧셈 : " + plus );
		System.out.println("뺄셈 : " + minus );
		System.out.println("곱셈 : " + multiply );
		System.out.println("나눗셈 : " + divide );
		
//		2. 몫과 나머지
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		입력 예시
//
//		입력1 : 843
//		입력2 : 8
//		출력 예시
//
//		몫 : 105 나머지 : 3
		
		System.out.println("두 수를 입력 받아서 몫과 나머지를 출력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int quotient = num1 / num2; //몫
		int remainder = num1 % num2; //나머지
		System.out.println("몫 : " + quotient + " 나머지 : " + remainder );
		
//		3. 정사각형 넓이
//		입력 받은 숫자의 값을 한 변의 길이로 하는 가진 정사각형의 넓이를 구하여 출력하세요.
//		입력 예시
//
//		길이 : 43
//		출력 예시
//
//		정사각형의 넓이 : 1849
		
		System.out.println("입력 받은 숫자의 값을 한변의 길이로 하는 가진 정사각형의 넓이를 구하여 출력하세요");
		int length = sc.nextInt();
		int square = length * length;
		System.out.println("정사각형의 넓이 : " + square);
		
//		4. 삼각형의 넓이
//		밑변 과 높이를 입력 받아서 삼각형의 넓이를 구하여 출력하세요.
//		입력 예시
//
//		밑변 : 13
//		높이 : 9
//		출력 예시
//
//		삼각형의 넓이 : 58.5
		
		System.out.println("밑변 과 높이를 입력 받아서 삼각형의 넓이를 구하여 출력하세요.");
		length = sc.nextInt();
		int height = sc.nextInt();
		double triangle = length * height / 2.0;
		System.out.println("삼각형의 넓이 : " + triangle);
		
//		5. 교체
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//
//		x : 6
//		y : 4
//		출력 예시
//
//		x : 4 y : 6
		
		System.out.println("수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("x : " + y + " y : " + x);
		
		
//		6. 초 변환
//		초를 입력 받아서 ?분?초 형태로 출력하세요.
//		입력 예시
//
//		초 : 464
//		출력 예시
//
//		7분 44초
		
		System.out.println("초를 입력 받아서 ?분?초 형태로 출력하세요");
		int input = sc.nextInt();
		int minutes = input / 60;
		int seconds = input % 60;
		System.out.println(minutes + "분 " + seconds + "초");
		
	}

}
