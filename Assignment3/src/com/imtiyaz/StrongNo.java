package com.imtiyaz;

public class StrongNo {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1001;
		
		while(a < b) {
			int n = a;
			int factSum = 0;
			while(n > 0) {
				int rem = n % 10;
				factSum = factSum + factorial(rem);
				n = n/10;
			}
			if(factSum == a)
				System.out.println(a);
			a++;
			
		}
	}
	public static int factorial(int n) {
		
		int f = 1;
		while (n > 0) {
			f = f * n;
			n--;
		}
		return f;
	}

}
