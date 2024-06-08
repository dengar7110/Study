package ex.ex01;

public class Cat extends Animal{

	//그루밍 기능
	public void grooming() {
		System.out.println("구르밍~");
	}
	
	// 우는 기능
	@Override
	public void cry() {
		System.out.println("야옹~");
	}
	
}
