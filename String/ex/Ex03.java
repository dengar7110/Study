package ex;

public class Ex03 {

	public static void main(String[] args) {

		String text = "Hello";
		
		// 문자열 변수는 값 뿐만 아니라
		// 저장된 값을 기반으로 기능을 수행ㅎ는 함수(메소드)를 포함한다.
		
		// 문자열 길이 구하기
		int length = text.length();
		
		System.out.println(text + "의 길이 : " + length);
		System.out.println(text + "의 길이 : " + text.length());

		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		
		// 문자열을 문자들을 통해서 출력
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ");
		}
		System.out.println();
		
		//문자열 자르기
		String part = text.substring(0, 4);
		System.out.println(part);
		
		part = text.substring(1, 3);
		System.out.println(part);
		
		part = text.substring(3, 5);
		System.out.println(part);
		
		part = text.substring(2);
		System.out.println(part);
		
		// 특정 문자열로 시작, 끝나는지 확인
		String name = "홍정원";
		
		boolean isHong = name.startsWith("홍");
		System.out.println(isHong);
		
		if(name.startsWith("홍")) {
			System.out.println("홍씨 확인");
		}
		
		// 이름이 정원인지 확인
		boolean isJw = name.endsWith("정원");
		
		if(name.endsWith("정원")) {
			System.out.println("정원 확인");
		}
		
		// 문자열 일부 바꾸기
		// 정원 -> 선재
		String newName = name.replace("정원", "선재");
		System.out.println(newName);
		System.out.println(name);
		name = name.replace("선재", "정원");
		System.out.println(name);
		
		// 문자열 쪼개기
		String members = "홍정원,유재석,하하,조세호";
		String[] names = members.split(",");
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]+ " ");
		}
		
		
	}

}
