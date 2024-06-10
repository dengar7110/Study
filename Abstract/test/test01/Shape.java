package test.test01;

public abstract class Shape {
	
	protected String name;
	
	public abstract double calculateRound(); 
		
	public abstract double calculateArea(); 
	
	// 넓이 둘레 출력 기능
	public void printRoundwithArea() {
		System.out.println(name + "의 넓이 " + calculateArea() + " " + name + "의 둘레 " + calculateRound());
	}
	
}
