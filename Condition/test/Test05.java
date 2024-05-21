package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
//		1.짝수 구하기
//		세개의 수를 입력 받아서 짝수일 때만 그 값을 출력 하세요.
//		입력 예시
//
//		세개의 수를 입력 하세요 : 4 6 9
//		출력 예시
//
//		4는 짝수 입니다. 
//		6은 짝수 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세개의 수를 입력 받아서 짝수일 때만 그 값을 출력 하세요.");
		System.out.print("세개의 수를 입력 하세요 : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		if(number1 % 2 == 0) {
			System.out.println(number1 + "는 짝수 입니다.");
		}
		if(number2 % 2 == 0 ) {
			System.out.println(number2 + "는 짝수 입니다.");
		}
		if(number3 % 2 == 0 ) {
			System.out.println(number3 + "는 짝수 입니다.");
		}
		
		
//		2. 비만도 구하기
//		BMI 수치를 입력 받아서 비만 판정을 출력하세요.
//
//		bmi 수치	비만도
//		~ 10 이하	정상
//		~ 20 이하	과체중
//		20 ~ 초과	비만
//		입력 예시
//
//		bmi 수치를 입력 하세요 : 18
//		출력 예시
//
//		과체중
		
		System.out.println("BMI 수치를 입력 받아서 비만 판정을 출력하세요.");
		System.out.print("bmi 수치를 입력 하세요 : ");
		int bmi = sc.nextInt();
		if(bmi <= 10) {
			System.out.println("정상");
		}else if(bmi <= 20) {
			System.out.println("과체중");
		}else if(bmi > 20) {
			System.out.println("비만");
		}
		
		
//		3. 평균 합격 구하기
//		두 점수를 입력 받고 , 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		입력 예시
//
//		두 점수를 입력 하세요 : 87 95
//		출력 예시
//
//		합격입니다.
		
		System.out.println("두 점수를 입력 받고 , 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.");
		System.out.print("두 점수를 입력 하세요 : ");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		int total = score1 + score2;
		double average = total / 2.0;
		
		if(average >= 70) {
			System.out.println("합격입니다.");
		}
		
		
//		4. 큰값 구하기
//		세 개의 정수를 입력 받아, 가장 큰값을 출력 하세요.
//		입력 예시
//
//		세 수를 입력 하세요 : 3 8 5
//		출력 예시
//
//		8
		
		System.out.println("세 개의 정수를 입력 받아, 가장 큰값을 출력하세요.");
		System.out.print("세 수를 입력 하세요 : ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		int max = number1;
		
		if(number1 < number2 ) {
			max = number2;
		}
		if(number2 < number3) {
			max = number3;
		}
		System.out.println("가장 큰값은 : " + max);
				
		
		
//		5. 계절 구하기
//		월(month)를 입력 받아서 어떤 계절인지 출력하세요.
//
//		월	계절
//		3, 4, 5	봄
//		6, 7, 8	여름
//		9, 10, 11	가을
//		12, 1, 2	겨울
//		입력 예시
//
//		월을 입력 하세요 : 5
//		출력 예시
//
//		봄
		
		System.out.println("월(month)를 입력 받아서 어떤 계절인지 출력하세요.");
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 3,4,5 :
			System.out.println("봄");
			break;
		case 6,7,8 :
			System.out.println("여름");
			break;
		case 9,10,11 : 
			System.out.println("가을");
		   	break;
		case 12,1,2 : 
			System.out.println("겨울");
			break;
		default :
			System.out.println("올바른 숫자를 입력해주세요");
		}
		

	}

}
