package test;

import java.util.ArrayList;
import java.util.List;

public class 조건에맞게수열변환하기3 {

//	정수 배열 arr와 자연수 k가 주어집니다.
//
//	만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
//
//	이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.

	class Solution {
	    public int[] solution(int[] arr, int k) {
	    	
	    	List<Integer> arrList = new ArrayList<>();
	    	
	    	for(int i = 0; i < arr.length; i++) {
	    		if(k % 2 == 0) {
	    			arrList.add(arr[i] + k);
	    		}else if(k % 2 != 0) {
	    			arrList.add(arr[i] * k);
	    		}
	    	}
	    	
	        int[] answer = new int[arrList.size()];
	        
	        for(int i = 0; i < arrList.size(); i++) {
	        	answer[i] = arrList.get(i);
	        }
	        return answer;
	    }
	}
	
}
