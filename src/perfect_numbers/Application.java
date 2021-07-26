package perfect_numbers;

public class Application {
	
	public static void isPerfect(int number) {
		int i, sum = 0;
		for (i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.print(number + " ");
		}
	}
	
	public static void main(String[] args) {
		int i;
		System.out.println("Here is the list of all \"perfect numbers\" from 1 to 1000000:");
		for (i = 1; i <= 1000000; i++) {
			isPerfect(i);
		}
	}
}
