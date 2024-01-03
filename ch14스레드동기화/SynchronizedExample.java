package ch14스레드동기화;

public class SynchronizedExample {

	public static void main(String[] args) {
		
			Calculator calculator = new Calculator();
			
			User1Thread user1Thread = new User1Thread();
			user1Thread.setCalculate(calculator);
			user1Thread.start();
			
			User2Thread user2Thread = new User2Thread();
			user2Thread.setCalculate(calculator);
			user2Thread.start();
	}

}
