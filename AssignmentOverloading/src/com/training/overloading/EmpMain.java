package com.training.overloading;
import java.util.Scanner; 

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc=new Scanner(System.in);
        Employee emp=new Employee(4702.49);
		
		  Employee emp1=new Employee(802.50d,528.59d); Employee emp2=new
		  Employee(7493.40d,75027.85d,538.58d);
		 
  
        System.out.println("Enter the name");
        emp.name=sc.next();
        
        
        emp.getDetails();
		
		  emp1.getDetails();
		  emp2.getDetails();
		 
        sc.close();
        
        
	}

}
