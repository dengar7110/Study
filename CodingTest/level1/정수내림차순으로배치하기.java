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
	            
	            String strN = String.valueOf(n);
	            List<Integer> numList = new ArrayList<>();
	            
	            // 각 자릿수를 리스트에 저장
	            for (int i = 0; i < strN.length(); i++) {
	                int number = Character.getNumericValue(strN.charAt(i));
	                numList.add(number); 
	            }
	            
	            // 리스트를 큰 순서대로 정렬
	            Collections.sort(numList, Collections.reverseOrder());
	            
	            // 정렬된 숫자들을 문자열로 조합
	            StringBuilder strAnswer = new StringBuilder();
	            for (int num : numList) {
	                strAnswer.append(num);
	            }
	            
	            // 문자열로 된 숫자를 long으로 변환하여 반환
	            return Long.parseLong(strAnswer.toString());
	    }

	}
}
