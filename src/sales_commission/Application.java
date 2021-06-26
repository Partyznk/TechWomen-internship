package sales_commission;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		char list_counter; int item; double salary = 200;	// Declaring variables
		Scanner input = new Scanner(System.in);

		System.out.println("If you want to input a new item list, enter 0.\nOtherwise, enter anything else.");
		list_counter = input.next().charAt(0);		// Initializing the counting process

		if (list_counter == '0') {			// Beginning the process
			while (list_counter == '0') {
				System.out.print("If you wish to enter a new list, enter 5. If you wish to end the program, enter 0.\nOtherwise, enter item (1, 2, 3, 4): ");
				item = input.nextInt();			// Getting the item/comand

				switch (item) {				// Checking if the item/comand correspons to any of the given values
				case 1:
					salary += 0.09 * 239.99;		// case 1-4: increasing variable salary
					break;
				case 2:
					salary += 0.09 * 129.75;
					break;
				case 3:
					salary += 0.09 * 99.95;
					break;
				case 4:
					salary += 0.09 * 350.89;
					break;
				case 5: 					// case 5: printing salary and reinitializing it to 200
					System.out.printf("\nThe salary of this person this week is $%.2f\n\n", salary);
					salary = 200;
					break;
				case 0: 					// case 0: ending the program
					list_counter = '1';
					break;
				default:					// default: giving an error to the user
					System.out.println("Invalid number. Please try again.");
				}
			}								// Announcing the user the program has ended
			System.out.println("All lists were entered. Program has ended.");
		} 
		else {								// If the program has not been initialized from the start
			System.out.println("~ * no lists were entered ~ *");
		}
	}
}
