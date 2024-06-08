package ex.ex01;

public class Dog extends Animal{

	// 꼬리흔들기 기능
	public void lash() {
		System.out.println("꼬리 살랑살랑");
	}
	
	// 짖는 기능
	@Override
	public void cry() {
		System.out.println("멍멍!!");
	}
	
	
}
