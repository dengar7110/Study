package test;

public class 영떼기 {



	class Solution {
	    public String solution(String n_str) {
	        
	    	String answer = "";
	    	int index = 0;
	        for(int i = 0; i < n_str.length(); i++){
	        	if(n_str.charAt(i) != '0') {
	        		index = i; 
	        		break;
	        	}
	        }

	        for(int j = index; j < n_str.length(); j++) {
	        	answer += n_str.charAt(j);
	        }
	        
	        return answer;
	    }
	}
}
