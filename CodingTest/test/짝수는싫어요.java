package test;

public class 짝수는싫어요 {
//	정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 
//	담긴 배열을 return하도록 solution 함수를 완성해주세요.

	class Solution {
	    public int[] solution(int n) {
	        // 홀수의 개수를 세기 위한 변수 count
	        int count = (n % 2 == 0) ? n / 2 : n / 2 + 1;
	        // 홀수를 담을 배열 생성
	        int[] answer = new int[count];
	        // 배열의 인덱스
	        int index = 0;
	        
	        // 1부터 n까지의 수 중에서 홀수를 찾아서 배열에 추가
	        for (int i = 1; i <= n; i += 2) {
	        	answer[index++] = i;
	        }
	        
	        return answer;
	    }
	}
}
