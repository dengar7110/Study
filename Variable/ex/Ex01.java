package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 변수만들기
		// 츄파춥스 가격은 250원 입니다.
	
		int candy = 250;
		System.out.println(candy);
		
		// 츄파춥스 가격 : 250원
		System.out.println("츄파춥스 가격 : " + candy + "원");
	
		// "츄파춥스" 가격 : 250원
		System.out.println("\"츄파춥스\" 가격 : " + candy + "원");
		
		// 츄파춥스 3개의 가격
		int total = candy * 3;
		System.out.println("츄파춥스 3개의 가격 : " + total + "원");
		
		// 츄파춥스 가격 인상
		candy = candy + 100;
		total = candy * 3;
		System.out.println("츄파춥스 3개의 가격 : " + total + "원");
	
		// 3000원으로 츄파춥스를 최대 몇개 살 수 있을까?
		int money = 3000;
		int count = money/candy;
		System.out.println("최대 개수 : " + count + "개");
		
		// 최대로 사고 남는 거스름 돈 계산
		// 나눈 나머지
		int change = money % candy;
		System.out.println("거스름 돈 : " + change + "원");
		
		
		
		
	}
	
}
