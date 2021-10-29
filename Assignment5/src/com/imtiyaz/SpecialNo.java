//write a program to check whether the number is special number or not. if it is special number then calculate square of each digit.
package com.imtiyaz;

import java.util.Scanner;

public class SpecialNo {

	public static boolean isSpecialNo(int n) {
		boolean b = false;
		if(n == (sumOfDigit(n) + mulOfDigit(n)))
			b = true;
		return b;
	}
	public static int sumOfDigit(int n) {
		
		int sum = 0;
		while(n > 0) {
			int last = n % 10;
			sum = sum + last;
			n = n / 10;
		}
		return sum;
	}
	public static int mulOfDigit(int n) {
		
		int mul = 1;
		while(n > 0) {
			int last = n % 10;
			mul = mul * last;
			n = n / 10;
		}
		return mul;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		if(isSpecialNo(n)) {
			
			while(n > 0) {
				int last = n % 10;
				System.out.println(last * last);
				n = n / 10;
			}
		}	
		else
			System.out.println("Number is Special number.");
	}

}
