package product_of_integers;

public class Application {
	public static void main(String[] args) {
		int i, p = 1;
		
		for(i = 1; i <= 15; i += 2) {
			p *= i;
		}
		
		System.out.println(p);
	}
}
 
