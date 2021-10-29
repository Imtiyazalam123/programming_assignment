//write a program to check whether the number is armstrong or not. if it is armstrong then calculate sum of odd digit.
package com.imtiyaz;

import java.util.Scanner;

public class ArmstronNo2 {

	public static boolean isArmstrong(int n) {
		
		boolean b = false;
		int digitCount = countDigit(n);
		int tem = n;
		int sum = 0;
		while(n > 0) {
			int last = n % 10;
			sum = sum + power(last, digitCount);
			n = n / 10;
		}
		if(tem == sum)
			b = true;
		return b;
	}
	public static int power(int base, int exp) {
		
		int pow = 1;
		while(exp > 0) {
			 
			pow = pow * base;
			exp--;
		}
		return pow;
	}
	public static int countDigit(int n) {
		int c = 0;
		while(n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
	public static int oddDigitSum(int n) {
		
		int sum = 0;
		while(n > 0) {
			int last = n % 10;
			if(last % 2 != 0)
				sum = sum + last;
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		if(isArmstrong(n))
			System.out.println(oddDigitSum(n));
		else
			System.out.println("Number is Not Armstrong.");
			
	}
}
