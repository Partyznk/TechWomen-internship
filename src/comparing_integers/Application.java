package comparing_integers;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, big = 0, small = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter new integer: ");		//Citirea numerelor
		n1 = input.nextInt();
		System.out.print("Enter new integer: ");
		n2 = input.nextInt();
		System.out.print("Enter new integer: ");
		n3 = input.nextInt();
		System.out.print("Enter new integer: ");
		n4 = input.nextInt();
		System.out.print("Enter new integer: ");
		n5 = input.nextInt();
		
		if (n1 >= n2) {			//Compararea numerelor
			big = n1;
			small = n2;
		}
		else {
			big = n2;
			small = n1;
		}
		
		if (n3 >= big) {
			big = n3;
		}
		if (n3 <= small) {
			small = n3;
		}
		
		if (n4 >= big) {
			big = n4;
		}
		if (n4 <= small) {
			small = n4;
		}
		
		if (n5 >= big) {
			big = n5;
		}
		if (n5 <= small) {
			small = n5;
		}
												//Afisarea celui mai mic si celui mai mare numar
		System.out.printf("%d is the smallest nr. and %d is the biggest nr.", small, big);
	}
}
