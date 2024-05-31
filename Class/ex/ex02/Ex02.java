package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {

		// 여러 사각형을 데이터화
		// 큰 사각형
		
		Rectangle bigRectangle = new Rectangle();
		bigRectangle.width = 45;
		bigRectangle.height = 47;
		
		// 작은 사각형
		
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.width = 6;
		smallRectangle.height = 5;
		
		// 큰 사각형 넓이
		int area = bigRectangle.width * bigRectangle.height;
		System.out.println("넓이 : " + area);
		
		area = bigRectangle.calculateArea();
		System.out.println("넓이 : " + area);
		
		// 작은사각형 5개의 넓이
		area = smallRectangle.calculateAreaByCount(5);
		System.out.println("5개의 넓이: " + area);
		
		bigRectangle.printInfo();
		smallRectangle.printInfo();
		
		
		
		
	}

}
