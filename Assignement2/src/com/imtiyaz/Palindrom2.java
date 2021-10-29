package com.imtiyaz;

import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {

		int a = 100;
		int b = 1000;
		while(a <= b) {
			
			int reverse = 0;
			int n = a;
			while(n > 0) {
				
				int rem = n % 10;
				reverse = reverse * 10 + rem;
				n = n/10;
			}
			if(a == reverse) 
				System.out.println(a);
			
			a++;
		}
		
		

	}
}
