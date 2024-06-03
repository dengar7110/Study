package test;

public class 마지막두원소 {

	class Solution {
	    public int[] solution(int[] num_list) {
	    	int[] answer = new int[num_list.length + 1];     

		    int last = num_list[num_list.length];
		    int secondLast = num_list[num_list.length - 1];
		    
	    	
		    for(int i = 0; i < num_list.length; i++) {
		        answer[i] = num_list[i];
		    }
	        


	        if(last > secondLast) {
	        	answer[answer.length - 1] = last - secondLast;
	        }else {
	        	answer[answer.length - 1] = last * 2;
	        }
		       
		    return answer;
	    }
	}
	
}
