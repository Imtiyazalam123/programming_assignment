//write a program to check whether the number is perfect or not. if number is perfect then calculate square.
package com.imtiyaz;

import java.util.Scanner;

public class PerfectNo {

	public static int square(int n) {
		return n*n;
	}
	public static boolean perfectNo(int n) {
		boolean b = false;
		int temp = n;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			
			if(n % i == 0)
				sum = sum + i;
		}
		if(temp == sum)
			b = true;
		
		return b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		
		if(perfectNo(n))
			System.out.print("Square of perfect No "+n+ " is " + square(n));
		else
			System.out.println("Number is not perfect.");
	}
}