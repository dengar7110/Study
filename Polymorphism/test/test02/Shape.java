package test.test02;

public class Shape {

	// 도형이름
	protected String name;
	
	public double calculateArea() {
		// nothing
		return 0;
	}

	public void printArea() {
		System.out.println(name + "의 넓이는 " + calculateArea() + "cm^2입니다.");
	}
	
	
}
