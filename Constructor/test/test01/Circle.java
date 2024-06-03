package test.test01;

public class Circle {

//	1. 원
//	원 을 Class 로 설계하세요.
//	생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//	멤버 변수는 아래를 참조 하세요.
//	반지름
//
//	메소드는 아래 를 참조하세요
//	넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
//
//	pi는 3.14
//
//	원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
//
//	출력 예시
	
	private int radius;
	
	public void printInfo() {
		System.out.println("반지름은 : " + radius);
	}
	
	public double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double calculateRound() {
		double round = 3.14 * 2 * radius;
		return round;
	}
	
	public double calculateAreaByCount(int count) {
		return calculateArea()* count;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
}
