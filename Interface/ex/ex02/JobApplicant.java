package ex.ex02;

public class JobApplicant implements JavaProgramming{

	// 이름, 나이, 학점
	private String name;
	private int age;
	private double grade;
	
	// 자기소개 기능
	public void introduce() {
		System.out.println("안녕하세요 저는 저에요!");
	}
	
	@Override
	public void explainObjectOriented() {
		System.out.println("객체지향 프로그래밍은 객체를 지향한 프로그래밍입니다!");
	}
	
	
}
