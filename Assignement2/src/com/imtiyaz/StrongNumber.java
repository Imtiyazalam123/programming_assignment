package com.imtiyaz;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = in.nextInt();
		int org = n; 
		int sumFact = 0;
		
		while(n > 0) {
			int rem = n % 10;
			int fact = 1;
			while(rem > 0) {
				
				fact = fact * rem;
				rem--;
			}
			sumFact = sumFact + fact;
			
			n = n /10;
		}
		if(org == sumFact)
			System.out.println("This number is strong number.");
		else
			System.out.println("This number is not strong number.");
	}

}
