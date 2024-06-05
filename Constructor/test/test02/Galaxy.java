package test.test02;

public class Galaxy {

//	멤버 변수는 아래를 참조 하세요.
//	제조사, 모델명, 일련번호, 전화번호
	private String maker;
	private String model;
	private String serialNumber;
	private String phoneNumber;
	
	public Galaxy(String maker, String model, String serialNumber) {
		this.maker = maker;
		this.model = model;
		this.serialNumber = serialNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void printInfo() {
		System.out.println( maker + "에서 제조된 " + model + "입니다.");
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("일련번호 : " + serialNumber);
	}
	
	public void call(String number) {
		System.out.println(number + "로 전화를 겁니다 뚜르르르르...");
	}
	public void sendMessage(String number, String message) {
		System.out.println(number + " 로 " + "\"" + message + "\"" + " 메세지를 전송 합니다." );
	}
	
	
}
