package com.assignment.training;
import java.util.Scanner;


public class BankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank balan=new Bank(15000.50);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the amount to be deposited");
			
			int depo=sc.nextInt();
			balan.deposit(depo);
			
			System.out.println("Your amount has deposited");
			System.out.println("Total balance  "+balan.balance());
		    System.exit(0);
			
		case 2:

			System.out.println("Enter the amount to be withdrawn");
			int wd=sc.nextInt();
			balan.withdraw(wd);
			System.out.println("Total balance  "+balan.balance());
			System.exit(0);
			
		case 3:
			System.out.println("THE bank balance is"+balan.balance);
			System.exit(0);
			
			break;
		case 4:
			System.out.println("Thankyou");
			System.exit(0);
		default :
			System.out.println("Wrong input");
			sc.close();
		}
	
		
		
		
		
		
	}

}
