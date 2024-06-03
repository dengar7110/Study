package test;

public class 이어붙인수 {

	class Solution {
	    public int solution(int[] num_list) {
	        String evensum = "";
	        String oddsum = "";
	       
	    	for(int i = 0; i < num_list.length; i++) {
	    		if(num_list[i] % 2 == 0) {
	    			evensum += num_list[i];
	    		}else {
	    			oddsum += num_list[i];
	    		}
	    		
	    	}
	    	
	    	int answer = Integer.parseInt(evensum) + Integer.parseInt(oddsum);
	        return answer;
	    }
	}
	
}

