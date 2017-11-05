import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println(
				"How many times do you want to run each test? (More tests means higher accuracy, but more computation time)");
		int n = console.nextInt();

		System.out.println();
		System.out.println(
				"Now type in a string containing Hs and Ts.  \nThe program will work out an estimate for the expected number of coinflips until your \nHead-Tail sequence appears for the first time in a random sequence of coin-flips.");
		System.out.println("Type exit at any point to leave the program.");
		String input = console.nextLine();
		System.out.println();

		// Create new coin object
		CoinFlip coin = new CoinFlip();

		while (!input.equalsIgnoreCase("exit")) {
			int tot = 0;
			for (int i = 0; i < n; i++) {
				StringBuilder answer = new StringBuilder();

				while (!answer.toString().contains(input)) {
					answer.append(coin.coinFlip());

				}

				tot += answer.toString().length();
			}
			System.out.println(input + " averaged " + tot / n + " flips.");
			input = console.nextLine();
		}
		System.out.println("Program exited.");

		

		
	}

	/**
	 * Returns the characters 'H' or 'T' randomly, each with probability 0.5. This is equivalent to flipping a fair coin.
	 * @return H with probability 0.5, or T with probability 0.5
	 */
	public static char coinFlip() {
		int coin = 0;

		Random rand = new Random();

		coin = rand.nextInt(2);

		if (coin == 0) {
			return 'T';
		} else {
			return 'H';
		}

	}
}
