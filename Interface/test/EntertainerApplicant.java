package test;

public class EntertainerApplicant implements Sing , Act{

//	private String name;
//	private int age;
	
	@Override
	public void act() {
		System.out.println("연기하다");
	}
	
	@Override
	public void sing() {
		System.out.println("노래하다");
	}
	
}
