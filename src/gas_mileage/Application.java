package gas_mileage;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {			// Declaring variables
		int miles =  0, total_miles = 0, total_gallons = 0, gallons = 0; char trip_count = '0'; double mpg = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter new trip by pressing 1");		// Determining whether to start the program
		trip_count = input.next().charAt(0);
		
		if (trip_count == '1') {
			while (trip_count == '1') {
				System.out.print("Enter the miles travelled during the trip: ");	// How many miles
				miles = input.nextInt();
				total_miles += miles;
				
				System.out.print("Enter the gallons travelled during the trip: ");	// How many gallons
				gallons = input.nextInt();
				total_gallons += gallons;
																					// Printing the nr. of miles and gallons
				System.out.printf("During this trip, %d miles were travelled and %d gallons were spent", miles, gallons);
				
				mpg = (double) total_miles/total_gallons;							// Determining the total mile per gallon
				System.out.printf("\nTotal number of miles per gallon: %.2f", mpg);
				
				System.out.println("\n\nEnter new trip by pressing '1'");			// Reinitiating the program, if necessary
				trip_count = input.next().charAt(0);
			}
			
			System.out.println("~program finished~");								// Announcing that the program has finished
		}
		else {
			System.out.println("\nERROR: NO TRIPS WERE ENTERED");						// If no trips are entered initially
		}
	}
}
