package com.imtiyaz;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = in.nextInt();
		palindrom(n);
		
	}
	
	public static void palindrom(int n) {
		
		int org = n;
		int reverse = 0;
		while(n > 0) {
			
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		if(org == reverse)
			System.out.println("It is palindrom number.");
		else
			System.out.println("It is not palindrom number.");
	}

}
