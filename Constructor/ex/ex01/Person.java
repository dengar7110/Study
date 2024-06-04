package ex.ex01;

public class Person {
	
	// 이름, 생년월일
	private String name;
	private String birthday;

	// 기본 생성자
//	public Person() {
//		System.out.println("생성!");
//	}
	
	public Person(String name , String birthday){	
		this.name = name;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	
	// name 값 수정 기능
	// setter
	public void setName(String name) {
		this.name = name;
	}

	// birthday 값 리턴 기능
	// getter
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	// 정보 출력 기능
	public void printInfo() {
		System.out.println("이름 : " + name + " 생년월일 : " + birthday);
	}
	
}
