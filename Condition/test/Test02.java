package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		1. 두 점수 합격
//		두 개의 점수를 입력 받아서 두 점수 모두가 70점이 이상이면 합격입니다 를 출력하세요
//		입력 예시
//
//		두 점수를 입력하세요 : 87 73
//		출력 예시
//
//		합격 입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 점수를 입력 받아서 두 점수 모두가 70점이 이상이면 합격입니다.");
		System.out.print("두 점수를 입력 하세요 : ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		if(score1 >= 70 && score2 >= 70) {
			System.out.println("합격 입니다");
		}
		if(score1 < 70 || score2 < 70) {
			System.out.println("불합격 입니다");
		}
		
		
		
//		2. 공배수 구하기
//		수를 입력 받아서 2와 3의 공배수인지 판별하세요.
//		입력 예시
//
//		수를 입력하세요 : 12
//		출력 예시
//
//		12는 2와 3의 공배수 입니다.
		
		System.out.println("수를 입력 받아서 2와 3의 공배수인지 판별하세요.");
		System.out.print("수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0 && number % 3 == 0) {
			System.out.println(number + "는 2 와 3 의 공배수 입니다.");
		}
		
		
//		3. 범위
//		1 ~ 10 사이의 수를 입력 받아야 한다. 범위를 넘어 갈 경우 잘못 입력 하셨습니다 를 출력하세요.
//		입력 예시
//
//		1~10 사이의 수를 입력 하세요 : 14
//		출력 예시
//
//		잘못 입력 하셨습니다.
		
		System.out.println("1 ~ 10 사이의 수를 입력 받아야 한다. 범위를 넘어 갈 경우 잘못 입력 하셨습니다 를 출력하세요.");
		System.out.print("1 ~ 10 사이의 수를 입력 하세요 : ");
		number = sc.nextInt();
		if(number > 10 || number < 1 ) {
			System.out.println("잘못 입력하셨습니다");
		}
		
		
		
	}

}
