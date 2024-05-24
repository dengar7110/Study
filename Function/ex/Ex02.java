package ex;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int result = getCandyPrice(5);	
		System.out.println("결과 : " + result);
		
		int total= addNumbers(25, 40);
		System.out.println("합 : " + total);
	
		// 1부터 10까지의 합구하기
		int sum = addNumbersAll(10);
		System.out.println("합계 : "+ sum);
		System.out.println("연산 결과 : " + (sum * 3));
		
	}
	
	// 1부터 전달 받은 값 까지의 합을 돌려주는 함수
	public static int addNumbersAll(int number) {
		
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	// 1부터 10까지의 합을 돌려주는 함수
	
//	public static int addNumbersAll() {
//		
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//			
//		}
//		
//		return sum;
//	}
	
	// 1부터 10까지의 합을 출력하는 함수
//	public static void addNumbersAll(){
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//		
//	}
	
	
	// 두개의 수를 더해주는 함수
	public static int addNumbers(int number1, int number2) {
		int sum = number1 + number2;
		
		return sum;
		
	}
	
	// 츄파춥스 의 개수에 따른 가격 계산 기능
	public static int getCandyPrice(int count) {
		int result = 250 * count;
	
		return result;
	}
	
	
	
}
