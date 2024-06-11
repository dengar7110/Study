package test;

public class EntertainerApplicant implements Sing , Act{

	//이름, 나이
	private String name;
	private int age;
	
	@Override
	public void methodActing() {
		System.out.println("연기하다");
	}
	
	@Override
	public void singASong() {
		System.out.println("노래하다");
	}
	
}
