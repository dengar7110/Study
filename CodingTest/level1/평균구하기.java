package level1;

public class 평균구하기 {

//	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        
	        int sum = 0;
	        for(int number : arr) {
	        	sum += number;
	        }
	        answer = (double)sum / arr.length; 
	        
	        return answer;
	    }
	}
	
}
