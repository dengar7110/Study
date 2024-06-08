package ex;

public class Person { //extends Object {

	// 이름, 나이
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo(){
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
	@Override
	public String toString() {
		return "이름 : " + name  + " 나이 : " + age;
	}
	
	
}
