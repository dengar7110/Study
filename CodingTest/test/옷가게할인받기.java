package test;

public class 옷가게할인받기 {

	class Solution {
	    public int solution(int price) {
	        int answer = 0;
	        if(price >= 100000 && price < 300000) {
	        	answer = (price / 100) * 95; 
	        }else if(price >= 300000 && price < 500000) {
	        	answer = (price / 100) * 90; 
	        }else if(price >= 500000) {
	        	answer = (price / 100) * 80; 
	        }
	        
	        
	        return answer;
	    }
	}
}
