package test.test01;

public abstract class Shape {

	private String name;
	
	public abstract double calculateArea();
	
	public abstract double calculateRound();
	
	public void printAreaWithRound() {
		System.out.println(name + " 넓이 " + calculateArea() + " 둘레 " + calculateRound() );
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
}
