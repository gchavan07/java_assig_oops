package vehical_Rental_System;

public class Rental_service_Class {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.calculateRental("rx100", "suzuki", 5);
		Bike b1 = new Bike();
		b1.calculateRental("discover", "Bajaj", 3);
		
		Car c = new Car();
		c.calculateRental("swift", "maruti suzuki", 2);
		
		Truck t = new Truck();
		t.calculateRental("chota hatti", "tata", 2);
	}
	

}
