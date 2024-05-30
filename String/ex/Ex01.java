package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 문자열 변수 선언 및 초기화
		String text1 = "Hello World";
		
		System.out.println(text1);
		
		// 문자열 연산
		int number = 10;
		
		System.out.println("Hello" + number);
		System.out.println(text1 + " " + number);
		
		String text2 = "!!!";
		
		String newText = text1 + text2;		
		System.out.println(newText);
		
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		// hello world
		String input1 = sc.next();
		String input2 = sc.next();
		
		System.out.println(input1 + input2);
		
		sc.nextLine();
		
		System.out.print("문자열을 입력하세요 : ");
		String lineInput = sc.nextLine();
		System.out.println(lineInput);
		
		// 문자열 배열
		String[] texts = {"apple", "bear", "car"};
		
		for(int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
		
		
		
		
	}

}
