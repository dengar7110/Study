package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		1. 문자열 출력
//		문자열 변수를 세개 만들어서 아래 문장의 단어를 하나씩 저장하세요.
//		세 변수를 이용해서 아래 내용처럼 출력하세요.
//		Oh My God
		
		String text1 = "Oh";
		String text2 = "My";
		String text3 = "God";
		System.out.println(text1 + " " + text2 + " " + text3);
		
//		2. 문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! id
//		입력 예시
//
//		ID를 입력 하세요 : hagulu
//		출력 예시
//
//		Welcome! hagulu
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		
		System.out.println("Welcome! " + id);
		
//		3. 문자열 배열
//		아래와 같이 문장을 입력 하고, 이 문장의 단어를 하나씩 문자열 배열에 저장하세요.
//		저장된 단어를 한 줄에 하나씩 출력하세요.
//		입력 예시
//
//		Why so serious
//		출력 예시
//
//		Why 
//		so
//		serious
		
		String[] str = new String[3];
		System.out.println("Why so serious 입력해 주세요");
		String a = sc.nextLine();
		str = a.split(" ");
		
		for(int i = 0; i< str.length; i++) {
			System.out.println(str[i]);			
		}
		
		// 선생님 풀이		
//		System.out.println("Why so serious 입력해 주세요");
//		String word1 = sc.next();
//		String word2 = sc.next();
//		String word3 = sc.next();
//		
//		String[] words = {word1, word2, word3};

		System.out.println("Why so serious 입력해 주세요");
		
		String[] words = new String[3];
		
//		words[0] = sc.next();
//		words[1] = sc.next();
//		words[2] = sc.next();
		
		for(int i = 0; i < words.length; i++) {
			words[i] = sc.next(); 
		}

		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);

		}
		
		
	}

}
