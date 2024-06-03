package test.test01;

public class Test01 {

	public static void main(String[] args) {

//		1. 원
//		원 을 Class 로 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		반지름
//
//		메소드는 아래 를 참조하세요
//		넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
//
//		pi는 3.14
//
//		원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
//
//		출력 예시
//
//		원의 넓이 : 200.96
//		원의 둘레 : 50.24
//		원 25개 넓이 : 5024.0
		
		Circle circle = new Circle(8);
		
		// 넓이 구하기
		System.out.println("원의 넓이 : " + circle.calculateArea());
		// 둘레 구하기
		System.out.println("원의 둘레 : " + circle.calculateRound());
		// 갯수에 따른 넓이 구하기
		System.out.println("원 25개 넓이 : " + circle.calculateAreaByCount(25));
		
		
//		2. 제품 관리
//		제품 관리 Class를 설계 하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		제품 관리 Class 를 통해서 아래 내용을 출력 하세요.
//		유통기한을 이 지나지 않았을 경우 "판매 가능상품", 유통기한이 지났을 경우 "판매 불가 상품"
//		출력 예시
//
//		이름 : 새우깡
//		가격 : 1300 
//		유통기한 : 2021-03-02 
//
//		제품 5개의 가격 : 6500
//		제품 13개의 가격 : 16900
//		판매 가능 상품
		
		Goods ggang = new Goods("새우깡", 1300, "2024-09-12");
		
		ggang.printInfo();
		
		System.out.println("제품 5개의 가격 : " + ggang.calculatePrice(5));
		System.out.println("제품 13개의 가격 : " + ggang.calculatePrice(13));
		

//		System.out.println(ggang.availableSale("2021-03-03"));
		
		
		if(ggang.availableSale("2024-06-03")) {
			System.out.println("판매 가능 상품");
		}else {
			System.out.println("판매 불가상품");
		}
		
	
		
		
	}
}
