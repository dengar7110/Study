package ex;

public class Member {

	// 이름, 전화번호
	private String name;
	private String phoneNumber;
	
	public Member(String name , String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
		
	
	@Override
	public String toString() {
		return "이름 : " + name + " 전화번호 : " + phoneNumber;
	}
	
	
	
}
