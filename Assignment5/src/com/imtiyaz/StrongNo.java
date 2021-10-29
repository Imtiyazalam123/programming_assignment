//write a program to check whether the number is strong or not. if it is strong number calculate sum of even digit. 
package com.imtiyaz;

import java.util.Scanner;

public class StrongNo {

	
	public static boolean strongNumber(int n) {
		boolean b = false;
		int temp = n;
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum = sum + factorial(rem);
			n = n / 10;
		}
		if(temp == sum)
			b = true;
		return b;
	}
	public static int factorial(int n) {
		
		int f = 1;
		while(n > 0) {
			
			f = f * n;
			n--;
		}
		return f;
	}
	public static int sumOfEvenDigit(int n) {
		
		int s = 0;
		while(n > 0) {
			
			int rem = n % 10;
			if(rem % 2 == 0)
				s = s + rem;
			n = n / 10;
		}
		return s;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		int sumEvenDi = 0;
		if(strongNumber(n))
			System.out.println(sumOfEvenDigit(n));
		else
			System.out.println("Number is not Strong number.");
			
	}

}
