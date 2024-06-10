package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
//		1. 넓이, 둘레 구하기
//		사각형과 원을 관리하는 Class 를 설계 하세요.
//		각 Class 에는 넓이와 둘레를 구하는 기능을 포함하세요.
//		추상 클래스로 부모 Class 를 만들어서 상속 관계로 설계 하세요.
//		객체 생성은 아래 형태를 참조 하세요.
//		public static void main(String[] args) {
//		    Shape[] shapes = new Shape[2];
//
//		    shapes[0] = new Rectangle(10, 25);
//		    shapes[1] = new Circle(8);
//
//		    // TODO : 구현
//		}
//		출력 결과
//
//		사각형 넓이 250.0 둘레 70.0
//		원 넓이 200.96 둘레 50.24

		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Rectangle(10, 25);
		shapes[1] = new Circle(8);
		
		for(int i = 0; i < shapes.length; i++) {
			shapes[i].printRoundwithArea();
		}
		
		
	}
}
