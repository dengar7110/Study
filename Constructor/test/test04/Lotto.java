package test.test04;

import java.util.Random;

public class Lotto {

	private int[] manualLotto;
	private int[] autoLotto;
	
	public Lotto(int num1, int num2, int num3, int num4, int num5, int num6){
		manualLotto = new int[] {num1, num2, num3, num4, num5, num6};
		
		
		autoLotto = new int[6];
		Random ran = new Random();
		
		for(int i = 0; i < autoLotto.length;i++) {
			int random = ran.nextInt(46);
			autoLotto[i] = random;
		}
	}
	
	public int[] getManualLotto() {
		return manualLotto;
	}

	public int[] getAutoLotto() {
		return autoLotto;
	}
	
	public void setManual(int num1, int num2, int num3, int num4, int num5, int num6) {
		manualLotto = new int[] {num1, num2, num3, num4, num5, num6};
	}
	
	
	public String strManual() {
		String manual = "";
		for(int i = 0; i < manualLotto.length; i++) {
			manual += manualLotto[i] + " ";
		}
		
		return manual;
	}

	public String strAuto() {
		String auto ="";
		for(int i = 0; i < autoLotto.length; i++) {
			auto += autoLotto[i] + " ";
		}
		
		return auto;
	}
	
	
}
