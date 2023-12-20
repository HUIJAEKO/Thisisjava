package ch08인터페이스.typeChange;

public class CarExample {
	public static void main(String[] args) {
	Car myCar = new Car();
	
	myCar.run();
	
	myCar.tire1 = new KumgoTire();
	myCar.tire2 = new KumgoTire();
	
	myCar.run();
	
	}
}
