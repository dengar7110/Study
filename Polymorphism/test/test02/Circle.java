package test.test02;

public class Circle extends Shape {

	// 반지름
	private int radius;

	public Circle(int radius){
		this.name = "원";
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "반지름 : " + radius;
	}
	
	// 넓이를 구하는 기능
	@Override
	public double calculateArea() {
		double area = radius * radius * 3.14;
		return Math.round((area  * 100)) /  100.0;
	}
	
	// 넓이를 출력하는 기능
	@Override
	public void printArea() {
		System.out.println("원의 넓이는 : " + calculateArea() +  "cm^2 입니다.");
	}
	
	
	
}
