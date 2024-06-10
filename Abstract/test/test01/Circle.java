package test.test01;

public class Circle extends Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateRound() {
		return 2 * 3.14 * radius;
	}

	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public void printRoundwithArea() {
		System.out.println("원의 넓이 " + calculateArea() + " 둘레 " + calculateRound());		
	}

	
	
}
