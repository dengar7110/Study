package test.test01;

public class Circle extends Shape {

	private int radius;
	
	public Circle(int radius) {
		super("원");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = radius * radius * 3.14;
		return area;
	}

	@Override
	public double calculateRound() {
		double round = 2 * 3.14 * radius;
		return round;
	}
	
	@Override
	public String toString() {
		return "반지름 : " + radius;
	}
	
}
