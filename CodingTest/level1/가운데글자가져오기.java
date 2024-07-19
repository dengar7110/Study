package level1;

public class 가운데글자가져오기 {

//	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	class Solution {
	    public String solution(String s) {
	    	
	    	String answer = "";
	    	
	    	if(s.length() % 2 != 0) {
	            int idx = (s.length() / 2);
	            String sChar1 = String.valueOf(s.charAt(idx));
	            answer = sChar1;
	    	}else {
	    		int idx1 = (s.length() / 2) - 1;
	    		int idx2 = s.length() / 2;	    	
	    		String sChar1 = String.valueOf(s.charAt(idx1));
	    		String sChar2 = String.valueOf(s.charAt(idx2));
	    		answer = sChar1 + sChar2;
	    	}
	    	
	        return answer;
	    }
	}
	
}
