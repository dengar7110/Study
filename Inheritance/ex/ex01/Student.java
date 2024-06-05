package ex.ex01;

public class Student extends Person {

//	private String name;
//	private String birthday;
	private String school;
	
	public Student() {
		// super(); // new Person();
//		super("홍정원", "20242512");
//		System.out.println("Student 객체 생성");
	}
	
	public Student(String name, String birthday, String school) {
//		this.name = name;
//		this.birthday = birthday;
		super(name, birthday);
		this.school = school;
	}
	
	// @ : 어노테이션 override 재정의
	@Override
		public void printInfo() {
			super.printInfo();
			System.out.println("학교 : " + school);
		}
	
}
