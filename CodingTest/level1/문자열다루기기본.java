package level1;

public class 문자열다루기기본 {

//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
//	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

	class Solution {
	    public boolean solution(String s) {
	        // 길이가 4 또는 6이 아니면 false를 반환
	        if (s.length() != 4 && s.length() != 6)
	            return false;
	
	        // 문자열 s에서 숫자를 모두 제거하여 숫자 이외의 문자만 남기기
	        s = s.replaceAll("[0-9]", "");
	
	        // 남은 문자열의 길이가 0보다 크면 (즉, 숫자 이외의 문자가 있으면) false를 반환
	        // 그렇지 않으면 (숫자로만 구성되어 있으면) true를 반환
	        return (s.length() > 0) ? false : true;
	    }
	}
	
}
