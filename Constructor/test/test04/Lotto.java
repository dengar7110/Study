package test.test04;

import java.util.Random;

public class Lotto {

	// 선택된 번호
	private int[] checkNumbers = new int[6];

	// 수동 선택
	public void manual(int number1, int number2, int number3, int number4, int number5, int number6) {
		checkNumbers[0] = number1;
		checkNumbers[1] = number2;
		checkNumbers[2] = number3;
		checkNumbers[3] = number4;
		checkNumbers[4] = number5;
		checkNumbers[5] = number6;
	}
	
	public void auto() {
		// 임의의 숫자 얻기
		// 1 ~ 45 범위의 숫자
		
		Random random = new Random();
		for(int i = 0; i < checkNumbers.length; i++) {
			int randomNumber =  random.nextInt(45) + 1; // 0 ~ 44
			checkNumbers[i] = randomNumber;
			
			for(int j = 0; j < i; j++) {
				if(randomNumber == checkNumbers[j]) {
					// 중복되었다
					i--;
					break;
				}
			}
		}
	}
	
	public void printInfo() {
		System.out.print("선택한 번호 : ");
		for(int i = 0; i < checkNumbers.length; i++) {
			System.out.print(checkNumbers[i] + " ");
		}
		System.out.println();
	}

	public int[] getCheckNumbers() {
		return checkNumbers;
	}
	


}
