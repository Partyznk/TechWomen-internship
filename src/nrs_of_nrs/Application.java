package nrs_of_nrs;
							/* Write a program that inputs five numbers 
							 * and determines and prints the number of negative 
							 * numbers input, the number of positive numbers input 
							 * and the number of zeros input. */
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int v1, v2, v3, v4, v5, z = 0, p = 0, n = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter new integer: ");		//Citirea numarului
		v1 = input.nextInt();
		if (v1 < 0) {					// Verificarea daca e mai mic decat 0
			n++;						// Incrementarea numarului de numere negative
		}
		else if (v1 == 0) {				// Verificarea daca e egal cu 0
			z++;						// Incrementarea numarului de numere egale cu 0
		}
		else {							// Verificarea daca e mai mare decat 0
			p++;						// Incrementarea numarului de numere pozitive
		}
		
		System.out.print("Enter new integer: ");		//Repetarea aceluiasi ciclu
		v2 = input.nextInt();
		if (v2 < 0) {
			n++;
		}
		else if (v2 == 0) {
			z++;
		}
		else {
			p++;
		}
		
		System.out.print("Enter new integer: ");
		v3 = input.nextInt();
		if (v3 < 0) {
			n++;
		}
		else if (v3 == 0) {
			z++;
		}
		else {
			p++;
		}
		
		System.out.print("Enter new integer: ");
		v4 = input.nextInt();
		if (v4 < 0) {
			n++;
		}
		else if (v4 == 0) {
			z++;
		}
		else {
			p++;
		}
		
		System.out.print("Enter new integer: ");
		v5 = input.nextInt();
		if (v5 < 0) {
			n++;
		}
		else if (v5 == 0) {
			z++;
		}
		else {
			p++;
		}
		
		System.out.printf("Negative numbers: %d;\nPositive numbers: %d;\nZero numbers: %d;", n, p, z);
	}
}
