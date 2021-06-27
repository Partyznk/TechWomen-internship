package pythagorean_triples;

public class Application {
	public static void main(String[] args) {
		int i, j, k;				// Declaring variables
		
		System.out.println("Side1:\t\tSide2:\t\tHypothenuse:");
		
		for(i = 1; i <= 500; i++) {					
			for(j = 1; j <= 500; j++) {
				for(k = 1; k <= 500; k++) {
					if (i*i + j*j == k*k) {		// Checking the condition for a pythagorean triangle
						System.out.printf("%d\t\t%d\t\t%d\n", i, j, k);	// Printing
					}
				}
			}
		}
	}
}
