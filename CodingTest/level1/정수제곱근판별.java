package level1;

public class 정수제곱근판별 {

//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
//	n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	
	class Solution {
	    public long solution(long n) {
            // n의 제곱근을 구합니다.
            long sqrtN = (long) Math.sqrt(n);
            
            // sqrtN을 제곱하여 다시 n을 얻을 수 있는지 확인합니다.
            if (sqrtN * sqrtN == n) {
                // n이 sqrtN의 제곱이라면 (sqrtN + 1)의 제곱을 반환합니다.
                return (sqrtN + 1) * (sqrtN + 1);
            } else {
                // n이 어떤 양의 정수의 제곱이 아니라면 -1을 반환합니다.
                return -1;
            }
        }
    }
}
