package palindrome;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int number;						// Declaring variables
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 5-digit integer: ");		// Reading integer
		number = input.nextInt();	
																// Checking if the number is a palindrome
		if (number % 10 == number / 10000 && number / 1000 % 10 == number % 100 /10) {
			System.out.printf("%d is a palindrome", number);	// Print result
		}
		else {
			System.out.printf("%d is not a palindrome", number);
		}
	}
}
