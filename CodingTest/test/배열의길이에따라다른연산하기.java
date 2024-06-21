package test;

import java.util.ArrayList;
import java.util.List;

public class 배열의길이에따라다른연산하기 {

//	정수 배열 arr과 정수 n이 매개변수로 주어집니다. 
//	arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
//	arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 
//	return 하는 solution 함수를 작성해 주세요.
	
	class Solution {
	    public int[] solution(int[] arr, int n) {
	    	List<Integer> arrList = new ArrayList<>();
	        
	        if(arr.length % 2 != 0) {
	        	for(int i = 0; i < arr.length; i++) {
	        		if(i % 2 == 0) {
	        			arrList.add(arr[i] + n);
	        		}else {
	        			arrList.add(arr[i]);
	        		}
	        	}
	        }else{
	        	for(int i = 0; i < arr.length; i++) {
	        		if(i % 2 !=0) {
	        			arrList.add(arr[i] + n);
	        		}else {
	        			arrList.add(arr[i]);
	        		}
	        	}
	        }
	        
	        
	        int[] answer = new int [arrList.size()];
	        
	        for(int i = 0; i < arrList.size(); i++) {
	        	answer[i] = arrList.get(i);
	        }
	        
	        return answer;
	    }
	}
	
}
