package ch07상속;

public class SmartPhone extends Phone {
	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("검색합니다.");
	}
}
