package com.abstraction;

public class Child extends Parent{

	@Override
	void job() {
		System.out.println("Get Job");
	}
	public static void main(String args[]) {
		Child ch = new Child();
		ch.job();
	}
	
}
