package test;

public class 글자이어붙여문자열만들기 {

//	문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
//	my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 
//	return 하는 solution 함수를 작성해 주세요.
	
	class Solution {
	    public String solution(String my_string, int[] index_list) {
	        String answer = "";
	        
        	for(int j = 0; j < index_list.length; j++) {
        		answer += my_string.charAt(index_list[j]);
        		break;
        	}
	        return answer;
	    }
	}
	
}
