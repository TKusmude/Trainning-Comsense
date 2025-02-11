package com.Day1Homework;

abstract class Employee
{
	double salary;
	String name,id;
	Employee(String name,String id,double salary)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	abstract void calculateBonus();
	void display()
	{
		System.out.println("Employee name : "+this.name);
		System.out.println("Employee id : "+this.id);
		System.out.println("employee Salary : "+this.salary);
	}
	
}
class PartTimeEmployee extends Employee
{
	PartTimeEmployee(String name, String id, double salary) {
		super(name, id, salary);
	}
 
	void calculateBonus()
	{
		double bonus=salary*0.10;
		System.out.println("Bounus:"+bonus);
	}
}
class FullTimeEmployee extends Employee
{
	FullTimeEmployee(String name, String id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}
 
	void calculateBonus()
	{
		double bonus=salary*0.20;
		System.out.println("Bounus:"+bonus);
	}
}
