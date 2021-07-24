package parking_charges;

import java.util.Scanner;

public class Application {
	public static double calculateCharges(int hours) {
		double charge = 2;
		
		if(hours > 3) {
			while(hours != 3) {
				charge += 0.5;
				--hours;
				if(charge == 10) {
					break;
				}
			}
		}
		return charge;
	}
	
	public static void main(String[] args) {
		int hours;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the amount of hours your car will be parked for: ");
		hours = input.nextInt();
		
		System.out.printf("For %d hours, you will be charged $%.2f", hours, calculateCharges(hours));
	}
}
