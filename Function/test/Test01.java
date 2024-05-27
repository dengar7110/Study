package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("제곱값을 구할 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();
		int result = getSquared(number1);
		System.out.println(number1 + "의 제곱은 " + result + "이다.");
		
		
		System.out.println("점수를 입력하세요 : ");
		number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		System.out.println("평균은 " + getAverage(number1, number2, number3, number4));
		
		
		System.out.println("숫자와 나눌 수를 입력하세요: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		printQuotientRemainder(number1,number2);
		
		
		System.out.println("숫자를 입력하세요 : ");
		number1 = sc.nextInt();
		System.out.println(divisionNumber(number1));
		
	}

//	1. 2의 제곱 함수
//	정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	hint ) 함수 원형 - public static int getSquared(int x)
//
//	입력 예시
//
//	제곱값을 구할 숫자를 입력하세요: 5
//	출력 예시
	
	public static int getSquared(int number) {
		
		int result = number * number;
		return result;
	}
	
//
//	5의 제곱은 25이다.
//	2. 평균 구하기 함수
//	4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//	hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
//
//	입력 예시
//
//	점수를 입력하세요: 85 72 65 99
//	출력 예시
//
//	평균은 80.25
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		int total = score1 + score2 + score3 + score4;
		double average = total / 4.0;
		
		return average;
	}
	
//	3. 몫과 나머지 출력 함수
//	두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//	hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
//
//	입력 예시
//
//	숫자와 나눌 수를 입력하세요: 20 7
//	출력 예시
//
//	몫: 2
//	나머지: 6
	
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫: " + quotient);
		System.out.println("나머지: " + remainder);
	}
	
//	4. 홀짝 함수
//	정수를 입력 받아서 짝수면 0 홀수면 1을 돌려 주는 함수를 만드세요.
//	입력 예시
//
//	숫자를 입력하세요: 6
//	출력 예시
//
//	0
	
	public static int divisionNumber(int number1) {
		
		if(number1 % 2 == 0) {
			return 0;
		}
		return 1;
	}
	
}
