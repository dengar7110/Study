package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		1. 무한루프 탈출
//		무한 루프와 break를 이용해서 Hello World를 8번 출력 하세요.
//		출력 예시
//
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
//		Hello World!!
		
		System.out.println("무한 루프와 break를 이용해서 Hello World를 8번 출력 하세요.");
		
		int i = 0;
		for(;;) {
			System.out.println("Hello World!!");
			i++;
			if(i >= 8) {
				break;
			}
		}
		
		
//		2. 배수 출력
//		수를 입력 받고 continue 를 이용해서 1~ 100까지 사이의 수중에 입력 받은 수의 배수만 출력 하세요
//		입력 예시
//
//		수를 입력하세요 : 9
//		출력 예시
//
//		9 18 27 36 45 54 63 72 81 90 99 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int number = sc.nextInt();		
		
		for (i = 1; ; i++) {
            int result = number * i;
            if (result > 100) {
                break;
            }
            System.out.print(result + " ");
        }
		

		
		
//		3. 무한 입력
//		무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
//		입력이 끝나면 "끝"을 출력하세요
//		입력 예시
//
//		수를 입력하세요 : 21
//		수를 입력하세요 : 24
//		수를 입력하세요 : 83
//		수를 입력하세요 : 2
//		수를 입력하세요 : 9
//		수를 입력하세요 : 0
//		출력 예시
//
//		끝
		
		System.out.println("무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.");
		
		while(true) {
			System.out.print("수를 입력하세요 : ");
			number = sc.nextInt();
			
			if(number == 0) {
				System.out.println("끝");
				break;
			
			}
		}
		

	}

}
