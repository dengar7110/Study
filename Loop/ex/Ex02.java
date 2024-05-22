package ex;

public class Ex02 {

	public static void main(String[] args) {

		// 횟수 반복 5회
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
		
		// 1 2 3 4 5 
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 카운트 다운
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int weight = 74;
		
		for(; weight > 70; weight -= 2) {
			System.out.println("으쌰으쌰");
		}
		
		// 1 ~ 10 까지 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++ ) {
			sum += i; // sum = sum + i;
		}
		System.out.println(sum);
		
		//무한루프
		int i = 0;
		for(;;) {
			if(i == 5) {
				break;
			}
			System.out.println("Hello");
			i++;
		}
		
		// 1 ~ 10 까지 출력
		// 4의 배수를 제외하고 출력 
		for(i = 1 ; i <= 10; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
