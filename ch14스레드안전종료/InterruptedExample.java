package ch14스레드안전종료;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
		
		
	}
}
