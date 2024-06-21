package test;

public class 주사위게임1 {

//	부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 
//	얻는 점수는 다음과 같습니다.
//
//	a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
//	a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
//	a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
//	두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;
	        
	        if(a % 2 != 0 && b % 2 != 0) {
	        	answer = (a * a) + (b * b);
	        }else if(a % 2 == 0 && b % 2 == 0) {
	        	if(a >= b) {
	        		answer = a - b;
	        	}else if(a < b) {
	        		answer = b - a;
	        	}
	        }else if((a % 2 == 0 && b % 2 !=0 ) || a % 2 != 0 && b % 2 == 0) {
	        	answer = 2 * (a + b);
	        }
	        
	        return answer;
	    }
	}
	
}
