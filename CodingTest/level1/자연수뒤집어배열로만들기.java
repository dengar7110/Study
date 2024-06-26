package level1;

import java.util.ArrayList;
import java.util.List;

public class 자연수뒤집어배열로만들기 {

//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	
	class Solution {
	    public int[] solution(long n) {
	    	String stringNumber = String.valueOf(n);
	    	List<Integer> numberList = new ArrayList<>();
	    	
	    	for(int i = 0 ; i < stringNumber.length(); i++) {
	    		int number =  Character.getNumericValue(stringNumber.charAt(i)); 
	    		numberList.add(number);
	    	}
	    	
	        int[] answer = new int[numberList.size()];
	        
	        for(int i = 0; i < numberList.size(); i++) {
	        	answer[i] = numberList.get((numberList.size() - 1) - i);
	        }

	        return answer;
	    }
	}
	
}
