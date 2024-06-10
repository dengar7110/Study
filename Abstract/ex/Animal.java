package ex;

// 추상 클래스
// 추상메소드를 하나이상 포함한 클래스
public abstract class Animal {
	
	// 먹이를 먹는 기능
	public void eat() {
		System.out.println("냠냠");
	}
	
	// 우는 기능
	// 추상 메소드
	// 자기자신에서는 구현할 내용이 없고, 자식 클래스에서 구현하기를 희망하는 메소드
	public abstract void cry();
	
	
}
