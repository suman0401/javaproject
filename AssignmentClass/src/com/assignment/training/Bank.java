package com.assignment.training;

public class Bank {
	double balance;

	
	Bank(double balance){
		this.balance=balance;
	}
    public void withdraw(int withdraw){
    	if(withdraw<=balance) {
    		balance=balance-withdraw;
    	}
    	else {
    		System.out.println("Insufficient fund");
    	}
    	
    }
    public void deposit(int deposit) {
    	balance=balance+deposit;
    }
    public double balance() {
    	return balance;
    }
}
