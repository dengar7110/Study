package test.test02;

public class Triangle extends Shape {

	// 밑변, 높이
	private int width;
	private int height;
	
	public Triangle(int width, int height){
		this.name = "삼각형";
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "밑변 : " + width + "높이 : " + height;
	}
	
	// 넓이를 구하는 기능
	@Override
	public double calculateArea() {
		return width * height / 2.0;
	}

	// 넓이를 출력하는 기능
	@Override
	public void printArea() {
		System.out.println("삼각형의의 넓이는 : " + calculateArea() +  "cm^2 입니다.");
	}
	
}
