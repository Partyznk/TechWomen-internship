package odd_even;
								/* Write an application that reads an integer and determines 
								 and prints whether it’s odd or even. */
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");		// Citirea numarului
		n = input.nextInt();
		
		if (n % 2 == 1) {						// Determinare daca este par sau impar
			System.out.printf("%d is odd", n);		// Afisare
		}
		else {
			System.out.printf("%d is even", n);
		}
	}
}
