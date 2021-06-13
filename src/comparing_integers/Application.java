package comparing_integers;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.print("Give an integer: ");
		n1 = input.nextInt();
		System.out.print("Give an integer: ");
		n2 = input.nextInt();
		if (n1 > n2) {
			System.out.printf("%d is larger than %d", n1, n2);
		}
		if (n1 < n2 ) {
			System.out.printf("%d is smaller than %d", n1, n2);
		}
		if (n1 == n2) {
			System.out.printf("%d is equal to %d", n1, n2);
		}
	}
}
