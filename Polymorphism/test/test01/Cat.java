package test.test01;

public class Cat extends Animal{

//	고양이는 먹이를 "냠냠" 하고 먹고, "야옹" 하며 울며, "핥짝핥짝" 그루밍을 합니다.

	@Override
	public void cry() {
		System.out.println("야옹~");
	}
	
	public void gromming() {
		System.out.println("핥짝핥짝 그루밍");
	}
	
}
