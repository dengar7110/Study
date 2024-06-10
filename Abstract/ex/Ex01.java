package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 추상 클래스는 객체 생성 불가
//		new Animal(); 
	
		Dog dog = new Dog();
		
		dog.cry();
		dog.lash();
		
		Animal animal = dog;
		
		animal.cry();
		animal.eat();
//		animal.lash();	// 사용 x
		
		
	}
}
