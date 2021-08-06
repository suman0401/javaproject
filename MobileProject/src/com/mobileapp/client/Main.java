package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobService;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobService mob = new MobService();
		for (Mobile m : mob.getAll()) {
			System.out.println(m);
		}
		Scanner sc = new Scanner(System.in);
		System.err.println();
		System.out.println("Enter Mobile ID");
		int id = sc.nextInt();
		try {
			System.out.println(mob.getbyMobileId(id));
			System.out.println();
			System.out.println("Enter Mobile Brand");
			String brand = sc.next();
			for (Mobile m1 : mob.getbyBrand(brand)) {
				if (m1 != null) {
					System.out.println(m1);
				}
			}
			System.out.println();
		} catch (MobException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
