package datetest;

import java.util.Scanner;

class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {		// Constructor
		if (day > 0) {
			if (day < 32) {
				this.day = day;
			}
		}
		if (month > 0) {
			if (month < 13) {
				this.month = month;
			}
		}
		this.year = year;
	}
	
	public void setDay(int day) {		// Setters for all variables
		if (day > 0) {
			if (day < 32) {
				this.day = day;
			}
		}
	}
	
	public void setMonth(int month) {
		if (month > 0) {
			if (month < 13) {
				this.month = month;
			}
		}
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDay() {		// Getters for all variables
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void displayDate() {			// Method to display the current date
		System.out.printf("Today's date is %d/%d/%d.", this.day, this.month, this.year);
	}
}

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Declaring variables
		Date date = new Date(1, 1, 1);
													// Setting the new date
		System.out.println("Which day is it today? Please write in separate lines the day, month and year.");
		date.setDay(input.nextInt());
		date.setMonth(input.nextInt());
		date.setYear(input.nextInt());
													// Displaying today's date
		date.displayDate();
		
	}
}
