package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
//		1. 문자열 검색
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇 개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		출력 예시
//
//		jpg 파일 개수 : 3
		
		int count = 0;

		for(int i = 0; i < files.length; i++) {
			if(files[i].contains(".jpg")) {
				count++;
			}

		}
		
		System.out.println("jpg 파일 개수 : " + count);
		
		//contains 말고
		count = 0;
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")) {
				count++;
			}

		}
		
		
//		2. 영 단어 퀴즈
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇 점인지 출력한다.
//		1. 승리를 영어로 입력하세요 :
//		2. 사랑을 영어로 입력 하세요 :
//		3. 컴퓨터를 영어로 입력 하세요 :
//		4. 노트북을 영어로 입력하세요 :
//		입력 예시
//
//		1. 승리를 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
//		출력 예시
//
//		점수는 75점 입니다.
		int score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 승리를 영어로 입력하세요 :");
		String answer = sc.next();
		if(answer.equals("victory")) {
			score = score + 25;
		}
		System.out.print("2. 사랑을 영어로 입력 하세요 : ");
		String answer2 = sc.next();
		if(answer2.equals("lobe")) {
			score = score + 25;
		}
		System.out.print("3. 컴퓨터를 영어로 입력 하세요 :");
		String answer3 = sc.next();
		if(answer3.equals("computer")) {
			score = score + 25;
		}
		System.out.print("4. 노트북을 영어로 입력하세요 :");
		String answer4 = sc.next();
		if(answer4.equals("notebook")) {
			score = score + 25;
		}
		System.out.print("점수는 " + score + "점 입니다");
		
		
//		3. 문자열 검색
//		회원 명부가 아래와 같이 문자열이 저장 되어 있다. 같은 이름이 몇 개 인지 출력하세요.
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호:송강호:송강호:송강호";
//		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호";
//		출력 예시
//		
//		동명 수 : 3

		System.out.println("회원 명부가 아래와 같이 문자열이 저장 되어 있다. 같은 이름이 몇 개 인지 출력하세요.");
		
		String colon = ":";
		String [] members = membersString.split(colon);
		
		count = 0;

		for(int i = 0; i < members.length; i++) {
			
			boolean isSame = false;
			if(members[i].equals("0")) {
				continue;
			}
			
			for(int j = i + 1; j < members.length; j++) {
					
				if(members[i].equals(members[j])) {
					members[j] = "0";
					isSame = true;
				}
	
			}
			
			if(isSame) {
				count++;
			}
			
		}
		
		System.out.print("동명 수 : " + count);
		
		//
		
		
		
	}

}
