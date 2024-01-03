package ch14멀티스레드;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try{
						Thread.sleep(1000);
					}catch(Exception e) {
					}
				}	
			}
		});
		
		thread.start();
			
		for(int i1=0; i1<5; i1++) {
			System.out.println("띠리링");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}
