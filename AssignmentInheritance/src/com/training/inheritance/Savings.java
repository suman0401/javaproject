package com.training.inheritance;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int amount) {
		
		System.out.println("Savings Withdraw");
	
		// TODO Auto-generated method stub
		balance=balance-amount-100;
		//super.withdraw(amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("Savings Deposit");
		// TODO Auto-generated method stub
		balance+=amount+100;
		//super.deposit(amount);
	}

}
