package test.test01;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateRound() {
		return (2 * width) + (2 * height);
	}
	
	@Override
	public double calculateArea() {
		return  width * height;
	}

	@Override
	public void printRoundwithArea() {
		System.out.println("사각형의 넓이 " + calculateArea() + " 둘레" + calculateRound());
	}

}
