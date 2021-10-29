package com.imtiyaz;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		
		int a = 1;
		while(a < 50000) {
			
			int sum = 0;
			for(int i = 1; i <= a/2; i++) {
				
				if(a % i == 0)
					sum = sum + i;
			}
			if(a == sum)
				System.out.println(a);
			a++;
		}
	}

}
