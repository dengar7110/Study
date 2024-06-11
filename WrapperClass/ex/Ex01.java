package ex;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int number1 = 10;
		Integer number2 = 10;
				
		double number3 = 3.0;
		Double number4 = 3.0;
		
		Integer number5 = 100;
		Integer number6 = 100;
		
		if(number5 == number6) {
			System.out.println("두 수는 같다!");
		}
		
		// deprecated
		Integer number7 = new Integer(100);
		
		// 주소를 비교
		if(number5 == number7) {
			System.out.println("두수는 같다@@");
		}
		
		// equals 는 실제 저장된 값을 비교
		if(number5.equals(number7)) {
			System.out.println("두 수는 같다##");
		}
		
		int number8 = 100;
		if(number8 == number7) {
			System.out.println("두 수는 같다$$$");
		}
		
	}

}
