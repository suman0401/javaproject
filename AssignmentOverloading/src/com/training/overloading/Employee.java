package com.training.overloading;

public class Employee {
     String name;
     double basicAllowance,carAllowance,houseAllowance;
     
     public Employee(double basicAllowance) {
    	 
    	
         this.basicAllowance=basicAllowance; 	 
     }

	public Employee(double basicAllowance, double carAllowance) {
		
		
		
		
	    this.basicAllowance = basicAllowance; 
		this.carAllowance = carAllowance;
	}

	public Employee(double basicAllowance, double carAllowance, double houseAllowance) {
		
		
		
		 
		 this.basicAllowance = basicAllowance;
		  
		  this.carAllowance = carAllowance;
		 
		  this.houseAllowance = houseAllowance;
		 
	}
	void getDetails() {
		if(name.equals("Programmer")) {
			System.out.println("ONE "+basicAllowance);
		}
		if(name.equals("Manager")) {
			System.out.println("TWO "+basicAllowance+carAllowance);
		}
		if(name.equals("Director")) {
			System.out.println("Three "+basicAllowance+carAllowance+houseAllowance);
		}
	}
     
}
