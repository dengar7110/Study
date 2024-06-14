package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 맵 (Map)
		// 회원의 이름 목록
		// hagulu  yu  bada  ohndar
		// 홍정원, 유재석, 바다, 홍정원
		
		Map<String,String> memberMap = new HashMap<>();
		
		memberMap.put("hagulu","홍정원");
		memberMap.put("yu","유재석");
		memberMap.put("bada","바다");
		memberMap.put("ohndar","홍정원");
		
		System.out.println(memberMap);
		
		// 값 가져오기
		String name = memberMap.get("yu");
		System.out.println(name);
		
		// 값 수정
		// 바다 -> 김바다
		memberMap.put("bada", "김바다");
		System.out.println(memberMap);
		
		// 특정키가 존재하는지 확인
		
		// get() 대응되는 key가 없을 경우 null 을 리턴
		String result = memberMap.get("dulumary");
		System.out.println(result);
//		result.length();
		
		String tmp = null;

		// 특정키가 존재하는지 확인
		if(memberMap.containsKey("yu")) {
			System.out.println(memberMap.get("yu"));
		}

		// 맵 반복문
		// 자주 사용되지 않음
		
		// 키의 목록을 얻어 온다.
		// 키들의 목록을 반복문으로 키를 하나씩 얻어 온다.
		// 키를 통해 값을 얻어온다.
		
		// 키 목록 얻어오기
		Set<String> KeySet = memberMap.keySet();
		
		for(String id : KeySet) {
			
			String value = memberMap.get(id);
			System.out.println(value);
			
		}
		
		
		
		
	}
	

}
