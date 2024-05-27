package CodingTest;

public class 이어붙인수 {
//	정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
	
	class Solution {
		public int solution(int[] num_list) {
	        StringBuilder oddConcat = new StringBuilder(); // 홀수를 이어붙일 StringBuilder
	        StringBuilder evenConcat = new StringBuilder(); // 짝수를 이어붙일 StringBuilder

	        // 주어진 리스트를 순회하면서 홀수와 짝수를 구분하여 이어붙임
	        for (int num : num_list) {
	            if (num % 2 == 0) { // 짝수인 경우
	                evenConcat.append(num);
	            } else { // 홀수인 경우
	                oddConcat.append(num);
	            }
	        }
          // 이어붙인 홀수와 짝수를 정수로 변환하여 합을 계산하여 반환
         int oddSum = Integer.parseInt(oddConcat.toString());
         int evenSum = Integer.parseInt(evenConcat.toString());
         return oddSum + evenSum;
         }
	}   
	
}
