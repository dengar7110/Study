package test.test02;

public class Test02 {

	public static void main(String[] args) {

//		1. 학생 객체
//		학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		이름, 학교, 전화번호, 수업
//
//		구현할 기능은 아래와 같습니다.
//		학교이름 변경, 수업일정 메시지 전송, 메시지 전송
//
//		설계된 Class 를 기반으로 객체를 생성하여, 아래와 같이 출력하세요
//		멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//		출력 내용에 맞춰서 적절히 기능을 구현하고 호출하세요.
//		출력 예시
//
//		java 수업 : 낙성대학교 김인규학생
//		김인규님의 학교가 첨성대학교로 변경되었습니다.
//		java 수업 : 첨성대학교 김인규학생
//		김인규학생에게 (010-0000-1111) 수업일정 메시지를 전송 합니다.
//		김인규학생에게 (010-0000-1111) 잘하자! 라고 전송 합니다. 
		
		Student student = new Student("홍정원", "낙성대학교", "010-0000-1111", "java");	
		student.printInfo();		
		student.setSchool("첨성대학교");

		student.sendScheduleMessage();
		
		String message = "잘하자!";
		student.sendMessage(message);
		
		
//		2. 갤럭시 객체
//		갤럭시 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		제조사, 모델명, 일련번호, 전화번호
//
//		구현할 기능은 아래와 같습니다.
//		전화 하기, 메시지 보내기
//
//		설계된 Class 를 기반으로 객체를 생성하여, 아래와 같이 출력하세요
//		멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//		출력 내용에 맞춰서 적절히 기능을 구현하고 호출하세요.
//		출력 예시
//
//		삼성에서 제조된 Gallaxy 입니다. 
//		전화 번호 : 010-111-2222
//		일련 번호 : 1234567890
//		010-0000-9999 로 전화를 겁니다 뚜르르르르...
//		000-1234-5678 로 "자니?" 메시지를 전송 합니다.
//		
		Galaxy gallaxy = new Galaxy("삼성", "Gallaxy", "1234567890");
		gallaxy.setPhoneNumber("010-111-2222");
		gallaxy.printInfo();
		
		gallaxy.call("010-0000-9999");
		
		message = "자니?";
		gallaxy.sendMessage("010-1234-5678", message);
	}

}