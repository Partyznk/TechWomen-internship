package unicode_char;
							/* Write an application that displays the integer 
							 * equivalents of some uppercase letters, lowercase letters, digits and special symbols.
							 */
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		char c;
		Scanner input = new Scanner(System.in);		// Citirea caracterului
		System.out.print("Enter a character: ");
		c = input.next().charAt(0);
													// Afisarea codului
		System.out.printf("%c has %d as its unicode.", c, (int) c);
	}
}
