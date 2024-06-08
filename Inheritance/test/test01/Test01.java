package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
		//	iPod Touch Class 를 상속 받은 iPhone Class 를 설계하세요.
		//	iPhone 에는 아래와 같은 추가 기능이 포함되어 있습니다.
		//	전화 하기, 메시지 보내기
		//	iPhone 객체를 생성 하여 아래와 같이 출력 하세요.
		//	apple - iPhone
		//	전화 번호 : 010-1234-5678
		//	https://www.google.com 로딩중...
		//	로딩 완료
		//	010-000-0000 로 통화 중
		//	010-1111-2222 로 ㅋㅋㅋㅋ 전송
		
		IPhone myPhone = new IPhone("010-1234-5678");
		
		System.out.println(myPhone.infoString());
		myPhone.internetBrowsing("https://www.google.com");
		
		myPhone.call("010-0000-0000");
		myPhone.sendMessage("010-1111-2222", "ㅋㅋㅋㅋ");
		
	}
	
}
