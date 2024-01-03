package ch14스레드풀;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		String[][] mails = new String[10][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "보내는사람";
			mails[i][1] = "받는사람" + i;
			mails[i][2] = "내용";
		}
		
		ExecutorService executeService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<10; i++) {
			final int idx =i;
			executeService.execute(new Runnable(){
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println(thread.getName() + ":" + from + "가" + to + "에게:" + content );
				}
			});
			
		}
		executeService.shutdown();
	}

}
