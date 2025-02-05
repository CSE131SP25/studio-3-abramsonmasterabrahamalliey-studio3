package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = in.nextInt();
		
		boolean[] numbers = new boolean[n];
		
		/*
		 * 
		 */
		
		//for(int j = 2; j < n; j++) {
		//	for(int i = 0; i < numbers.length; i = i + j) {
		//		numbers[i + j] = true;
		//		System.out.println(numbers[i + j]);
		//	}
		//}
		for(int i = 2; i < n; i++) {
			int j = 2;
			while(i*j < n) {
				numbers[i*j] = true;
				j++;
			}
	    // System.out.println(numbers[i]);
		}
		for(int i = 0; i < (numbers.length); i++) {
			//numbers[i] = i+2;
			System.out.println("" + numbers[i] + (i+2));
			
			
		}
		
	}

}