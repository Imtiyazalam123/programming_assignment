package com.imtiyaz;

import java.util.Scanner;

public class ArmstrongNo {

	public static int digitCount(int n) {
		int count = 0;
		while(n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static int power(int base, int exp) {
		
		int pow = 1;
		while(exp > 0) {
			
			pow = pow * base;
			exp--;
		}
		return pow;
	} 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number.");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int digit = digitCount(n);
		while(n > 0) {
			
			int rem = n % 10;
			sum = sum + power(rem, digit); 
			n = n / 10;
		}
		if(temp == sum)
			System.out.println("This is Armstrong No.");
		else
			System.out.println("This is not armstrong No.");
	}

}
