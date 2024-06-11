package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();
		
		
		Dog dog = new Dog();
		dog.cry();
		dog.eat();
		dog.lash();
		
		Cat cat = new Cat();
		cat.cry();
		cat.eat();
		cat.grooming();
		
		Animal animal = dog;
		animal.cry();
		animal.eat();
//		animal.lash();
		
	}
	
}
