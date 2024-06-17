package test;

public class Test01 {

	public static void main(String[] args) {
		
		Zoo tiger = new Zoo("어흥");
		Zoo cow = new Zoo("음메~");
		Zoo horse = new Zoo("히잉");
		
		Thread thread1 = new Thread(tiger);
		Thread thread2 = new Thread(cow);
		Thread thread3 = new Thread(horse);
		
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread3.start();
		

		
		
		
	}
	
}
