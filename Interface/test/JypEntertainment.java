package test;

public class JypEntertainment {

	// 소속 연예인수, 영업이익
	private int artistCount; 
	private int operatingProfit;
	
	// 연기자 오디션
	public void actorAudition(Act applicant) {
		applicant.methodActing();
	}
	
	// 아이돌 오디션
	public void idolAudition(Sing applicant) {
		applicant.singASong();
	}
	
}
