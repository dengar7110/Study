package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {

    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

	public static void main(String[] args) {
//		1. 이씨 찾기
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾸고 전체 Map을 출력 하세요.
//
//		반복문을 이용해서 바꾸세요.
//		출력 예시
//
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}
		
		Map<String,Character> name = new HashMap<>();
		name.put("유재석", 'X');
		name.put("박나래", 'X');
		name.put("이지은", 'X');
		name.put("서장훈", 'X');
		name.put("이광수", 'X');
		
		for(String key : name.keySet()) {
			if(key.startsWith("이")) {
				name.put(key, 'O');
			}
		}
		
		System.out.println(name);
		
//		2. 수도 맞추기 게임
//		랜덤으로 뽑힌 나라의 수도 이름을 맞추는 게임
//		나라-수도가 들어있는 20개의 쌍이 Map으로 주어진다.
//		이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력 받는다.
//		정답인지 아닌지 수도를 입력한 즉시 출력한다.
//		모두 풀고 나면 점수(100점 만점)가 출력된다.
//
//		아래 코드를 이용해서 문제를 푸세요.
//		public class Test02 {
//	    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
//	        {
//	            put("대한민국", "서울");
//	            put("덴마크", "코펜하겐");
//	            put("독일", "베를린");
//	            put("러시아", "모스크바");
//	            put("벨기에", "브뤼셀");
//	            put("브라질", "브라질리아");
//	            put("스웨덴", "스톡홀름");
//	            put("스위스", "베른");
//	            put("스페인", "마드리드");
//	            put("아르헨티나", "부에노스아이레스");
//	            put("이집트", "카이로");
//	            put("이란", "테헤란");
//	            put("이탈리아", "로마");
//	            put("일본", "도쿄");
//	            put("필리핀", "마닐라");
//	            put("핀란드", "헬싱키");
//	            put("프랑스", "파리");
//	            put("터키", "앙카라");
//	            put("캐나다", "오타와");
//	            put("콜롬비아", "보고타");
//	        }
//	    };

//
//		    public static void main(String[] args) {
//		        Scanner scan = new Scanner(System.in);
//		        Random rand = new Random();
//
//		        Set<String> keys = capitalMap.keySet();
//		        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
//		        // TODO: 구현하기
//		    }
//		}
//		출력 예시
//
//		터키의 수도 이름은? 앙카라
//		정답
//		이란의 수도 이름은? 테헤란
//		정답
//		스위스의 수도 이름은? 몰라
//		틀렸습니다.
//		이집트의 수도 이름은? ..
//		틀렸습니다.
//		독일의 수도 이름은? 베를린
//		정답
//		총 점수는 60
		
			Scanner scan = new Scanner(System.in);
	        Random rand = new Random();

	        Set<String> keys = capitalMap.keySet();
	        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
	        
	        int score = 0;
	        
	        int [] number = new int[5];
	        
	        for(int i = 0; i < 5; i++) {
	        	
		        int randomNumber = rand.nextInt(keyList.size());
		        
		        number[i] = randomNumber;
		        
		        // 중복제거
//		        for(int j = 0; j < i; j++) {
//		        	
//		        	if(number[i] == number[j]) {
//		        		i--;
//		        		break;
//		        	}
//		        }
		        
		        String country = keyList.get(randomNumber);
	        
	        	System.out.println(country + "의 수도 이름은?");
		        String input = scan.nextLine();

		        String capital = capitalMap.get(country);
		        
	        	if(input.equals(capitalMap.get(capital))) {
	        		System.out.println("정답입니다!");
	        		score += 20;
	        	}else {
	        		System.out.println("틀렸습니다");
	        	}
	        	
	        	// 중복 제거
	        	keyList.remove(randomNumber);
	        	
	        }
	        
	        System.out.println("총 점수는 " + score + "점");
	        	
	        	
	        
	}
	
}

