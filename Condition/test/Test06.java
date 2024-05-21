package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
//		1. 과락 포함 합격 여부
//		점수 두 개를 입력 받고 합격 여부를 출력 하라
//		평균이 60점 이상이면 "합격"
//		한 과목이라도 50점 이하면 무조건 "과락"
//		평균이 60점 미만이면 "불합격"
//
//		입력 예시
//
//		점수1 : 95
//		점수2 : 48
//		출력 예시
//
//		과락
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 두 개를 입력 받고 합격 여부를 출력 하라");
		System.out.print("점수1: ");
		int score1 = sc.nextInt();
		System.out.print("점수2: ");
		int score2 = sc.nextInt();
		
		int total = score1 + score2;
		double average = total / 2.0;
		
		if(average >= 60 && (score1 <= 50 || score2 <=50)) {
			System.out.println("과락");
		}else if(average < 60) {
			System.out.println("불합격");
		}else{
			System.out.println("합격");
		}
		
			
		
		
//		2. 윤년 구하기
//		연도를 입력 받아서 윤년인지 출력하시오
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 윤년이다.
//		입력 예시
//
//		연도 : 2020
//		출력 예시
//
//		윤년
		
		System.out.println("연도를 입력 받아서 윤년인지 출력하시오");
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			System.out.println("윤년");
		}
		
		
//		3. 가위 바위 보 게임
//		철수와 영희가 가위(1), 바위(2), 보(3) 게임을 진행할때, 게임에서 이긴 사람을 출력하세요
//		영희의 가위바위보를 숫자로 먼저 입력 받고 그다음에 철수의 가위바위보를 숫자로 입력 받는다.
//		입력 예시
//
//		영희 공격 : 2
//		철수 공격 : 3
//		출력 예시
//
//		철수가 이겼다
		
		System.out.println("철수와 영희가 가위(1), 바위(2), 보(3) 게임을 진행할때, 게임에서 이긴 사람을 출력하세요");
		System.out.print("영희 공격 : ");
		int younghee = sc.nextInt();
		System.out.print("철수 공격 : ");
		int chulsu = sc.nextInt();
		
		if(younghee == chulsu) {
			System.out.println("비겼다");
		}else if((younghee == 1 && chulsu == 3) || (younghee == 2 && chulsu == 1) || younghee == 3 && chulsu == 2) {
			System.out.println("영희가 이겼다");
		}else {
			System.out.println("철수가 이겼다");
		}
		
//		4. 45분전
//		시간(hour)과 분(min)이 주어질 때, 해당 시간보다 45분전의 시간을 계산하여 출력하세요
//		시간은 24시간 표현방법을 사용한다
//
//		입력 예시
//
//		시간 분 입력 : 4 30
		
//		출력 예시
//
//		3시 45분
		
		System.out.println("시간(hour)과 분(min)이 주어질 때, 해당 시간보다 45분전의 시간을 계산하여 출력하세요.");
		System.out.print("시간 분 입력 : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		//30
		if(minute < 45) {
			minute = 60 - (45 - minute); 
			hour = hour - 1;
		}else {
			minute = 45 - minute;
		}
		System.out.println(hour + "시" + minute + "분");
		
//		5. 윷놀이
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
//		윷놀이는 4개의 윷을 이용하는 게임이다.
//
//		도 : 1개가 뒤집어진 상태
//		개 : 2개가 뒤집어진 상태
//		걸 : 3개가 뒤집어진 상태
//		윷 : 4개가 뒤집어진 상태
//		모 : 하나도 뒤집어지지 않은 상태
//
//		입력 예시
//
//		윷 상태를 입력하세요 : 0 1 1 1
//		출력 예시
//
//		걸
		
		System.out.println("개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.");
		System.out.print("윷 상태를 입력하세요 : ");
		int mode1 = sc.nextInt();
		int mode2 = sc.nextInt();
		int mode3 = sc.nextInt();
		int mode4 = sc.nextInt();
		
		int status = mode1 + mode2 + mode3 + mode4;
		
		if(status == 1) {
			System.out.println("도");
		}else if(status == 2) {
			System.out.println("개");
		}else if(status == 3) {
			System.out.println("걸");
		}else if(status == 4) {
			System.out.println("윷");
		}else if(status == 0) {
			System.out.println("모");
		}else {
			System.out.println("윷의 상태를 확인해주세요");
		}
		
		
	}

}
