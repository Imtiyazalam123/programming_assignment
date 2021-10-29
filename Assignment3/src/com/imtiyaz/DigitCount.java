package com.imtiyaz;

public class DigitCount {

	public static void main(String[] args) {
		
		int n = 1010;
		System.out.println(count(n));

	}
	public static int count(int n) {
		int c = 0;
		while(n > 0) {
			
			n = n/10;
			c++;
		}
		return c;
	}

}
