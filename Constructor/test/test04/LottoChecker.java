package test.test04;

import java.util.Random;

public class LottoChecker {

	int[] check;
	
	LottoChecker(){
		Random ran = new Random();

		this.check = new int[6];
		for(int i = 0; i < this.check.length; i++) {
			int random = ran.nextInt(46);
			this.check[i] = random;			
		}
		
	}
	
	public int[] getCheck() {
		return check;
	}
	
	public void setCheck(int[] check) {
		this.check = check;
	}
	
	public void printCheck() {
		
		System.out.print("당첨번호 : ");
		for(int i = 0; i < this.check.length; i++) {
			System.out.print(this.check[i] + " ");
		} 
	}
	

	public void lottoCheck(Lotto lotto) {
		
		int[] manual = lotto.getManualLotto();
		int[] auto = lotto.getAutoLotto();
		
		int result = checking(manual, check);
		int result2 = checking(auto, check);
		
		printCheck();
		System.out.println();
		
		String manualStr = lotto.strManual();
		String grade = strGrade(result);
		System.out.println(manualStr + grade);
		
		String autoStr = lotto.strAuto();
		String grade2 = strGrade(result2);
		System.out.println(autoStr + grade2);
	}
	
	
	int checking(int[] a , int[] b) {
		
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < b.length; j++) {
				
				if(a[i] == b[j]) {
					count++;
				}
			}
		}
		
		
		return count;
		
	}
	
	String strGrade(int num){
		if(num == 0) {
			return "꽝";
		}else if(num == 1) {
			return "6등";
		}else if(num == 2) {
			return "5등";
		}else if(num == 3) {
			return "4등";
		}else if(num == 4) {
			return "3등";
		}else if(num == 5) {
			return "2등";
		}else if(num == 6) {
			return "1등";
		}
		
		return "잘못된입력";
	}
	
}
