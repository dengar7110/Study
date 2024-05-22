package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
//		1. 반복 출력
//		35 ~ 40 까지 출력 하세요
//		출력 예시
//
//		35 36 37 38 39 40 
		
		System.out.println("35~ 40 까지 출력 하세요");
		for(int i = 35; i <= 40; i++) {
			System.out.print(i +" ");
		}
		
		
		
//		2. 반복 출력
//		5 ~ -5 까지 출력하세요
//		출력 예시
//
//		5 4 3 2 1 0 -1 -2 -3 -4 -5 
		
		System.out.println("\n"  + "5 ~ -5 까지 출력하세요");
		for(int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		
		
//		3. 특정 조건 구하기
//		1 ~ 50 사이에 3의 배수만 출력하세요.
//		출력 예시
//
//		3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 
		System.out.println("\n"  + "1 ~ 50 사이에 3의 배수만 출력하세요.");
		for(int i = 1; i <= 50; i++ ) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
//		4. 갯수 세기
//		1 ~ 100 사이에 7의 배수 개수를 구하세요.
//		출력 예시
//
//		7의 배수의 개수는 : 14
		
		System.out.println("1 ~ 100 사이에 7의 배수 개수를 구하세요.");
		int count = 0;
		for(int i = 1; i<= 100; i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		
		System.out.println("7의 배수의 개수는 : " + count);
		
		
//		5. 구구단
//		수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.
//		입력 예시
//
//		단수를 입력하세요 : 8
//		출력 예시
//
//		8 X 1 = 8
//		8 X 2 = 16
//		8 X 3 = 24
//		8 X 4 = 32
//		8 X 5 = 40
//		8 X 6 = 48
//		8 X 7 = 56
//		8 X 8 = 64
//		8 X 9 = 72
		
		
		System.out.println("수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.");
		System.out.print("단수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
				
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		
//		6. 가장 큰 수
//		for를 이용해서 5개의 수를 입력 받고 제일 큰수를 출력하세요
//		입력 예시
//
//		수를 입력하세요 : 5
//		수를 입력하세요 : 78
//		수를 입력하세요 : 3
//		수를 입력하세요 : 7
//		수를 입력하세요 : 3
//		출력 예시
//
//		가장 큰 수 : 78
		
		System.out.println("for를 이용해서 5개의 수를 입력 받고 제일 큰수를 출력하세요");
		System.out.print("수를 입력하세요 : ");
	
		
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("수를 입력하세요 : " );
			int number = sc.nextInt();
				if(number >= max) {
					max = number;
				}
			
		}
		System.out.println("가장 큰 수 : " + max);
		
	}

}
