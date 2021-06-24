package invoicetest;

import java.util.Scanner;

class Invoice {
	private String number;				
	private String description;
	private int quantity;
	private double price;

	public Invoice(String number, String description, int quantity, double price) {		// Constructor
		this.number = number;
		this.description = description;
		if (quantity > 0) {
			this.quantity = quantity;
		}
		if (price > 0) {
			this.price = price;
		}
	}

	public void setNumber(String number) {					// Setters for all variables
		this.number = number;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public String getNumber() {				// Getters for all variables
		return this.number;
	}

	public String getDescription() {
		return this.description;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getPrice() {
		return this.price;
	}
	
	public double getInvoiceAmount() {			// Getter for the total amount
		return this.price * this.quantity;
	}
	
	public void getInvoice() {				// Print the current invoice details
		System.out.printf("Here is your current invoice: %s, %s, %d, $%.2f\n", this.number, this.description, this.quantity, this.price);
	}
}

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Invoice invoice = new Invoice("12345", "Fluffy cat ears", 3, 5);		// Declaring the variable + constructor
		invoice.getInvoice();													// Printing the invoice details
		System.out.println("Please type below the changes you would like to make");
		
		System.out.print("New invoice number: ");		// Setting new invoice details
		invoice.setNumber(input.nextLine());
		
		System.out.print("New invoice description: ");
		invoice.setDescription(input.nextLine());
		
		System.out.print("New invoice quantity: ");
		invoice.setQuantity(input.nextInt());
		
		System.out.print("New invoice price: ");
		invoice.setPrice(input.nextDouble());
		
		invoice.getInvoice();			// Printing the invoice details
		System.out.println("This is your final checkout amount: $" + invoice.getInvoiceAmount());	// Getting the final amount
	}
}
