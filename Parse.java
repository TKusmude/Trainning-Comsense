package com.ExceptionHandling.Example3;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputString = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input. Please enter a valid number.");
        }
    }
}