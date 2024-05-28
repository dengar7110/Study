package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		1. 위치 변경 (swap)
//		두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
//		int[] numbers = {3, 5, 2, 10, 39};
//		입력 예시
//
//		두 개의 index를 입력 하세요 : 2 4
//		출력 예시
//
//		3 5 39 10 2 
		
		System.out.println("두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.");
		
		int[] numbers = {3, 5, 2, 10, 39};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 index 를 입력 하세요 : ");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		int tmp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = tmp;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		
//		2. 셔플
//		1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤 섞어서 그 결과를 출력 하세요.
//		힌트
//		rand() 함수를 이용해서, 0번째 index의 값과 rand() 번째 index의 값의 서로 교체 하면 된다.
//
//		Random rand = new Random();
//
//		for (int i = 0; i < 100; i++) {
//		    int randomNumber = rand.nextInt(10);
//		    // swap 구현
//		}
//		출력 예시
//
//		4 5 7 8 9 1 3 6 2 10
		
		
		System.out.println("1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤 섞어서 그 결과를 출력 하세요.");
		
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
		Random rand = new Random();
	
		for (int i = 0; i < 100; i++) {
			// 0 ~ 9
			int randomNumber = rand.nextInt(10);
			tmp = numbers2[0];
			numbers2[0] = numbers2[randomNumber];
			numbers2[randomNumber] = tmp;
		}
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}
		System.out.println();
		
		
//		3. 없는 수 찾기
//		아래 배열에 1 ~ 9 의 숫자들이 들어있는데 하나의 수가 빠져 있다.
//		빠진 수를 찾아서 출력하세요.
//		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//
//		출력 예시
//
//		없는 수는 7 입니다 
		
		System.out.println("아래 배열에 1 ~ 9 의 숫자들이 들어있는데 하나의 수가 빠져 있다.\r\n"
				+ "빠진 수를 찾아서 출력하세요.");
		int[] numbers3 = {4, 6, 3, 8, 2, 9, 1, 5};
		
		for(int i = 0 ; i < numbers3.length; i++) {
			if(numbers3[i] == 1) {
				
			}
		}
		
		
//		4. 빈도수 구하기
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장 되어 있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장 되어 있는지 출력 하세요.
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1}
//
//		출력 예시
//
//		1 : 2
//		2 : 3
//		3 : 3
//		4 : 1
//		5 : 1
		
		System.out.println("1 ~ 5 까지의 숫자가 각각 몇 개씩 저장 되어 있는지 출력 하세요.");
		
		int[] numbers4 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		
		int[] frequency = new int [5];
		
		for(int i = 0; i < numbers4.length; i++) {
			int number = numbers4[i];
			frequency[number - 1]++;
		}
		
		for (int i = 0; i < frequency.length; i++) {
			System.out.println((i + 1) + " : " + frequency[i]);
		}
		
		
//		int count1 = 0;
//		int count2 = 0;
//		int count3 = 0;
//		int count4 = 0;
//		int count5 = 0;
//		
//		for(int i = 0; i < numbers4.length; i++) {
//			if(numbers4[i] == 1) {
//				count1++;
//			}else if(numbers4[i] == 2) {
//				count2++;
//			}else if(numbers4[i] == 3) {
//				count3++;
//			}else if(numbers4[i] == 4) {
//				count4++;
//			}else if(numbers4[i] == 5) {
//				count5++;
//			}
//		}
//		
//		System.out.println("1: " + count1);
//		System.out.println("2: " + count2);
//		System.out.println("3: " + count3);
//		System.out.println("4: " + count4);
//		System.out.println("5: " + count5);
		
	}

}
