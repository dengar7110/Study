package test;

public class 등차수열의특정한항만더하기 {
	
    public int solution(int a, int d, boolean[] included) {
        
    	
    	int n = included.length;
    	int[] equalSum = new int[n];
    	
    	int sum = 0;
    	for(int i = 0; i < n; i++) {
    		if(included[i]) {
    			sum += equalSum[i] = a + i * d;
    		}
    	}
    	return sum;
    	
    }
}
