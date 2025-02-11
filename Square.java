package com.abstraction;

import java.util.Scanner;

public class Square extends Shape{
	void area() {
		int side,area;
		System.out.println("Enter The side:");
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		//area
		area = side * side;
		System.out.println("Area of Square:"+area);
		
	}

}
