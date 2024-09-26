package factorial;

public class Application {
	public static void main(String[] args) {
		int i;
		
		System.out.println("Number:\t\t\t\tFactorial:");
		
		for(i = 1; i <= 20; i++) {
			System.out.printf("%d\t\t\t\t%-34d\n", i, Factorial(i));
		}		
	}
	
	public static long Factorial(int number){
		long factorial = 1, i = 1;
		
		for(i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
}
