package test;

public class Test01 {

	public static void main(String[] args) {
		
//		 아래 문장을 변수를 사용하여 출력하세요.
//		 이름 : 김인규 나이 : 30
//
//		  3 + 5 = 8
//
//		  3 - 5 =  -2
//
//		  5 X 1 = 5
//		  5 X 2 = 10
//		  5 X 3 = 15
//		  5 X 4 = 20
//		  5 X 5 = 25
		
		String name = "홍정원";
		int age = 29;
		int num1 = 3;
		int num2 = 5;
		int plus = num1 + num2;
		int minus = num1 - num2;  
		
		System.out.println("이름 : " + name + " 나이 : " + age);
		
		System.out.println(num1 + " + " + num2 + " = " + plus);
		
		System.out.println(num1 + " - " + num2 + " = " + minus);
		
		System.out.println(num2 + " X " + 1 + " = " + num2 * 1);
		System.out.println(num2 + " X " + 2 + " = " + num2 * 2);
		System.out.println(num2 + " X " + 3 + " = " + num2 * 3);
		System.out.println(num2 + " X " + 4 + " = " + num2 * 4);
		System.out.println(num2 + " X " + 5 + " = " + num2 * 5);
		
	}

}
