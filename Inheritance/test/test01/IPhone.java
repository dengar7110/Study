package test.test01;

public class IPhone extends IPodTouch{

	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		super.setModel("IPhone");
	}
	
	@Override
	public String infoString() {		
		return super.infoString() + "\n전화번호 : " + phoneNumber;
	}
	
	// 전화기능
	public void call(String number) {
		System.out.println(number + "로 통화중");
	}
	
	// 메세지 보내기 기능
	public void sendMessage(String number, String message) {
		System.out.println(number + " 로 " + message + " 전송");
	}
	
}
