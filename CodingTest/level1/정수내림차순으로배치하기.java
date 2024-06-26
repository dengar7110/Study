package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수내림차순으로배치하기 {

//	함수 solution은 정수 n을 매개변수로 입력받습니다. 
//	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//	예를들어 n이 118372면 873211을 리턴하면 됩니다.

	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        String stringN = String.valueOf(n);
	        
	        List<Integer> numList = new ArrayList<>();
	        
	        
	        for(int i = 0; i < stringN.length(); i++) {
	        	int number =  Character.getNumericValue(stringN.charAt(i));
	        	numList.add(number); 
	        }
	        Collections.sort(numList);
	        
	        String aa = "" ;
	        for(int i = 0; i < numList.size(); i++) {
	        	aa +=  numList.get((numList.size() - 1) - i);
	        }
	        
	        answer = Integer.parseInt(aa);
	        
	        return answer;
	    }
	}
	
}
