package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 반올림 함수
		long roungNumber = Math.round(3.5);
		System.out.println("결과 : " + roungNumber);
		System.out.println("결과 : " + Math.round(3.5));
		
		// 큰 값 구하기 함수
		int max = Math.max(10, 50);
		System.out.println("결과 : " + max);
		System.out.println("결과 : " + Math.max(20, 10));
	
		// 제곱근 구하기 함수
		int number = 16;
		double sqrtNumber = Math.sqrt(number);
		System.out.println("결과 : " + sqrtNumber);
		
		
	}
	
}
