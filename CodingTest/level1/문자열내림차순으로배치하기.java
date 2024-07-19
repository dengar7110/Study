package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {

//	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, 
//	solution을 완성해주세요.
//	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.	

	class Solution {
	    public String solution(String s) {
	        String answer = "";

	        List<String> strList = new ArrayList<>();
	        
	        for(int i = 0; i < s.length(); i++) {
	        	String chars = String.valueOf(s.charAt(i));
	        	strList.add(chars); 
	        }
	        
	        Collections.sort(strList, Collections.reverseOrder());
	        
	        for(int i = 0; i < strList.size(); i++ ) {
	        	answer += strList.get(i);
	        }

	        return answer;
	    }
	}
	
}
