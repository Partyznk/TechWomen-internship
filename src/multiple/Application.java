package multiple;
								/* Write an application that reads two integers, 
								   determines whether the first is a multiple of the second and prints the result. */
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n1, n2;
		Scanner input = new Scanner(System.in);		// Citirea numerelor
		System.out.print("Enter integer: ");
		n1 = input.nextInt();
		System.out.print("Enter integer: ");
		n2 = input.nextInt();
		
		if (n1 % n2 == 0) {						// Determinarea daca primul nr este multiplul celui de-al doilea
			System.out.printf("%d is a multiple of %d", n1, n2);		// Afisarea
		}
		else {
			System.out.printf("%d is not a multiple of %d", n1, n2);
		}
	}
}
