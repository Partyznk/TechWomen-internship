package circle;

import Math.PI;				// Importarea librariilor necesare
import java.util.Scanner;
							/* Write an application that inputs from the user the radius of a circle as an integer
							 *  and prints the circle’s diameter, circumference and area. */
public class Application {
	public static void main(String[] args) {
		int r; double pi;				// Cititul radiusului
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		r = input.nextInt();
		
		pi = Math.PI;
							// Calcularea si afisarea datelor
		System.out.printf("Diameter: %d;\nCircumference: %.2f;\nArea: %.2f;", 2*r, 2*pi*r, pi*r*r);
	}
}
