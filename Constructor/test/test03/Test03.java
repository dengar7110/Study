package test.test03;

public class Test03 {

	public static void main(String[] args) {
//		1. OMR 카드
//		객관식 문제 5개를 체크 하는 OMR카드를 만들고, OMR 카드를 통해 점수를 출력하는 Class를 작성하세요.
//		두 개의 Class 를 만들어서 연동 하세요.
//		Class 설계는 아래 설명을 참조 하세요.
//		두 개의 Class 객체 생성은 모두 main 함수에서 수행하세요.
//		OmrCard 클래스
//		객관식 문제의 정답은 1~5까지 이다.
//		문제 개수는 총 5개이다.
//		학번과 이름을 입력 받는다.
//		순서대로 정답을 입력 받는 메소드를 만든다.
//		OmrCardReader 클래스
//		객체 생성 시 정답 5개를 입력 받아 정답 배열에 저장해둔다.
//		OmrCard 객체를 받아서 정답 배열과 OmrCard 카드 객체의 정답과 비교하여, 점수를 출력하세요 (100점 만점)
//
//		출력 예시는 아래와 같습니다.
//
//		이름 : 김인규
//		학번 : 1234567890
//		점수 : 60
		
		Omrcard omr = new Omrcard("홍정원","1234567890");
		
		omr.setAnswers(1, 2, 3, 4, 5);
		
		OmrCardReader reader = new OmrCardReader(1, 2, 3, 5, 5);
		
		reader.scoreCheck(omr);
		
		
	}

}
