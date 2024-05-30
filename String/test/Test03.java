package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		1. 문자열 변환
//		아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
		String gradeString = "My grade is A";
//		출력 예시
//
//		My grade is B
		
		gradeString = gradeString.replace("A", "B");
		System.out.println(gradeString);
		
		
//		2. 문자열 자르기
//		아래와 같이 전화번호가 저장되어 있을 때 출력예시와 같은 형태로 -를 포함하여 출력하세요.
		String phoneNumber = "01012345678";
//		출력 예시
//
//		010-1234-5678
		
		String a = phoneNumber.substring(0, 3);
		String b = phoneNumber.substring(3, 7);
		String c = phoneNumber.substring(7);
		char typhoon = '-';
		System.out.println(a + typhoon + b + typhoon + c);
		
//		3. 문자열 정수 변환
//		아래와 같이 생년월일이 저장된 String 이 있을 때 올해 나이를 출력 하세요 (한국 나이)
		String birthString = "19950721";
//		출력 예시
//
//		1995년생의 나이는 29살
		
		String birthYear = birthString.substring(0, 4);
		int birthYear2 = Integer.parseInt(birthYear);
		
		System.out.println(birthYear + "년생의 나이는 " + (2024 - birthYear2) +  "살");
		
//		4. 문자열 검색
//		영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
//		입력 예시
//
//		단어를 입력하세요 : elephant
//		출력 예시
//
//		e의 개수는 2개 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 :");
		String input = sc.next();
		
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e의 개수는 " + count + "개 입니다");
		
//		5. 단어 수 세기
//		아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		String sentence = "To be, or Not to Be. That Is The Question";
//		출력 예시
//
//		단어 개수 : 10
		
		
		System.out.println("아래 문자열의 단어 개수를 출력 하세요.(중복 포함)");
		
		String str[] = sentence.split(" ");
		
		count = 0;
		for(int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println("단어 개수 : " + count);
		
		
		//반복문없이
		
		int words = str.length;
		System.out.println("반복문없이 : " + words);
		
	}
	

}
