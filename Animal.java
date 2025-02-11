package com.Day1Homework;


public abstract class Animal {
	
	String name;
	abstract void makeSound();
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Barks!!!");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meows!!!");
	}
}