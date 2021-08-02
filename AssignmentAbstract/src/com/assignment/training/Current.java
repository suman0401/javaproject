package com.assignment.training;

public  class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Current withdraw");
		// TODO Auto-generated method stub
		balance-=amount;
		//super.withdraw(amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("Current Deposit");
		// TODO Auto-generated method stub
		balance+=amount;
		//super.deposit(amount);
	}
	/*
	 * void checkInterest() { System.out.println("checking interest"); }
	 */
}
