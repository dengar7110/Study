package ex;

import java.util.HashMap;
import java.util.Map;

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
		
	}
	

}
