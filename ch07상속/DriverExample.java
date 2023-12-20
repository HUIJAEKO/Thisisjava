package ch07상속;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.ride(bus);
		
		Taxi taxi = new Taxi();
		driver.ride(taxi);
	}

}
