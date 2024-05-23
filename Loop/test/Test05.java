package test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		1. 알파벳 출력
//		반복문을 이용해서 A~Z 까지 출력하세요
//		출력 예시
//
//		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		
		System.out.println("반복문을 이용해서 A~Z 까지 출력하세요");
		String alphabet = "ABCDEFGJIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < alphabet.length(); i++) {
			System.out.print(alphabet.charAt(i) + " ");
		}
		
		System.out.println();
		
		// 선생님 풀이 // ascii 코드 사용
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
//		2. 합 구하기
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 출력하세요.
//		단, 합이 100이 넘으면 합을 중단하고 그때 까지의 합을 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 85
//		출력 예시 
//		105

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력 받아서 1에서 부터 그 수 까지의 합을 출력하세요.");
		System.out.println("단, 합이 100이 넘으면 합을 중단하고 그때 까지의 합을 출력하세요.");
		
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			sum += i;
			if(sum >= 100) {
				break;
			}
		}

		System.out.println(sum);
		
//		105
//		3. 등차수열
//		1 4 7 10 13 16 19 22 25 ... 은
//		1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
//		이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여
//		등차(차이가 같다의 한문 말) 수열이라고 한다.
//
//		시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하세요.
//		입력 예시
//
//		세개의 수를 입력 하세요 : 1 3 10
//		출력 예시
//
//		28
		
		System.out.println("시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하세요.");
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int answer = 0 ;
		
		for(int i = 1; i <= n; i++) {
			answer = a + (d*(n-1));
		}
		
		System.out.println(answer);
		
	 
		
//		4. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//
//		수를 입력 받고 그 수가 소수(prime)인지 아닌지 출력하세요.
//		입력 예시
//
//		수를 입력 하세요 : 73
//		출력 예시
//
//		소수 입니다.
		
		System.out.println("수를 입력 받고 그 수가 소수(prime)인지 아닌지 출력하세요.");
		System.out.print("수를 입력 하세요 : ");
		number = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("소수 입니다.");
		}else{
			System.out.println("소수가 아닙니다.");
		}
		
		// 선생님 풀이
		System.out.println("수를 입력하세요 : ");
		number = sc.nextInt();
		// flag 변수 
		boolean isPrimeNumber = true;
		// 2 3 4 5 6 7 8
		// 소수 판별시 해당수의 제곱근 까지만 확인해봐도 됨
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				isPrimeNumber = false;
				//소수가 아니다
				System.out.println("소수가 아닙니다");
				break;
			}
		}
		// 소수가 아닌 경우의 조건에 한번도 부합되지 않은 경우
		// 해당 조건문에 한번도 들어간적이 없는 경우
		if(isPrimeNumber) {
			System.out.println("소수 입니다");
		}
		
		
		
//		5. 가위 바위보 대결
//		컴퓨터와 가위 바위 보 게임을 하고 승리 결과를 출력하세요.
//		총 5판 3선승제 로 둘 중하나가 이기면 경기를 끝내고 승리 결과를 출력한다.
//		가위 : 1 바위 : 2 보 : 3
//		컴퓨터는 랜덤 클래스를 통해서 게임을 진행한다.
//		랜덤 클래스 사용법과 입력 방식은 아래와 같다.
//		Random rand = new Random();
//
//		int youWin = 0;
//		int computerWin = 0;
//		for(int i = 0; i < 5; i++) {
//		    int computerPlay = rand.nextInt(3) + 1;
//		    System.out.print("가위(1) 바위(2) 보(3)!! : ");
//		    number = scan.nextInt();
//		입출력 예시
//
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 2 -비겼습니다.
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 2 -비겼습니다.
//		가위(1) 바위(2) 보(3)!! : 3
//		computer : 1 -졌습니다.
//		가위(1) 바위(2) 보(3)!! : 2
//		computer : 3 -졌습니다.
//		가위(1) 바위(2) 보(3)!! : 1
//		computer : 1 -비겼습니다.
//		최종 결과 0:2 로 당신의 패배 입니다.

		
		System.out.println("컴퓨터와 가위 바위 보 게임을 하고 승리 결과를 출력하세요.");
		System.out.println("총 5판 3선승제 로 둘 중하나가 이기면 경기를 끝내고 승리 결과를 출력한다.");
		System.out.println("가위 : 1 바위 : 2 보 : 3");
		
		Random rand = new Random();
		
		int youWin = 0;
		int computerWin = 0;
		for(int i = 0; i < 5; i++) {
		    int computerPlay = rand.nextInt(3) + 1;
		    System.out.print("가위(1) 바위(2) 보(3)!! : ");
		    number = sc.nextInt();
		    
		    if(number == computerPlay) {
		    	System.out.println("computer : " + computerPlay + "-비겼습니다.");
		    }else if((number == 1 && computerPlay == 3) || (number == 2 && computerPlay == 1) || (number == 3 && computerPlay == 2)) {
		    	youWin++;
		    	System.out.println("computer : " + computerPlay + "-이겼습니다.");
		    }else {
		    	computerWin++;
		    	System.out.println("computer : " + computerPlay + "-졌습니다.");
		    }
		    
		    
		}
		 if(youWin == computerWin) {
			 System.out.println("최종결과" + youWin + " : " + computerWin + "로 비겼습니다.");
		 }else if(youWin > computerWin) {
			 System.out.println("최종결과" + youWin + " : " + computerWin + "로 당신의 승리입니다..");
		 }else {
			 System.out.println("최종결과" + youWin + " : " + computerWin + "로 당신의 패배입니다.");
		 }
	}

}
