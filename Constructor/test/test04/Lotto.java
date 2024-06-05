package test.test04;

import java.util.Random;

public class Lotto {

	private int[] manualLotto;
	private int[] autoLotto;
	
	Lotto(int num1, int num2, int num3, int num4, int num5, int num6){
		this.manualLotto = new int[6];
		this.manualLotto = new int[] {num1, num2, num3, num4, num5, num6};
		
		
		this.autoLotto = new int[6];
		Random ran = new Random();
		
		for(int i = 0; i < this.autoLotto.length;i++) {
			int random = ran.nextInt(46);
			this.autoLotto[i] = random;
		}
	}
	


	public int[] getManualLotto() {
		return this.manualLotto;
	}


	public int[] getAutoLotto() {
		return this.autoLotto;
	}


	public void setManual(int num1, int num2, int num3, int num4, int num5, int num6) {
		this.manualLotto = new int[] {num1, num2, num3, num4, num5, num6};
	}
	
	
	public String strManual() {
		String manual = "";
		for(int i = 0; i < this.manualLotto.length; i++) {
			manual += manualLotto[i] + " ";
		}
		
		return manual;
	}

	public String strAuto() {
		String auto ="";
		for(int i = 0; i < this.autoLotto.length; i++) {
			auto += autoLotto[i] + " ";
		}
		
		return auto;
	}
	
	
}
