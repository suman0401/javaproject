package com.assignment.training;

public abstract  class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(int amount); /*
										 * { //System.out.println("Withdrawing "+amount); //balance=balance-amount;
										 * System.out.println("IN ABC BANK"); }
										 */

	abstract void deposit(int amount);/*
										 * {
										 * 
										 * System.out.println("Deposit "+amount); balance+=amount;
										 * 
										 * System.out.println("IN ABC BANK"); }
										 */

	double getBalance() {
		return balance;
	}
}
