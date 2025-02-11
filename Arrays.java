package com.ExceptionHandling.Example2;

import java.util.Scanner;

public class Arrays {
	
	int arr[] = new int[5];
	
	void getArray() {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Elements:");
		for(int i=0; i<=5;i++) {
			 arr[i] =sc.nextInt();
		}
		sc.close();
		for(int num : arr) {
			System.out.println(num+" ");
		}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please Enter Limited Elements!!");
		}
	}

	public static void main(String args[]) {
		
		Arrays ar = new Arrays();
		ar.getArray();
	}

}
