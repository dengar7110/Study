package ex.ex02;

public class Ex02 {
	
	public static void main(String[] args) {
	
		// 구직자가 기업의 면접을 보는 상황
		JobApplicant applicant = new JobApplicant();
		
		Naver naver = new Naver();
		
		naver.recruitJavaProgrammer(applicant);
		
		
	}
	

}
