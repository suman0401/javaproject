package com.bike.client;

import java.util.Scanner;

import com.bike.exception.BikeNotFoundException;
import com.bike.model.Bike;
import com.bike.service.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BikeService bk = new BikeService();
		for (Bike b : bk.getAll()) {
			System.out.println(b);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Bike Model");
		String model = sc.next();
		try {
			System.out.println("Enter Bike name");
			System.out.println(bk.getbyModel(model));
			System.out.println();
			
			String name = sc.next();
			for (Bike b1 : bk.getbyName(name)) {
				if (b1 != null) {
					System.out.println(b1);
				}
				else {
					System.out.println("Wrong input");
				}
			}
			System.out.println();
		} catch (BikeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}
	}


