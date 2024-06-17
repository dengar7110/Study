package test;

public class Animal implements Runnable {

	// 울음 소리
	public String cry;
	
	public Animal(String cry) {
		this.cry = cry;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(cry);
		}
		
	}
}
