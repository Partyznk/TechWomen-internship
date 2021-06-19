package separating_integer;
								/* Write an application that inputs one number consisting of five digits from the user, 
								 * separates the number into its individual digits and prints the digits separated 
								 * from one another by three spaces each. */
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);		// Citire numar
		System.out.print("Enter integer: ");
		n = input.nextInt();
													// Despartire a fiecarei cifre si afisare
		System.out.println(n / 10000 + "   " + n / 1000 % 10 + "   " + n / 100 % 10 + "   " + n / 10 % 10 + "   " + n % 10);
	}
}
