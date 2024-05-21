package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		1. 음수 양수 판별
//		정수를 입력 받고 음수인지 양수인지 출력하세요.
//		입력 예시
//
//		정수를 입력 하세요 : -5
//		출력 예시
//
//		음수 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력 받고 음수인지 양수인지 출력하세요.");
		System.out.print("정수를 입력 하세요 : ");
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("양수");
		}else if(number < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		
		
//		2. 학점 출력
//		점수를 입력 받고 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F 를 출력하세요
//		입력 예시
//
//		점수를 입력 하세요 : 86
//		출력 예시
//
//		B
		
		System.out.println("점수를 입력 받고 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F 를 출력하세요");
		System.out.print("점수를 입력 하세요");

		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
