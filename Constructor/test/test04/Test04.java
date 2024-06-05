package test.test04;

public class Test04 {

	public static void main(String[] args) {

//		1. 로또
//		로또를 발행하고, 발행한 로또의 당첨 여부를 확인하는 Class를 작성하세요.
//		두 개의 Class를 만들어서 연동하세요.
//		Class 설계는 아래 설명을 참조하세요.
//		두 개의 Class 객체 생성은 모두 main 함수에서 수행하세요.
//		로또 규칙
//		1 부터 45 까지 중복 되지 않는 6개의 수를 선택한다.
//		수동 선택 - 1부터 45까지의 숫자 중 6개를 직접 선택
//		자동 선택 - 1부터 45까지의 숫자를 랜덤으로 선택
//		로또 번호를 추첨 해서 맞는 개수 만큼 등수를 매긴다.
//		6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 2개 : 5등 나머지: 꽝
//
//		Lotto Class
//		로또 번호를 수동으로 받아서 저장한다.
//		로또 번호를 자동으로 생성해서 저장 한다.
//		LottoChecker Class
//		로또 당첨 확인 클래스에서 1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
//		로또 객체를 입력 받아서 로또 당첨 확인 클래스를 통해 당첨여부를 확인한다.
//		당첨 번호 : 41 4 11 20 38 45 
//		3 9 14 23 43 32 꽝!
//		1 14 45 11 16 22 5등
//	
		
		Lotto lotto = new Lotto(1, 3, 5, 7, 23, 12);
		String manual = lotto.strManual();
		System.out.println(manual);
		String auto = lotto.strAuto();
		System.out.println(auto);
		
		LottoChecker checker = new LottoChecker();
		checker.lottoCheck(lotto);
		
	}

}
