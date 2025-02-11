package com.Day1Homework;

public class Employee_Call {
	
	public static void main(String args[])
	{
		Employee e=new PartTimeEmployee("Yash","000",20000);
		System.out.println("----------Part-Time Employee---------");
		e.display();
		e.calculateBonus();
		e=new FullTimeEmployee("Tushar","111",400000);
		System.out.println("----------Full-Time Employee---------");
		e.display();
		e.calculateBonus();
		
	}
}
