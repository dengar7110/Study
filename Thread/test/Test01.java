package test;

public class Test01 {

	public static void main(String[] args) {
		
		Animal tiger = new Animal("어흥");
		Animal cow = new Animal("음메~");
		Animal horse = new Animal("히잉");
		
		Thread tigerThread = new Thread(tiger);
		Thread cowThread = new Thread(cow);
		Thread horseThread = new Thread(horse);
		
		
		tigerThread.start();
		cowThread.start();
		try {
			tigerThread.join();
			cowThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		horseThread.start();
		
	}
	
}
