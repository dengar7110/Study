package ex.ex01;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("와구와구!");
	}
	
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
	
	public void lash() {
		System.out.println("살랑살랑");
	}
	
	
}
