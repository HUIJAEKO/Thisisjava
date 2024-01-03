package ch14스레드동기화;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculate(Calculator calculate) {
		this.calculator = calculate;
	}
	
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
