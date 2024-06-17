package ex;

public class ThreadExtends extends Thread {
	
	private String message;
	
	public ThreadExtends(String message) {
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
