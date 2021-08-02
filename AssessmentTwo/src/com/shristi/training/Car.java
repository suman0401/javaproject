package com.shristi.training;

public  class Car extends vehicle {
   public Car(String model,double price) {
	   super(model,price);
   }

	
	void internals() {
		// TODO Auto-generated method stub
		System.out.println("This is internals");

	}

	
	void externals() {
		// TODO Auto-generated method stub
		System.out.println("This is externals");

	}
	void getMilage() {
		System.out.println("Milage is shown here");
	}
	

}
