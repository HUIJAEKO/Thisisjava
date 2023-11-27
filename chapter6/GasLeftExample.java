package ch06;

public class GasLeftExample {
		public static void main(String[] args) {
	
	GasLeft car = new GasLeft();
	
	car.gasLeft(5);
	
	if(car.taf()) {
		System.out.println("출발합니다");
	}
	
	car.run();
	System.out.println("종료합니다");
	}
}
