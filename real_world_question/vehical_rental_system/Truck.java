package vehical_Rental_System;

public class Truck extends AbstractClass_Vehical {

	@Override
	public void calculateRental(String name , String model,int days) {

		baseRent = days * 10000;
		System.out.println("Bike name : "+name);
		System.out.println("Bike model : "+model);
		System.out.println("Baserent of Bike : "+baseRent);
		
	}

}
