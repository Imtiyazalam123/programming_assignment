//write a program to print armstrong number between 1 to 50000.
package com.imtiyaz;

public class ArmstrongNo {

	public static int countDigit(int n) {
		int c = 0;
		while(n > 0) {
			n = n/10;
			c++;
		}
		return c;
	}
	public static int power(int base, int exp) {
		
		int mul = 1;
		while(exp > 0) {
			
			mul = mul * base;
			exp--;
		}
		return mul;
	}
	public static void main(String[] args) {
	
		int a = 2;	
		while(a < 50000) {
			
			int sum = 0;
			int n = a;
			int digit = countDigit(a);
			while(n > 0) {
				int rem = n % 10;
				sum = sum + power(rem, digit);
				n = n / 10;
			}
			if(a == sum)
				System.out.println(a);
			a++;
		}
	}

}
