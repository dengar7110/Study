package test.test01;

public class Test01 {
	
	public static void main(String[] args) {
//	1. 핸드폰 객체
//	핸드폰 Class 를 설계하세요.
//	멤버 변수는 아래를 참조 하세요.
//	제조사, 모델 명, 전화 번호
//
//	설계된 Class 를 기반으로 두 개의 객체를 생성하여, 값을 저장 후, 출력하세요
//	멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//	출력 예시
//
//	갤럭시ZFlip3 (samsung) : 010-1234-5678
//
//	iPhone16 (apple) : 010-9876-5432
		
		Phone phone1 = new Phone();
		
		phone1.model = "갤럭시ZFlip3";
		phone1.company = "samsung";
		phone1.phoneNumber = "010-1234-5678";
		
		Phone phone2 = new Phone();
		
		phone2.model = "iPhone16";
		phone2.company = "apple";
		phone2.phoneNumber = "010-9876-5432";
		
		
		System.out.println(phone1.model + " (" + phone1.company + ") : " + phone1.phoneNumber);
		System.out.println(phone2.model + " (" + phone2.company + ") : " + phone2.phoneNumber);
		
//	2. 학생 명단
//	학생 Class를 설계하세요.
//	멤버 변수는 아래를 참조 하세요.
//	이름, 수업 명, 나이, 전화번호
//
//	설계된 Class 를 기반으로 두 개의 객체를 생성하여, 값을 저장 후, 출력하세요
//	멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//	출력 예시
//
//	유재석 (21) 수업 :  java, 연락처 : 010-0000-1111
//
//	이효리 (23) 수업 : 웹 개발, 연락처 : 010-9999-2222
//	두 객체를 배열에 저장하여, 반복문을 통해서 출력하세요 (option)
		
		Student student1 = new Student();
		
		student1.name = "유재석";
		student1.lesson = "java";
		student1.age = "21";
		student1.phoneNumber = "010-0000-1111";
		
		
		Student student2 = new Student();
		
		student2.name = "이효리";
		student2.lesson = "웹 개발";
		student2.age = "23";
		student2.phoneNumber = "010-9999-2222";
		
		System.out.println(student1.name + " (" + student1.age + ") 수업 : " + student1.lesson + ", 연락처 : " + student1.phoneNumber);
		System.out.println(student2.name + " (" + student2.age + ") 수업 : " + student2.lesson + ", 연락처 : " + student2.phoneNumber);
		
		
		Student[] students = {student1, student2};
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + " (" + students[i].age + ") 수업 : + " + students[i].lesson + ", 연락처 : " + students[i].phoneNumber);
		}
		
		
	}
}
