package CodingTest;


public class 조건문자열 {

	class Solution {
	    public int solution(String ineq, String eq, int n, int m) {
	        if (ineq.equals(">")) {
	            if (eq.equals("=")) return n >= m ? 1 : 0;
	            if (eq.equals("!")) return n > m ? 1 : 0;
	        } else if (ineq.equals("<")) {
	            if (eq.equals("=")) return n <= m ? 1 : 0;
	            if (eq.equals("!")) return n < m ? 1 : 0;
	        }
	        return 0;
	    }
	}
//	class Solution {
//	    public int solution(String ineq, String eq, int n, int m) {
//	        int answer = 0;
//	        if(n >= m){
//	            if(ineq.equals(">") && eq.equals("=")) {
//	            	return 1;
//	            }
//	        }
//	        
//	        if(n > m) {
//	        	if(ineq.equals(">") && eq.equals("!")) {
//	        		return 1;
//	        	}
//	        }
//	        
//	        if(n <= m) {
//	        	if(ineq.equals("<") && eq.equals("=")) {
//	        		return 1;
//	        	}
//	        }
//	        
//	        if(n < m) {
//	        	if(ineq.equals("<") && eq.equals("!")) {
//	        		return 1;
//	        	}
//	        }
//	        
//	        return answer;
//	    }
//	}
	
	
}
