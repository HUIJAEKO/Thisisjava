package ch08인터페이스.defaultMethod;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("volume:" + this.volume);
	}
	
	private int memoryVolume;
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		}else{
			System.out.println("무음 해제합니다");
			setVolume(this.memoryVolume);
		}
	}
}
