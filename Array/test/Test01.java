package test;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
//		아래 배열을 이용해서 문제를 푸세요.
//		배열의 시작은 0 인것을 유의 하세요
//		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//		1. 배열 값 접근
//		배열의 4번째 값을 6으로 바꾸세요.
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		numbers[3] = 6;
		System.out.println(Arrays.toString(numbers));
		
//		2. 배열 출력
//		배열에 값을 순서로 출력하세요.
//		출력 예시
//
//		3 8 9 6 2 1 7 5 
		System.out.println("배열에 값을 순서로 출력하세요");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		System.out.println("for each 문 사용");
		for(int number : numbers) {
			
			System.out.print(number + " ");
		}
		System.out.println();
//		3. 배열 출력
//		배열에 값이 반대 순서(역순)로 출력하세요.
//		출력 예시
//
//		5 7 1 2 6 9 8 3 
		System.out.println("배열에 값이 반대 순서(역순)로 출력하세요.");
		
		for(int i = numbers.length-1; 0 < i; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		
		
//		4. 배열 출력
//		배열에 짝수번째 위치에 있는 값들을 출력 하세요.
//		출력 예시
//
//		8 6 1 5 
		System.out.println();
		System.out.println("배열에 짝수번째 위치에 있는 값들을 출력 하세요.");
		for(int i = 0; i < numbers.length; i++) {
			if(i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		
//		5. index
//		배열에 값들 중 2가 들어 있는 index를 출력하세요.
//		출력 예시
//
//		2가 들어 있는 index : 4
		
		System.out.println();
		System.out.println("배열에 값들 중 2가 들어 있는 index를 출력하세요.");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2) {
				System.out.println(numbers[i]);
				break;
			}
		}
		
//		6. 최대값
//		배열에 값들 중 가장 큰 값을 출력 하세요
//		출력 예시
//
//		가장 큰 값 : 9
		
		System.out.println("배열에 값들 중 가장 큰 값을 출력 하세요");
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
//		7. 최소값 index
//		배열에 값들 중 가장 작은 수가 저장된 index를 출력하세요.
//		출력 예시
//
//		최소값의 index : 5
		
		System.out.println("배열에 값들 중 가장 작은 수가 저장된 index를 출력하세요");
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == min) {
				System.out.println("최소값의 idex : " + i);
			}
		}
		

//		8. 합계
//		배열에 모든 수의 합을 출력 하세요
//		출력 예시
//
//		값의 합 : 41
		System.out.println("배열에 모든 수의 합을 출력 하세요");
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
	}

}
