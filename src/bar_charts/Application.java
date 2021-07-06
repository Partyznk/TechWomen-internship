package bar_charts;

import java.util.Scanner;

class Asterisk {						// Class used for printing the charts
	public String getChart(int number) {// Method for printing the charts
		int i = 1; String chart = "";
		
		for(i = 1; i <= number; i++) {	// Adding the proper number of * for a number
			chart += "*";
		}
		
		chart += "\n";					// Adding a new line after every line of asterisks
		
		return chart;
	}
}

public class Application {
	public static void main(String[] args) {
		int number, i = 1; String drawing = "\n";		// Declaring the variables
		Scanner input = new Scanner(System.in);
		Asterisk asterisk = new Asterisk();
		
		for(i = 1; i <= 5; i++) {					// Reading the variables
			System.out.print("Please enter an integer between 1 and 30: ");
			number = input.nextInt();
			
			drawing += asterisk.getChart(number);	// Calling the method
		}
		
		System.out.print(drawing);					// Printing the charts
	}
}
