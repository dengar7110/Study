package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 츄파춥스 가격을 입력받고, 3개의 가격을 출력 한다.
		Scanner sc = new Scanner(System.in);
				
		System.out.println("츄파춥스 가격을 입력하세요");
		int candy = sc.nextInt();
		int total = candy * 3;
		System.out.println("츄파춥스 3개의 가격 : " + total);
	
		
		
		// 두개의 수를 한번에 입력받기
		// 츄파춥스 가격과 개수를 입력 받고 계산 결과를 출력하는 프로그램
//		System.out.println("츄파춥스 가격을 입력하세요 ");
//		candy = sc.nextInt();
//		
//		System.out.println("개수를 입력하세요 ");
//		int count = sc.nextInt();

		System.out.println("츄파춥스 가격과 개수를 입력하세요");
		candy = sc.nextInt();
		int count = sc.nextInt();
		
		total = candy * count;
		
		System.out.println("츄파춥스 " + count + "개의 가격은 " + total + "원 입니다.");
		
		
	}

}
