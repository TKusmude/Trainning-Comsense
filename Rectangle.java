package com.abstraction;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	void area() {
		int length,breadth,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		length = sc.nextInt();
		System.out.println("Enter The Breadth:");
		breadth = sc.nextInt();
		//area
		area = length * breadth;
		System.out.println("Area of Rectangle :"+area);
		
		
	}

}
