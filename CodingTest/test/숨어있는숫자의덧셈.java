package test;

public class 숨어있는숫자의덧셈 {

//	문자열 my_string이 매개변수로 주어집니다. 
//	my_string안의 모든 자연수들의 합을 
//	return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public int solution(String my_string) {
	        int answer = 0;
	        String numbers = "123456789";
	        for(int i = 0; i < my_string.length(); i++) {
	        	int number = my_string.charAt(i);
	        	for(int j = 0; j < numbers.length(); j++) {
	        		if(number == numbers.charAt(j)) {
	        			answer += Character.getNumericValue(numbers.charAt(j));
	        			break;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}
	
}
