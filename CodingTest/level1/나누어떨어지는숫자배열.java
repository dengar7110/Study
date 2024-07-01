package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

//	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 
//	정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        
	    	List<Integer> arrayList = new ArrayList<>();
	    	
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] % divisor == 0) {
	        		arrayList.add(arr[i]); 
	        	}
	        }
	        
	        if(arrayList.size() == 0) {
	        	int [] answer = {-1};
	        	return  answer;
	        }
	        
	        Collections.sort(arrayList);
	        int[] answer = new int[arrayList.size()];
	        for(int i = 0; i < arrayList.size(); i++) {
	        	answer[i] = arrayList.get(i);
	        }
	        
	        return answer;
	    }
	}
	
}
