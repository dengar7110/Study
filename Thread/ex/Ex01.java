package ex;

public class Ex01 {

	public static void main(String[] args) {

		// 특정 문자열을 10번 출력하는 기능
//		ThreadExtends thread1 = new ThreadExtends("###");
//		ThreadExtends thread2 = new ThreadExtends("@@@");
//		thread1.start();
//		thread2.start();
		
		ThreadImplements threadImple = new ThreadImplements("###");
		
		Thread thread = new Thread(threadImple);
		thread.start();
		
		// 특정 Thread 기다리기
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("끝!!");
		
	}

}
