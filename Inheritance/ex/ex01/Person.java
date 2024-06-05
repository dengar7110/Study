package ex.ex01;

public class Person {
	
	private String name;
	private String birthday;
//	protected String name;
//	protected String birthday;
	
	public Person() {
		System.out.println("Person 객체 생성");
	}

	public Person(String name, String birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	public void printInfo(){
		System.out.println("이름 : " + name + " 생년월일 : " + birthday);
	}
	
	
}
