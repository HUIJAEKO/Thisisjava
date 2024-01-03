package ch14스레드동기화;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculate(Calculator calculate) {
		this.calculator = calculate;
	}
	
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
