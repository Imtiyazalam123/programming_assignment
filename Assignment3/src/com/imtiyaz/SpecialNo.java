package com.imtiyaz;

public class SpecialNo {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 100;
		
		while(a < b) {
			
			int add = 0;
			int mul = 1;
			int n = a;
			while(n > 0) {
				int rem = n % 10;
				add = add + rem;
				mul = mul * rem;
				n = n/10;
			}
			if((add + mul) == a)
				System.out.println(a);
			
			a++;
		}

	}

}
