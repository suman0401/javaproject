package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.Validation;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		Validation validation=new Validation();
		String values=null;
		try {
			values=validation.Checkname(name);
			System.out.println(values);
			System.out.println("Enter your password");
			String password=sc.next();
			try {
				values=validation.CheckPassword(password);
				System.out.println(values);
			}
			catch(TooShortException e) {
				System.out.println(e.getMessage());
			}
			catch(TooLongException e) {
				System.out.println(e.getMessage());
			}
		}
		catch(Exception e) {
			System.out.println("Other Exception");
			
		}
sc.close();
	}


}
