package com.shristi.training;

public abstract class vehicle extends Accessories{
	String model;
	double price;
	public vehicle(String model,double price){
		super();
		this.model=model;
		this.price=price;

}
	abstract void getMilage();
	void getDetails() {
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
}
