package test.test02;

public class Circle {

	// 멤버변수
	int radius;
	int count;
	
//	메소드는 아래 를 참조하세요
//	넓이 구하기, 둘레 구하기, 개수에 따른 넓이 구하기
	
	double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	double calculateRound() {
		double round = 2 * 3.14 * radius;
		return round;
	}
	
	// overload - 같은 이름의 파라미터가 다른 메소드
	// 파라미터 개수, 파라미터 타입
	double calculateArea(int count) {
		double area = calculateArea() * count;
		return area;
	}
	
	
}
