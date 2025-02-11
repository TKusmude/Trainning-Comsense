package com.ExceptionHandling.Example6;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
	
	static void illAge() throws InvalidAgeException {
		Scanner sc  = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<18) {
			throw new InvalidAgeException();
		}
		System.out.println("Age:"+age);
	}
	
	public static void main(String args[]) {
		InvalidAgeException ie = new InvalidAgeException();
		try {
			ie.illAge();
		} catch (InvalidAgeException e) {
			
			System.out.println("Age is must be above 18");
		}
	}

}
