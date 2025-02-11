package com.abstraction;
import java.util.Scanner;

public class Circle extends Shape {

	void area() {
		final double pi = 3.1417;
		double area;
		int radius;
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius = bc.nextInt();
		
		//area
		area = pi * radius * radius;
		System.out.println("Area of Circle :"+area);
		
		
		
		
	}
}
