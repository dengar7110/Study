package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 몸무게가 70kg 이상일 동안 운동을 한다.
		int weight = 75;
		
		while(weight >= 70) {
			System.out.println("으쌰으쌰!");
			weight -= 2; // 복합대입 연산자 // weight = weight - 2;
		}
		System.out.println("운동 끝!");
		
		
		// 횟수 반복
		// Hello World 5번 출력
		// 0 1 2 3 4
		int i = 0;
		while(i < 5) {
			System.out.println("Hello World");
			i++;	// 증감연산자 // i += 1; // i = i + 1;
		}
		
		
		// 1 2 3 4 5 출력
		i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		// 5 4 3 2 1 출력
		i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		
		int count = 7;
		
		i = 0;
		while(i < count) {
			System.out.println("Hello World");
			i++;
		}
		
		// 1 ~ 10까지의 모든 수의 합을 구하자
		// 1 2 3 4 5 6 7 8 9 10
		
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		// 무한 루프
		while(true) {
			System.out.println("Hello World");
		}
		
		
		
	}

}
