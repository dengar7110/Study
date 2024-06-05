package test.test03_2;

public class OMRCardReader2 {

	int[] answer = new int[5];
	
	public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5) {
		answer[0] = answer1;
		answer[1] = answer2;
		answer[2] = answer3;
		answer[3] = answer4;
		answer[4] = answer5;
	}
	
	public void printInfo() {
		System.out.print("정답 : ");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}
	
	// 채점 기능
	public int checkScore(OMRCard2 card){
		// marking : 3 5 2 1 1
		// answer  : 3 5 4 1 3
		int[] marking = card.getMarking();
		
		int score = 0;
				
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == marking[i]) {
				score += 100 / answer.length;
			}
		}
		
		return score;
	}
	
	// 채점 기능
	public int checkScore(int[] marking){
		// marking : 3 5 2 1 1
		// answer  : 3 5 4 1 3
		int score = 0;
				
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == marking[i]) {
				score += 100 / answer.length;
			}
		}
		
		return score;
	}
	
	// 채점 결과 출력 기능
//	이름 : 김인규
//	학번 : 1234567890
//	점수 : 60
	public void printResult(OMRCard2 card) {
		int score =  checkScore(card);
		
		System.out.println("이름 : " + card.getName());
		System.out.println("학번 : " + card.getStudentId());
		System.out.println("점수 : " + score);
		
	}
	
	// 여러장의 카드 채점 결과 출력 기능
	public void printResult(OMRCard2[] cards){
		
		for(int i = 0; i < cards.length; i++) {
			printResult(cards[i]);
		}
		
	}
	
}
