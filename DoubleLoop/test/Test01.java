package test;

public class Test01 {

	public static void main(String[] args) {
//		1. 주사위 문제
//		두개의 주사위를 굴렸을때, 나올 수 있는 모든 경우의 수를 출력 하세요.
//		출력 예시
//
//		(1, 1) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6)  
//		(2, 1) (2, 2) (2, 3) (2, 4) (2, 5) (2, 6) 
//		(3, 1) (3, 2) (3, 3) (3, 4) (3, 5) (3, 6) 
//		(4, 1) (4, 2) (4, 3) (4, 4) (4, 5) (4, 6) 
//		(5, 1) (5, 2) (5, 3) (5, 4) (5, 5) (5, 6) 
//		(6, 1) (6, 2) (6, 3) (6, 4) (6, 5) (6, 6) 
		
		for(int i = 1; i <= 6; i++ ) {
			for(int j = 1; j <=6; j++) {
				System.out.print("("+ i + "," + j + ") ");
			}
			System.out.println();
		}
		
		
		
//		2. 구구단
//		구구단을 2단에서 부터 9단 까지 모두 출력하세요.
//		출력 예시
//
//		2 X 1 = 2
//		2 X 2 = 4
//		2 X 3 = 6
//		2 X 4 = 8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
//		3 X 1 = 3
//		3 X 2 = 6
//		3 X 3 = 9
//		3 X 4 = 12
//		3 X 5 = 15
//		3 X 6 = 18
//		3 X 7 = 21
//		3 X 8 = 24
//		3 X 9 = 27
//		4 X 1 = 4
//		4 X 2 = 8
//		4 X 3 = 12
//		4 X 4 = 16
//		4 X 5 = 20
//		4 X 6 = 24
//		4 X 7 = 28
//		4 X 8 = 32
//		4 X 9 = 36
//		5 X 1 = 5
//		5 X 2 = 10
//		5 X 3 = 15
//		5 X 4 = 20
//		5 X 5 = 25
//		5 X 6 = 30
//		5 X 7 = 35
//		5 X 8 = 40
//		5 X 9 = 45
//		6 X 1 = 6
//		6 X 2 = 12
//		6 X 3 = 18
//		6 X 4 = 24
//		6 X 5 = 30
//		6 X 6 = 36
//		6 X 7 = 42
//		6 X 8 = 48
//		6 X 9 = 54
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21
//		7 X 4 = 28
//		7 X 5 = 35
//		7 X 6 = 42
//		7 X 7 = 49
//		7 X 8 = 56
//		7 X 9 = 63
//		8 X 1 = 8
//		8 X 2 = 16
//		8 X 3 = 24
//		8 X 4 = 32
//		8 X 5 = 40
//		8 X 6 = 48
//		8 X 7 = 56
//		8 X 8 = 64
//		8 X 9 = 72
//		9 X 1 = 9
//		9 X 2 = 18
//		9 X 3 = 27
//		9 X 4 = 36
//		9 X 5 = 45
//		9 X 6 = 54
//		9 X 7 = 63
//		9 X 8 = 72
//		9 X 9 = 81
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			
		}
		
		
//		3. 별찍기 1
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		4. 별찍기 2
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//
//		*****
//		****
//		***
//		**
//		*
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		5. 별찍기 3
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		System.out.println("5번");
		
		for(int i = 1; i <= 5; i++) {
			//		5 5 5 5 5
			//	i : 1 2 3 4 5
			//   	4 3 2 1 0
			int count = 5 - 1;
			for(int j = 1; j <= count; j++) {
				System.out.print("");
			}

			for(int j = 5; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		6. 별찍기 4
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		System.out.println("6번");
		
		for(int i = 1; i <= 5; i++) {
					
			//	i : 1 2 3 4 5
			//   	1 3 5 7	9
			int count = 5 - i;
			for(int j = 1; j <= count; j++) {
				System.out.print("");
			}
			count = 2*i -1;
			for(int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
