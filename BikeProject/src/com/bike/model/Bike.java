package com.bike.model;

public class Bike {
	String name,colour,model;
	double price;
	public Bike(String name, String colour, String model, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.model = model;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", colour=" + colour + ", model=" + model + ", price=" + price + "]";
	}
	
	

}
