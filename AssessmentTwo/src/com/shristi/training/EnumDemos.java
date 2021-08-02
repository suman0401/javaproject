package com.shristi.training;

import java.util.Scanner;

enum Socialmedia {
	FACEBOOK("HI", "Good morning"),
	TWITTER("poppy", "Interest in automobiles"),
	WATSAPP("Hello", "Welcome");

	String name, description;

	Socialmedia(String name, String description) {
		this.name = name;
		this.description = description;
	}
}

public class EnumDemos {
	public static void main(String [] args) {

	System.out.println("Where do you want to create");
	Scanner sc = new Scanner(System.in);
	String Check = sc.next();
	Socialmedia a=null;
	Socialmedia[] socialmedia=Socialmedia.values();
	for(Socialmedia media:socialmedia)
	{
		if (Check.equals(media.name())) {
		
			a = Socialmedia.valueOf(Check);
		}
	}
	switch(a)
	{
	case FACEBOOK:
		System.out.println("Your choise is FACEBOOK");
		System.out.println("Name "+a.name);
		System.out.println("DESC "+a.description);
		
	case TWITTER:
		System.out.println("Your choise is TWITTER");
		System.out.println("Name "+a.name);
		System.out.println("DESC "+a.description);
	
	case WATSAPP:
		System.out.println("Your choise is WATSAPP");
		System.out.println("Name "+a.name);
		System.out.println("DESC "+a.description);
		
		
	}

}
}
