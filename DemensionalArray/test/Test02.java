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
		
		int request[][] = new int[2][3];
		
		for(int i = 0; i < request.length; i++) {
			for(int j = 0; j < request[i].length; j++) {
				request[i][j] = 10;
			}
		}
		
		for(int i = 0; i < request.length; i++) {
			for(int j = 0; j < request[i].length; j++) {
				System.out.print(request[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		2. 순서대로 입력하기
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
//		출력
//
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		
		System.out.println("반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.");
		
		int request2[][] = new int[3][4];
		for(int i = 0; i <  request2.length; i++) {
			for(int j = 0; j < request2[i].length; j++) {
				request2[i][j] = (j + 1);
			}
		}
		
		for(int i = 0; i < request2.length; i++) {
			for(int j = 0; j < request2[i].length; j++) {
				System.out.print(request2[i][j] + " ");
			}
			System.out.println();
		}
		
//		3. 배열 별로 입력하기
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.
//		출력
//
//		1 1 1 
//		2 2 2 
//		3 3 3 
		
		System.out.println("반복문을 이용해서, 첫 배열은 1, 두번째 배열은 2, 세번째 배열은 3 으로 채우고 출력 하세요.");
		
		int request3[][] = new int[3][3];
		for(int i = 0; i < request3.length; i++) {
			for(int j = 0; j < request3[i].length; j++) {
				request3[i][j] = (i + 1);
			}
		}

		for(int i = 0; i < request3.length; i++) {
			for(int j = 0; j < request3[i].length; j++) {
				System.out.print(request3[i][j] + " ");
			}
			System.out.println();
		}

		
		
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
		
		int request4[][] = new int[5][5];
		
		for(int i = 0; i < request4.length; i++) {
			for(int j = 0; j < request4[i].length; j++) {
				request4[i][j] = 0;
			}
		}
		
		for(int i = 0; i < request4.length; i++) {
			for(int j = 0; j < request4[i].length; j++) {
				if(i == 2 || j == 2) {
					request4[i][j] = 1;
				}

			}
		}
		
		for(int i = 0; i < request4.length; i++) {
			for(int j = 0; j < request4[i].length; j++) {
				System.out.print(request4[i][j] + " ");
			}
			System.out.println();
		}
		
//		5. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
		System.out.println("반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.");
		
		int request5[][] = new int[3][3];
		int number = 1;
		for(int i = 0; i < request5.length; i++) {
			for(int j = 0; j < request5.length; j++) {
				request5[i][j] = number;
				number++;
			}
		}
		
		for(int i = 0; i < request5.length; i++) {
			for(int j = 0; j < request5.length; j++) {
				System.out.print(request5[i][j] + " ");
			}
			System.out.println();
		}
		
//		6. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 4 7 
//		2 5 8 
//		3 6 9 
		
		int request6[][] = new int[3][3];
		
		System.out.println("반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.");
		
		number = 1;
		for(int i = 0; i < request6.length; i++) {
			for(int j = 0; j < request6[i].length; j++) {
				request6[j][i] = number;
				number++;
			}
		}
		
		for(int i = 0; i < request6.length; i++) {
			for(int j = 0; j < request6[i].length; j++) {
				System.out.print(request6[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
