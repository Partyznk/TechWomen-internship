package coin_tossing;

import java.util.Scanner;
import java.security.*;

public class Application {
	enum COIN {
		HEADS,
		TAILS
	}
	
	public static COIN flip() {
		SecureRandom random_toss = new SecureRandom();
		COIN[] values = COIN.values();
		int length = values.length;
		int randindex = random_toss.nextInt(length);
		return values[randindex];
	}
	
	public static void main(String[] args) {
		String command; int heads_counter = 0, tails_counter = 0;
		COIN coin; 
		Scanner input = new Scanner(System.in);
		System.out.println("Type 'TOSS COIN' to toss a coin");
		command = input.nextLine();
		if (command.equals("TOSS COIN")) {
			while(command.equals("TOSS COIN")) {
				coin = flip(); 
				System.out.println(coin);
				if (coin == COIN.HEADS) {
					++heads_counter;
				}
				if (coin == COIN.TAILS) {
					++tails_counter;
				}
				System.out.println("\nType 'TOSS COIN' to toss a coin");
				command = input.nextLine();
			}
		}
		System.out.printf("Number of heads: %d%nNumber of tails: %d%n%n", heads_counter, tails_counter);
		System.out.println("~application interrupted~");
		
	}
}
