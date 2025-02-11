package com.ExceptionHandling.Example1;

import java.util.Scanner;

public class Division {
	
	void division() {
		try {
		int numerator,denominator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numerator:");
		numerator = sc.nextInt();
		System.out.println("Enter The Denominator:");
		denominator = sc.nextInt();
		int divide = numerator / denominator ;
		System.out.println(divide);
	}catch(ArithmeticException ae) {
		System.out.println("Denominator Cannot be 0.");
	}
	}
	public static void main(String args[]) {
		
		Division dv = new Division();
		dv.division();
		
	}
}
