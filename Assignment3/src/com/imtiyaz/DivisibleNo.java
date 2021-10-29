package com.imtiyaz;

public class DivisibleNo {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 30;
		
		while(a < 30) {
			
			if(a % 2 == 0 && a % 4 == 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}
