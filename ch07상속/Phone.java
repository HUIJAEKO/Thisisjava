package ch07상속;

public abstract class Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void turnon() {
		System.out.println("전원을 켭니다");
	}
	void turnooff() {
		System.out.println("전원을 켭니다");
		
		
	}
	
}
