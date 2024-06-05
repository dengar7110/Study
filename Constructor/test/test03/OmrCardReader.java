package test.test03;

public class OmrCardReader {

	int[] corrects;
	
	OmrCardReader(int correct1, int correct2, int correct3, int correct4, int correct5){
		this.corrects = new int[] {correct1, correct2, correct3, correct4, correct5};
	}


	public void scoreCheck(Omrcard omr) {
		
		int score = 0;
		int[] answers = omr.getAnswers();
		
		for(int i = 0; i < corrects.length; i++) {
			if(answers[i] == corrects[i]) {
				score += 20;
			}
		}
		
		System.out.println("이름 : " + omr.getName());
		System.out.println("학번 : " + omr.getNumber());
		System.out.println("점수 : " + score);
		
		
	}
	
	
}
