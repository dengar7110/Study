package ex.ex01;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("냠냠");
	}
	
	@Override
	public void cry() {
		System.out.println("냐옹!");
	}
	
	public void grooming() {
		System.out.println("낼름 낼름");
	}
	
}
