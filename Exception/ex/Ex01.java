package ex;

public class Ex01 {

	public static void main(String[] args) {
	
		String text = null;
		
		if(text != null) {
			text.length();
		}

		int[] numbers = new int[3];
		
		try {
//			text.length();
			
			System.out.println(numbers[5]);
		} catch (NullPointerException e) {
			System.out.println("null 인 변수를 참조했다!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위가 넘어감");
		}
		
		// milli second (1 / 1000)
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println("인터럽트 발생!");
			e.printStackTrace();
		}
		
		System.out.println("끝");
		
		try {
			printNumber(7);
		} catch (Exception e) {
			System.out.println("범위 넘어감");
		}
	

	}

	// 1 부터 10 사이의 수중에서 하나를 전달 받고 출력하는 기능
	public static void printNumber(int number) throws Exception {
		
		if(number < 1 || number > 10) {
			throw new Exception();
		}
		
		System.out.println(number);
	}
	
	
}
