package test.test02;

public class Student {
	//	멤버 변수는 아래를 참조 하세요.
	//	이름, 학교, 전화번호, 수업
	private String name;
	private String school;
	private String phoneNumber;
	private String lesson;

	public Student(String name , String school, String phoneNumber, String lesson) {
		this.name = name;
		this.school = school;
		this.phoneNumber = phoneNumber;
		this.lesson = lesson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	
	// 김인규님의 학교가 첨성대학교로 변경되었습니다
	public void setSchool(String school) {
		this.school = school;
		System.out.println(name + "님의 학교가 " + school + "로 변경되었습니다");
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	// 객체 정보를 출력하는 기능
	public void printInfo() {
//		java 수업 : 낙성대학교 김인규학생
		System.out.println(lesson + " 수업 : " + school + " " + name + "학생");
	}
// 김인규학생에게 (010-0000-1111) 수업일정 메세지를 전송 합니다.
	public void sendScheduleMessage() {
		System.out.println( name + "학생에게 (" + phoneNumber + ") " + "수업일정 메세지를 전송 합니다. ");
	}
// 김인규학생에게 (010-0000-1111) 잘하자! 라고 전송 합니다.
	public void sendMessage(String message) {
		System.out.println(name + "학생에게 (" + phoneNumber + ") " + message + "라고 전송합니다.");
	}


	

	

	
}
