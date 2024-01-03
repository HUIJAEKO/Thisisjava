package ch14스레드안전종료;

public class PrintThread extends Thread{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				//Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("정리중");
			System.out.println("종료");
		}
	}
	
