package com.ExceptionHandling.Example7;

import java.util.Scanner;

public class InsufficientFundsException extends Exception {
	
	void withdraw(double amount,double withAmount) throws InsufficientFundsException {
		
		if(amount>withAmount) {
			amount =- withAmount;
		}
		else {
			throw new InsufficientFundsException();
		}
		System.out.println("Total Available Amount:"+amount);
	}
	
	public static void main(String args[]) {
		InsufficientFundsException ie = new InsufficientFundsException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdrawal Amount:");
		double withAmount = sc.nextDouble();
		try {
			ie.withdraw(10000, withAmount);
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient Balance");
		}
		
	}

}
