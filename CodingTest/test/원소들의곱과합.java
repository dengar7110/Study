package test;

public class 원소들의곱과합 {
//	정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

	class Solution {
	    public int solution(int[] num_list) {
	        
	    	int sum = 0;
	    	int sum2 = 1;
	    	
	    	for(int i = 0; i < num_list.length; i++) {
	    		sum += num_list[i];
	    	}
	    	
	    	for(int i = 0; i < num_list.length; i++) {
	    		sum2 *= num_list[i];
	    	}
	    	
	    	if((sum * sum) > sum2) {
	    		return 1;
	    	}
	    	
	        return 0;
	    }
	}
	
}
