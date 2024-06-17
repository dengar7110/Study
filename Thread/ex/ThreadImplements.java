package ex;

public class ThreadImplements implements Runnable {

	private String message;
	
	public ThreadImplements(String message) {
		this.message = message;
	}
	@Override
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(message);
		}
	}
	
	
	
}
