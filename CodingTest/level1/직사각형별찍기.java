package level1;

import java.util.Scanner;
public class 직사각형별찍기 {

//	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//	별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
	
	class Solution {
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for(int j = 0; j < b; j++) {
	        	for(int i = 0; i < a; i++) {
	        		System.out.print("*");
	        	}
	        	System.out.println("");
	        }

	    }
	}
	
}
