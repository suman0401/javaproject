package com.assignment.training;
import java.util.Scanner;
public class ATMclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice S/C");
		String accType=sc.next();
		System.out.println("Enter your choice \n 1.withdraw \n 2.Deposit \n 3.Balance \n 4.Exit");
		
		int num=sc.nextInt();
		Account account;
		
		if(accType.equals("S"))  {
			account=new Savings(4000);
			
			
		}
		else if(accType.equals("C")) {
			account=new Current(4000);
			//Current current= (Current)account;
			
			//current.checkInterest();
		}
		else {
			/*
			 * Savings acc=(Savings)account; acc.getBalance(4000);
			 */
			account=new Savings(4000);
			
		}
		switch(num) {
		case 1:
		System.out.println("Enter the amount to be withdrawn");
		int wd=sc.nextInt();
		account.withdraw(wd);
		System.out.println("Balance "+account.getBalance());
		System.exit(0);
		case 2:
		
		System.out.println("Enter the amount to be deposited");
		int dp=sc.nextInt();
		account.deposit(dp);
		System.out.println("Balance "+account.getBalance());
		System.exit(0);
		
		case 3: 
			System.out.println("Balance is "+account.getBalance());
			System.exit(0);
		
		case 4:
			System.out.println("Thank you");
			System.exit(0);
		default :
			System.out.println("Wrong input");
		
sc.close();
	}

}
}
