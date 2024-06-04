package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Person me = new Person("홍정원", "20020314");
//		me.name = "홍정원";
//		me.birth = "20020314";
		
		me.printInfo();
		
		// 개명
		// 객체 내 멤버 변수 값 수정
//		me.name = "김선재";
		me.setName("김선재");
		
		me.printInfo();
		
		// 생년월일 출력
		System.out.println(me.getBirthday());
		
		
	}
	

}
