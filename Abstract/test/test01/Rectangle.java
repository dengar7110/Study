package test.test01;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		double area = width * height;
		return area;
	}

	@Override
	public double calculateRound() {
		double round = (width * 2) + (height * 2);
		return round;
	}
	
	@Override
	public String toString() {
		return "가로 : " + width + "세로 : " + height;
	}
	
	
}
