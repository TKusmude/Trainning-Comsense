package com.ExceptionHandling.Example5;

import java.util.Scanner;

public class IllArgExc {

	void illArg()  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		if(age<0) {
			throw new IllegalArgumentException();
		}
		System.out.println("Your Age:"+age);
		
		}
	
	public static void main(String args[]) {
		IllArgExc IE = new IllArgExc();
		try {
		IE.illArg();
		}catch(IllegalArgumentException IAE) {
			System.out.println("Dont enter the negative values. ");
		}finally {
			System.out.println("Final Block is Executed.");
		}
	}
}
