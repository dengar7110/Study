package test;

public class 개미군단 {
	
	class Solution {
	    public int solution(int hp) {
	        int answer = 0;
	        
	        // 장군개미의 공격력은 5, 병정개미의 공격력은 3
	        // 따라서, 장군개미로 사냥을 할 수 있는 최대 마리 수를 구하고,
	        // 남은 체력을 병정개미로 사냥할 수 있는 최대 마리 수로 나눠줍니다.
	        answer += hp / 5;
	        hp %= 5;
	        answer += hp / 3;
	        
	        // 남은 체력이 3으로 나누어 떨어지지 않을 경우, 일개미로 처리합니다.
	        hp %= 3;
	        answer += hp;
	        
	        return answer;
		    }
	}
}
