package com.assignment.training;

public class VehicleMain {
	String name;
    String model;
	int price;
	
	VehicleMain(String name,String model,int price){
		this.name=name;
		this.model=model;
        this.price=price;
		
	}
	void getDetails() {
		System.out.println("Name "+name);
	    System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
}
