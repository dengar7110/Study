package test;

public class Test02 {

	public static void main(String[] args) {
//		1. 10 입력하기
//		[2][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
//		출력
//
//		10 10 10 
//		10 10 10 
		
		System.out.println("반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.");
		
		int[][] numbers = new int[2][3];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 10;
			}
		}
		
		print2DArray(numbers);
		
		
//		2. 순서대로 입력하기
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
//		출력
//
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		System.out.println("반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.");
		
		int[][] numbers2 = new int[3][4];
		
		for(int i = 0; i < numbers2.length; i++) {
			for(int j = 0; j < numbers2[i].length; j++){
				numbers2[i][j] = (j + 1) ;
			}
		}
		
		print2DArray(numbers2);
		
//		3. 배열 별로 입력하기
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.
//		출력
//
//		1 1 1 
//		2 2 2 
//		3 3 3 
		
		System.out.println("반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.");
		
		int[][] numbers3 = new int[3][3];
		
		for(int i = 0; i < numbers3.length; i++) {
			for(int j = 0; j < numbers3[i].length; j++){
				numbers3[i][j] = (i + 1) ;
			}
		}
		
		print2DArray(numbers3);
		
		
		
//		4. +자 그리기
//		[5][5] 크기의 배열을 만드세요.
//		모든 값을 0으로 초기화 하세요.
//		반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
//		출력
//
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		System.out.println("반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.");
		
		int[][] numbers4 = new int[5][5];
				
		for(int i = 0; i < numbers4.length; i++) {
			for(int j = 0; j < numbers4[i].length; j++){
				
				if(i == 2 || j == 2) {
					numbers4[i][j] = 1;
				}

			}
		}
				
		print2DArray(numbers4);
		
//		5. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
		System.out.println("반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.");
		
		int [][] numbers5 = new int[3][3];
		
		int number = 1;
		for(int i = 0; i < numbers5.length; i++) {
			for(int j = 0; j < numbers5[i].length; j++) {
				numbers5[i][j] = number;
				number++;
			}
		}
		
		print2DArray(numbers5);
		
//		6. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 4 7 
//		2 5 8 
//		3 6 9 

		System.out.println("반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.");
		
		int [][] numbers6 = new int[3][3];
		
		number = 1;
		
		for(int i = 0; i < numbers6.length; i++) {
			for(int j = 0; j < numbers6[i].length; j++) {
				numbers6[j][i] = number;
				number++;
			}
			
		}
		
		print2DArray(numbers6);
		
		
		
	}
	// 2차원 배열을 출력하는 함수
	public static void print2DArray(int array[][]) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}
