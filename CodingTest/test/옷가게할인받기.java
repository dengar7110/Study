package test;

public class 옷가게할인받기 {

	class Solution {
	    public int solution(int price) {
	        int answer = 0;
	        if(price >= 500000) {
	            answer = price * 80 / 100; // 20% 할인
	        } else if(price >= 300000) {
	            answer = price * 90 / 100; // 10% 할인
	        } else if(price >= 100000) {
	            answer = price * 95 / 100; // 5% 할인
	        } else {
	            answer = price; // 할인 없음
	        }
	        
	        
	        return answer;
	    }
	}
}
