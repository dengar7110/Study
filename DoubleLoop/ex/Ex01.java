package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 벤치프레스 3세트 10회
		
		for(int i = 0; i < 3; i++) {
			// 10회 반복
			for(int j = 0; j < 10; j++) {
				System.out.print("으쌰! ");
			}
			System.out.println();
		}
		
		// 1세트 1개째 .... 1세트 10개째
		// 2세트 1개째 .... 2세트 10개째
		// 3세트 1개째 .... 3세트 10개째
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(i + "세트" + j + "개째 ");
			}
			System.out.println();
		}

		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
	
		// 01 02 03 04 05 
		// 11 12 13 14 15
		// 21 22 23 24 25
		// 31 32 33 34 45
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		
		// *****
		// *****
		// *****
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
