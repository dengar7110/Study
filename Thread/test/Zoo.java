package test;

public class Zoo implements Runnable {

	public String sound;
	
	public Zoo(String sound) {
		this.sound = sound;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(sound);
		}
		
	}
}
