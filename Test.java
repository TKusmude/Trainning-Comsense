package com.abstraction;

public class Test {
	
	public static void main(String args[]) {
		Shape sp = new Circle();
		sp.area();
		sp = new Rectangle();
		sp.area();
		sp = new Square();
		sp.area();
	} 
}
