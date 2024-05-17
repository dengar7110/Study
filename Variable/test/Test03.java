package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		1. 입력 출력
//		나이를 입력 받아서 아래와 같이 출력하세요.
//		입력 예시
//
//		나이를 입력하세요 
//		24
//		출력 예시
//
//		이름 : 김인규 나이 : 24
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요");
//		int age = sc.nextInt();	
//		System.out.println("이름 : 홍정원 나이 : " + age);
//		
		
		
//		2. 입력과 더하기
//		두 수를 입력 받아서 더하고 아래와 같이 출력하세요.
//		입력 예시
//
//		두 수를 입력 하세요 
//		3 5
//		출력 예시
//
//		3 + 5 = 8
		
		System.out.println("두 수를 입력 하세요.");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int plus = number1 + number2;
		System.out.println(number1 + " + " + number2 +  " = "  + plus);
		
		
//		3. 입력과 빼기
//		두 수를 입력 받아서 빼고 아래와 같이 출력하세요.
//		입력 예시
//
//		두 수를 입력 하세요
//		3 5
//		출력 예시
//
//		3 - 5 = -2;
		
 		System.out.println("두 수를 입력 하세요.");
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		int minus = number1 - number2;
		System.out.println(number1 + " + " + number2 +  " = "  + minus);
		
		
		
//		4. 구구단
//		단수를 입력 받고 아래와 같이 구구단을 출력하세요.
//		입력 예시
//
//		단수를 입력 하세요 : 5
//		출력 예시
//
//		5 X 1 = 5
//		5 X 2 = 10
//		5 X 3 = 15
//		5 X 4 = 20
//		5 X 5 = 25
		
		
		System.out.println("단수를 입력 하세요 : ");
		int gugudan = sc.nextInt();
		System.out.println(gugudan + " X " + 1 + " = " + gugudan * 1);
		System.out.println(gugudan + " X " + 2 + " = " + gugudan * 2);
		System.out.println(gugudan + " X " + 3 + " = " + gugudan * 3);
		System.out.println(gugudan + " X " + 4 + " = " + gugudan * 4);
		System.out.println(gugudan + " X " + 5 + " = " + gugudan * 5);
		
		
//		5. 원 넓이 구하기
//		지름을 입력 받아서 원의 넓이를 구하여 출력하세요.
//		pi는 3.14
//		입력 예시
//
//		지름을 입력하세요 :  24
//		출력 예시
//
//		원의 넓이는 452.16 입니다.

		System.out.println("지름을 입력하세요 : ");
		
		int diameter = sc.nextInt();
		double pi = 3.14;
		double radius = diameter / 2.0;
		double circle =  pi * (radius * radius);
		
		
		System.out.println("원의 넓이는 " + circle + " 입니다.");
		
		
	}

}
