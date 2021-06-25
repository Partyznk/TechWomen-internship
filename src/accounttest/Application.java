package accounttest;
								/* Modify class Account to provide a method called withdraw that 
								 * withdraws money from an Account.*/
import java.util.Scanner;

class Account {
	private String name;
	private double balance;

	public Account(String name, double balance) {		// Constructor
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	public void setName(String name) {				// Setter for name
		this.name = name;
	}

	public void addDeposit(double deposit) {		//Add deposit, makes changes to balance
		this.balance = this.balance + deposit;
	}

	public void addWithdrawal(double withdrawal) {		// Add withdrawal, makes changes to balance
		if (withdrawal <= balance) {
			this.balance = this.balance - withdrawal;
		}
		else {
			System.out.println("Withdrawal amount exceeded account balance");
		}
	}

	public String getName() {		// Getter for name
		return this.name;
	}

	public double getBalance() {		// Getter for balance
		return this.balance;
	}
}

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// Declaring variables
		Account account = new Account("Bianca Raetchi", 1_000_000.00);
															// Stating the initial name + balance
		System.out.printf("The account under the name %s has $%.2f\n", account.getName(), account.getBalance());
		System.out.println("Next you will be able to change your account's details");
												// Making changes to the account's name
		System.out.printf("Change the name: ");
		account.setName(input.nextLine());
		System.out.print("Your current account name is " + account.getName() + "\n");
												// Adding a deposit + withdrawal
		System.out.print("Deposit a sum of money: ");
		account.addDeposit(input.nextDouble());
		System.out.print("Withdraw a sum of money: ");
		account.addWithdrawal(input.nextDouble());
												// Stating the final name + balance
		System.out.printf("You have $%.2f in the account under the name %s", account.getBalance(), account.getName());
	}
}
