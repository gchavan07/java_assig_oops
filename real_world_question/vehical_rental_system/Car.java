package vehical_Rental_System;

public class Car extends AbstractClass_Vehical {

	@Override
	public void calculateRental(String name , String model,int days) {

		baseRent = days * 5000;

		System.out.println("Bike name : "+name);
		System.out.println("Bike model : "+model);
		System.out.println("Baserent of Bike : "+baseRent);
		
	}
}
