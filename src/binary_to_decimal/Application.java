package binary_to_decimal;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int binary_number, decimal_number = 0, multiplier = 1;		// Declaring variables
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a binary number: ");	// Reading the binary number
		binary_number = input.nextInt();
							// Printing the 1st part of the result, so I don't need another variable for binary_number
		System.out.printf("The decimal number of %d is ", binary_number);
		
		while (binary_number != 0) {		// Begin the loop
			if (binary_number % 10 == 1) {		// Do the calculation only if digit is 1
				decimal_number += multiplier;
			}
			multiplier += multiplier;			// In either case, increase the multiplier...
			binary_number = binary_number / 10;	// ...and get rid of the already calculated digit 
		}
		System.out.print(decimal_number);		// Finish printing the result
	}
}
