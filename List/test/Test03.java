package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		1. id 중복 체크
//		아래와 같이 회원 가입된 id 목록이 주어진다.
//		["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		id 를 입력 받고, id 가 중복 될경우 "중복입니다", 중복이 되지 않을 경우 "사용가능" 을 출력 하세요.
//		입력 예시
//
//		id : hagulu
//		출력 예시
//
//		중복 입니다.
		
		List<String> idList = new ArrayList<>();
		idList.add("hagulu");
		idList.add("happy");
		idList.add("google");
		idList.add("bts");
		idList.add("iu");
		idList.add("cuteboy");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(idList.contains(input)) {
			System.out.println("중복 입니다");
		}else {
			System.out.println("중복이 아닙니다");
		}
		
		
//		2. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
//
//		[8, 7, 6, 10, 9, 4]
//		출력 예시
//
//		최고점과 최저점을 제외한 평균 점수는 7.5
		
		List<Integer> score = new ArrayList<>();
		
		score.add(8);
		score.add(7);
		score.add(6);
		score.add(10);
		score.add(9);
		score.add(4);

		System.out.println(score);
		
		int min = score.get(0);
		for(int i = 0; i < score.size(); i++) {
			if(min > score.get(i)) {
				min = score.get(i);
			}
		}
		
		int max = 0;
		for(int i = 0; i < score.size(); i++) {
			if(max < score.get(i)) {
				max = score.get(i);
			}
		}
		
		int sum = 0;
		for(int i = 0; i < score.size(); i++) {
			sum += score.get(i);
		}
		
		System.out.println(sum);
		System.out.println(min);
		System.out.println(max);
		
		double average = (sum - min - max) / (double) (score.size() - 2);
		System.out.println(average);
//		3. 로또 번호
//		Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
//		저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
//		출력 예시
//
//		[3, 6, 19, 26, 37, 44]
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 6; i++) {
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
			
			for(int j = 0; j < i; j++) {
				if(lotto.get(i).equals(lotto.get(j))) {
					lotto.remove(i);
					i--;	
					break;
				}
			}	
		}
		
		System.out.println("처음뽑은 6개의 수 " + lotto);
			
		//정렬
		for(int i = 0; i < lotto.size() - 1; i++) {
			
			for(int j = 0; j < lotto.size() - 1 - i ; j++) {
				if(lotto.get(j) < lotto.get(j + 1)) {
					int temp = lotto.get(j);
					lotto.set(j, lotto.get(j + 1));
					lotto.set(j + 1, temp);
				}
			}
			
		}
		
		System.out.println(lotto);
		
		
//		4. 회원 추가하기
//		회원관리 리스트를 만든다.
//
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//
//		프랑키
//		루피
//		쵸파
//		로빈
//		루피
//		출력 예시
//
//		[우솝, 루피, 상디, 나미, 로빈, 프랑키, 루피1, 쵸파, 로빈1, 루피2]
	}

}
