package test.test02;

public class Test02 {

	public static void main(String[] args) {
		
//		1. 다형성 응용
//		도형을 관리하고 넓이를 계산하는 원, 삼각형, 사각형 Class 를 설계 하세요.
//		Shape 라고 하는 Class 를 부모로 갖도록 Shape Class 와 각 도형 Class 를 구현하세요.
//		Shape 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해서 아래와 같이 출력 하세요.
//		원주율 pi 는 3.14 로 계산하세요.
//		public static void main(String[] args) {
//		        Shape[] shape = new Shape[3];
//
//		        // upcasting
//		        shape[0] = new Triangle(8, 10);
//		        shape[1] = new Rectangle(7, 13);
//		        shape[2] = new Circle(12);
//
//		    }
		
//		출력 예시
//
//		삼각형의 넓이는 40.0cm^2 입니다.
//		사각형의 넓이는 91.0cm^2 입니다.
//		원의 넓이는 452.16cm^2 입니다.
		
        Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);

		for(int i = 0; i < shape.length; i++) {
			if(shape[i]  instanceof Triangle) {
				Triangle triangle = (Triangle)shape[i];
				System.out.println("삼각형의 넓이는 : " + triangle.calculateArea() + "cm^2 입니다.");
			}
			if(shape[i]  instanceof Rectangle) {
				Rectangle rectangle = (Rectangle)shape[i];
				System.out.println("사각형의 넓이는 " + rectangle.calculateArea() + "cm^2 입니다.");
			}
			if(shape[i]  instanceof Circle) {
				Circle circle = (Circle)shape[i];
				System.out.println("원의 넓이는 " + circle.calculateArea() + "cm^2 입니다." );
			}
			
		}
        
		
	}
	
}
