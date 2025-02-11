package com.ExceptionHandling.Example4;

import java.util.Scanner;

public class MultipleCatch {

	void calculate() {
		try {
			//Arithmetic Exception
			int numerator,denominator;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Numerator:");
			numerator = sc.nextInt();
			System.out.println("Enter The Denominator:");
			denominator = sc.nextInt();
			int divide = numerator / denominator ;
			System.out.println(divide);
			
			//NumberFormatException
			System.out.print("Enter a number: ");
			sc.nextLine();
	        String inputString = sc.nextLine();
			 int number = Integer.parseInt(inputString);
	         System.out.println("The integer value is: " + number);
			
		}catch(ArithmeticException ae) {
			System.out.println("Denominator Cannot be 0.");
		}
		catch (NumberFormatException e) {
            System.out.println("Invalid integer input. Please enter a valid number.");
        }
		
	}
	
	public static void main(String args[]) {
		
		MultipleCatch MC = new MultipleCatch();
		MC.calculate();
		
	}
}
