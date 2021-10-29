package com.imtiyaz;

public class Program2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			
			int k = 4;
			for (int j = 1; j <= 4; j++) {
				if(j <= (k - i)) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
