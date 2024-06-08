package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		
		Cat bada = new Cat();
		bada.eat();
		bada.grooming();
		
		Dog kong = new Dog();
		kong.eat();
		kong.lash();
	
		System.out.println("========================");
		
		// 업 캐스팅( Up casting)
		Animal animal1 = new Dog();
		Animal animal2 = kong;
		
		animal1.eat();
		animal2.eat();
		
//		animal2.lash();

		System.out.println("====================");
		
		eatDog(kong);
		eatCat(bada);
		
		eatAnimal(kong);
		eatAnimal(bada);
	
		System.out.println("==================");
		
		Animal[] animals = new Animal[2];
		animals[0] = kong;
		animals[1] = bada;
		
		for(int i = 0; i< animals.length;  i++) {
			animals[i].eat();
			animals[i].cry();
			
			// Cat 객체가 맞는지
			if(animals[i] instanceof Cat){
				Cat cat = (Cat)animals[i];
				cat.grooming(); 
			}
				
		}
		
		// 다운 캐스팅 ( Down Casting)
//		animal1.lash();
		Dog dog = (Dog)animal1;
		dog.lash();
		
		
	}
	
	public static void eatAnimal(Animal animal) { 	// animal = kong
		animal.eat();
	}
	
	// Dog 객체를 전달 받고, 먹이를 먹는 기능
	public static void eatDog(Dog dog){
		dog.eat();
	}
	
	// Cat 객체를 전달 받고, 먹이를 먹는 기능
	public static void eatCat(Cat cat) {
		cat.eat();
	}
	
	
}
