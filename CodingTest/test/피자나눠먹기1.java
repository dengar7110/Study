package test;

public class 피자나눠먹기1 {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        if(n <= 7) {
	            return 1;
	        } else {
	            answer = n / 7;
	            if(n % 7 != 0) {
	                answer++;
	            }
	            return answer;
	        }
	    }
	}
	
}
