package largest_number;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int counter = 0, largest = Integer.MIN_VALUE, number;		// Declaring variables
		Scanner input = new Scanner(System.in);
		
		while (counter < 10) {
			System.out.print("Enter integer: ");		// Reading the number
			number = input.nextInt();	
			
			if (number >= largest) {					// Comparing it to the largest number up until now
				largest = number;
			}
			
			++counter;			// Incrementing counter
		}
		System.out.println("The largest number is " + largest);		// Printing the largest number
	}
}
