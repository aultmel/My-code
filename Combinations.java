import java.util.Scanner;

public class Combinations {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Let's design a lottery game!\n");
		System.out.println("The numbers should range from 1 to what?");
		int n = scnr.nextInt();
		System.out.println("How many of those numbers should you pick?");
		int k = scnr.nextInt();
		System.out.println("And finally, the bonus number should range from 1 to what?");
		int p = scnr.nextInt();
		double numChances = nChooseK(n, k) * p;
		double percentage = 1 / numChances;
		System.out.println("\nYour chance of winning the jackpot is 1 in " + numChances + ", or " + percentage + "%");
		System.out.println("Yeah, good luck with that.");
	}

	public static int nChooseK(int n, int k) {
		int numCombinations = 0;
		int numerator = 1;
		int denominator = 1;
		for (int i = n - k + 1; i <= n; i++) {
			numerator *= i;
		}
		for (int i = 2; i <= k; i++) {
			denominator *= i;
		}
		if (n < 0 || k < 0) {
			numCombinations = 0;
		}
		else if (n < k) {
			numCombinations = 0;
		}
		else if (k == 0) {
			numCombinations = 1;
		}
		else {
			numCombinations = numerator / denominator;
		}
		return numCombinations;
	}
}