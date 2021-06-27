package compound_interest;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int start, year, i; 
		Scanner input = new Scanner(System.in);			// Declaring variables
		
		System.out.print("Enter initial sum: ");		// Getting the values
		start = input.nextInt();
		System.out.print("Enter for how many years you intend to keep the money in the bank: ");
		year = input.nextInt();
		
		System.out.println("Year:\t\tSum:");
		
		for(i = 1; i <= year; i++) {				// Calculating the sum of money
			System.out.printf("%d\t\t%.2f\n", i, start * Math.pow(1.05, i));
		}
	}
}
