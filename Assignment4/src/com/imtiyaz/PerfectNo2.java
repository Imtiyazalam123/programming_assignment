package com.imtiyaz;

import java.util.Scanner;

public class PerfectNo2 {

	public static boolean perfectNo(int n) {
		
		boolean b = false;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			
			if(n % i == 0)
				sum = sum + i;
		}
		if(n == sum)
			b = true;
		return b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number.");
		int n = sc.nextInt();
		System.out.println("Is " + n + " perfect number or not : " + perfectNo(n));
	}
}
