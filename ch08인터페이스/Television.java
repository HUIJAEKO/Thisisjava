package ch08인터페이스;

public class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
