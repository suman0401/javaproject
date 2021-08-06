package com.userapp.service;

import com.userapp.exception.*;

public class Validation {
	String []initialname= {"Ram","Tom","Jack"};
	
	public String Checkname(String name) throws NameExistException{
		for(String name1:initialname) {
			if(name1.equals(name))	{
				throw new NameExistException("Name is already Exist ");
			}
				}
		return "Name is available";
	}
	public String CheckPassword(String password)
	throws TooLongException,TooShortException {
		if(password.length()<6) {
			throw new TooShortException("Password is too short");
		}
		if(password.length()>15) {
			throw new TooLongException("Password is too Long");
		}
		return "Password is Validdated";
	}
	

}
