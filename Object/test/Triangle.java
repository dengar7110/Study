package test;

public class Triangle {

	// 밑변, 높이
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 넓이 구하는 기능
	public double calculateArea() {
		return width * height / 2.0;
	}
	
// 	밑변 : 10 높이 : 14 넓이 : 70.0
	@Override
	public String toString() {
		return "밑변 : " + width + " 높이 : " + height + " 넓이 : " + calculateArea(); 
	}
	
}
