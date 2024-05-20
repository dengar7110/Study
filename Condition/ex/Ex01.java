package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 몸무게가 70kg이 넘지 않는다면 치킨을 먹자
		// 만약 몸무게가 70kg 이하라면 치킨 먹자
		// 조건 : 몸무게가 70kg 이하
		// 실행문 : 치킨먹자
		
		int weight = 57;
		
		if(weight <= 70) {
			// 뎁스, 들여쓰기, 인덴트(indent)
			System.out.println("치킨먹자");
		}
		
		// 몸무게가 80초과면 다이어트 시작
		if(weight > 80 ) {
			System.out.println("다이어트 시작");
		}
		
		// 몸무게가 60이하면 폭식!
		if(weight <= 60) {
			System.out.println("폭식!");
		}
		
		// 몸무게가 68이면 목표 달성!!
		if(weight == 68) {
			System.out.println("목표 달성!!");
		}
		
		// 몸무게가 72가 아니면 72가 아니네?
		if(weight != 72) {
			System.out.println("72가 아니네?");
		}
		
		// if 조건 () 안에는 true 혹은 false 라는 값만 들어 갈 수 있다!
		if(true) {
			System.out.println("조건이 맞다");
		}
		if(false) {
			System.out.println("조건이 맞지 않다"); //실행 안됨
		}
		
		// 비교 연산은 연산이다!
		// 비교 연산의 결과는 true 혹은 false 이다.
		System.out.println(weight <= 70);
		
		
		//true 와 false 를 저장하는 변수 타입 boolean
		boolean result1 = true;
		boolean result2 = weight < 60;
		
		if(result2) {
			System.out.println("폭식!!!!!!!");
		}
		
		// 변수 끼리 비교 연산
		int number1 = 5;
		int number2 = 10;
			
		if(number1 < number2) {
			System.out.println("number2가 더 크다!");
		}
		
	}

}
