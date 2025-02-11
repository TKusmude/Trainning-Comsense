package com.Day1Homework;
 
import java.util.Scanner;
 
abstract class Product
{
	String productName;
	int price;
	Product(int price,String productName)
	{
		this.price=price;
		this.productName=productName;
	}
	
	abstract double getDiscount();
	
}
class Electroins extends Product
{
	Electroins(int price, String productName) {
		super(price, productName);
		// TODO Auto-generated constructor stub
	}
 
	double getDiscount()
	{
		double discount=price*0.10;
		return price-discount;
	}
}
class Clothings extends Product
{
	Clothings(int price, String productName) {
		super(price, productName);
		// TODO Auto-generated constructor stub
	}
 
	double getDiscount()
	{
		double discount=price*0.20;
		return price-discount;
	}
}
public class OnlineShop {
 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Product p;
		int ch=0;
		do {
			System.out.println("Enter 1 for Electronic item");
			System.out.println("Enter 2 for clothes");
			System.out.print("Enter Your Type of Product : ");
			ch=sc.nextInt();
			
			if(ch==1)
			{
				System.out.println("enter Product Name..............");
				sc.nextLine();
				String productName=sc.nextLine();
				System.out.println("enter price..............");
				int price=sc.nextInt();
				p=new Electroins(price,productName);
				System.out.println("After discount...........");
				System.out.println(p.getDiscount());
			}else if(ch==2) {
				System.out.println("enter Product Name..............");
				String productName=sc.nextLine();
				System.out.println("enter price..............");
				int price=sc.nextInt();
				p=new Clothings(price,productName);
				System.out.println("After discount...........");
				System.out.println(p.getDiscount());
			}else {
				p=null;
			}
			
		}while(ch!=1 && ch!=2);
		
	}
 
}