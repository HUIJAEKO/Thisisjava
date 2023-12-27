package ch11잔고부족예외처리;

public class InsufficientException extends Exception{
	public InsufficientException() {
	}
	
	public InsufficientException(String message){
		super(message);
	}
}
