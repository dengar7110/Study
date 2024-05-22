package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
//		1. 반복 출력
//		수를 입력 받아서 그 수만큼 "응 아니야" 를 출력하세요
//		입력 예시
//
//		횟수를 입력하세요 : 5
//		출력 예시
//
//		응 아니야
//		응 아니야
//		응 아니야
//		응 아니야
//		응 아니야
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력 받아서 그 수만큼 \"응 아니야\" 를 출력하세요");
		System.out.print(" 횟수를 입력하세요 : ");
		int number = sc.nextInt();
		
		//for문 사용
		for(int i = 1; i <= number; i++) {
			System.out.println("for문 사용 : 응 아니야");
		}
		
		//while문 사용
		int i = 0;
		while(i < number) {
			System.out.println("while문 사용 : 응 아니야");
			i++;
		}
		
		
//		2. 카운트 다운 "발사"
//		수를 입력 받고 그 수에서 부터 0 까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		입력 예시
//
//		카운트 다운 입력하세요 : 3
//		출력 예시
//
//		3
//		2
//		1
//		0
//		발사 
		System.out.println("수를 입력 받고 그 수에서 부터 0 까지 한 줄씩 카운트 다운을 출력 하고 마지막에 \"발사\"를 출력하세요.");
		System.out.print("카운트 다운 입력하세요 : ");
		number = sc.nextInt();//3
	
		//for문 사용
		for(i = number; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println(" for문 사용 발사");
		
		//while문 사용
		i = 0;
		while(i <= number) {
			System.out.println(number);
			number--;
		}
		System.out.println("while문 사용 발사");
		
		
//		3. 짝수 합 구하기
//		수를 입력 받고 1에서 부터 입력한 수까지의 짝수의 합을 구하여 출력하세요.
//		입력 예시
//
//		수를 입력하세요 : 12
//		출력 예시
//
//		더한 결과 : 42
		
		System.out.println("수를 입력 받고 1에서 부터 입력한 수까지의 짝수의 합을 구하여 출력하세요.");
		System.out.print("수를 입력하세요 : ");
		number = sc.nextInt();

		int sum = 0;
		
		//for문 사용
		for(i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("더한 결과 for문 사용 : " + sum);
		
		
		//while문 사용
		sum = 0;
		i = 1;
		while(i <= number) {
			if(i % 2 ==0 ) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("더한결과 while문 사용 : " + sum);
		
//		4. 구구단
//		구구단 2단을 출력하세요
//		출력 예시
//
//		2 X 1 = 2
//		2 X 2 = 4
//		2 X 3 = 6
//		2 X 4 = 8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
		
		System.out.println("구구단 2단을 출력하세요");
		
		//for문 사용
		for(i = 1; i <= 9; i++ ) {
			System.out.println("for 문 사용 : 2 X " + i + " = " + (2 * i));
		}
		
		//while문 사용
		i = 1;
		while(i <= 9) {
			System.out.println("while문 사용 : 2 X " + i + " = " + (2 * i));
			i++;
		}
		
		
//		5. 반복 입력
//		while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
//		입출력 예시
//
//		입력 : 4
//		출력 : 4
//		입력 : 5
//		출력 : 5
//		입력 : 6
//		출력 : 6
//		입력 : 7
//		출력 : 7
//		입력 : 8
//		출력 : 8
		
		System.out.println("while을 이용하여 5번 동안 수를 입력 받고 출력하세요.");
		
		i = 1;
		while(i <= 5) {
			System.out.print("입력 : " );
			number = sc.nextInt();
			System.out.println("출력 : " + number);
			i++;
		}
		
		
		
	}

}
