//write a program to check number is even or odd. if number is even calculate square. if it is odd calculate cube.
package com.imtiyaz;

import java.util.Scanner;

public class EvenOdd {

	public static int square(int n) {
	
		return n*n;
	}
	public static int cube(int n) {
		
		return n*n*n;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println("Square of "+ n +" is "+ square(n));
		else
			System.out.println("Cube of "+ n +" is "+ cube(n));
		
	}

}
