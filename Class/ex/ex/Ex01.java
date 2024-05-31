package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		// 국어 점수 80점
//		int score = 80;
		// 객체(Object) 생성
		ScoreData korean = new ScoreData();
		korean.subject ="국어";
		korean.score = 80;
		korean.ranking = 13;
		
		System.out.println(korean.subject);
		System.out.println(korean.score);
		System.out.println(korean.ranking);
		
		// 국어 점수 : 80 석차 : 13
		System.out.println(korean.subject + " 점수 : " + korean.score + " 석차 : " + korean.ranking);
		
		ScoreData math = new ScoreData();
		math.subject = "수학";
		math.score = 95;
		math.ranking = 4;
		
		System.out.println(math.subject + " 점수 : " + math.score + " 석차 : " + math.ranking);
		
//		System.out.println(math.getClass());
		
		
	}

}
