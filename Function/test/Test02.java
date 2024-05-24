package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int number1 = sc.nextInt();
		int result = addNumbers(number1);
		System.out.println(result);
		
		System.out.println("수를 입력하세요 : ");
		number1 = sc.nextInt();
		boolean a = primeDiscrimination(number1);
		System.out.println(a);
	}
	
//	1. 합 구하기
//	수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//	단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
//	입력 예시
//
//	수를 입력하세요 : 85
//	출력 예시
//
//	105
	
	public static int addNumbers(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			
			if(sum > 100) {
				break;
			}
			sum += i;
		}
		return sum;
		
	}
	
	
//	2. 소수(prime) 판별
//	소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//
//	수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//	소수이면 true, 소수가 아니면 false를 리턴
//	단, 입력하는 수는 2 이상
//	입력 예시
//
//	수를 입력하세요 : 22
//	출력 예시
//
//	false
	
	public static boolean primeDiscrimination(int number) {
		for(int i = 1; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
			
		return true;
	}
	
	
}
