package test.test02;

public class Circle extends Shape {

	int radius;

	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		double area = 3.14 * radius * radius;
		return Math.round((area  * 100)) /  100.0;
	}
	
}
