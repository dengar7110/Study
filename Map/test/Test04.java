package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test04 {
	
	public static void main(String[] args) {
	        Map<String, String> myCharacter = new HashMap<>();
	        myCharacter.put("닉네임", "마로비아나");
	        myCharacter.put("직업", "마법사");
	        myCharacter.put("서버", "B");
	        myCharacter.put("레벨", "38");

	        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
	        List<Map<String, String>> characterList = new ArrayList<>();
	        
	        Map<String, String> character1 = new HashMap<>();
	        character1.put("닉네임", "사자고양이");
	        character1.put("직업", "전사");
	        character1.put("서버", "A");
	        character1.put("레벨", "11");
	        characterList.add(character1);

	        Map<String, String> character2 = new HashMap<>();
	        character2.put("닉네임", "하구루");
	        character2.put("직업", "마법사");
	        character2.put("서버", "B");
	        character2.put("레벨", "46");
	        characterList.add(character2);

	        Map<String, String> character3 = new HashMap<>();
	        character3.put("닉네임", "바다");
	        character3.put("직업", "힐러");
	        character3.put("서버", "B");
	        character3.put("레벨", "23");
	        characterList.add(character3);

	        Map<String, String> character4 = new HashMap<>();
	        character4.put("닉네임", "초보");
	        character4.put("직업", "힐러");
	        character4.put("서버", "A");
	        character4.put("레벨", "4");
	        characterList.add(character4);

	        Map<String, String> character5 = new HashMap<>();
	        character5.put("닉네임", "남라");
	        character5.put("직업", "힐러");
	        character5.put("서버", "B");
	        character5.put("레벨", "84");
	        characterList.add(character5);

//	        필요한 파티원의 정보를 출력하세요.
//
//	        n명의 게임 캐릭터 정보가 주어진다.
//	        필요한 파티원 조건:
//
//	        myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다.
//
//	        보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
	        
//	        출력 예시
//
//	        힐러 탐색 결과
//	        닉네임 : 남라
//	        직업 : 힐러
//	        서버 : B
//	        레벨 : 84
	     
	        int	maxLevel = 0;
	        Map<String, String> maxCharacter = null;
	        
	        for(Map<String, String> character : characterList) {
	        	// 서버가 나와 같은 캐릭터 이고 직업이 힐러인 캐릭터
	        	String myServer = myCharacter.get("서버");
	        	
	        	String server = character.get("서버");
	        	String job = character.get("직업");
	        	if(server.equals(myServer) && job.equals("힐러")) {
	        		
	        		String levelString = character.get("레벨");
	        		int level = Integer.parseInt(levelString);
	        		if(level > maxLevel) {
	        			maxLevel = level;
	        			maxCharacter = character;
	        		}
	        		
//	      			System.out.println("닉네임 : " + character.get("닉네임"));
//        			System.out.println("직업 : " + character.get("직업"));
//        			System.out.println("서버 : " + character.get("서버"));
//        			System.out.println("레벨 : " + character.get("레벨"));
	        	}
	        }
	        
	        System.out.println(maxLevel);
	        System.out.println(maxCharacter);
	        
	        
	        
	        System.out.println("힐러 탐색 결과");
	        
	        for(int i = 0; i < characterList.size(); i++) {
	        	String server = myCharacter.get("서버");
	        	Map target = characterList.get(i);
	        	if(server.equals(target.get("서버"))) {
	        		if(target.get("직업").equals("힐러")) {
	        			System.out.println("닉네임 : " + target.get("닉네임"));
	        			System.out.println("직업 : " + target.get("직업"));
	        			System.out.println("서버 : " + target.get("서버"));
	        			System.out.println("레벨 : " + target.get("레벨"));
	        			System.out.println();
	        		}
	        	}
	        	
	        }
	        
//	        보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
	        int max = 0;
	        
	        for(int i = 0; i < characterList.size(); i++ ) {
	        	String server = myCharacter.get("서버");	        
	        	Map target = characterList.get(i);
	        
	        	if(server.equals(target.get("서버"))) {
	        		
	        		String level = (String)target.get("레벨");
	        		int intLevel = Integer.parseInt(level);
	        		
	        		if(max < intLevel) {
	        			max = intLevel;	
	        		}
	        		
	        	}
	   
	        }
	        String strMax = String.valueOf(max);
	        
	        for(int i = 0; i < characterList.size(); i++) {
	        	if(characterList.get(i).get("레벨").equals(strMax)) {
	        		System.out.println(characterList.get(i));
	        	}
	        }
	        
	        System.out.println(max);
	        
	        
	        
	    }
	
}
