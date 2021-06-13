package integers;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		System.out.print("Enter new integer: ");
		number1 = input.nextInt();
		System.out.print("Enter another integer: ");
		number2 = input.nextInt();
		System.out.printf("Sum: %d; Difference: %d; Product: %d; Quotient: %d; Mod: %d", number1 + number2, number1 - number2, number1 * number2, number1 / number2, number1 % number2);
	}

}
