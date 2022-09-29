import java.util.Scanner;

public class ListingPrimeNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("List all the primes from 2 up to what?");
		int upperLimit = scnr.nextInt();

		for (int n = 2; n <= upperLimit; n++) {

			boolean divisorFound = false;
			
			for (int d = 2; d < n; d++) {
				if (n % d == 0) {
					divisorFound = true;
					break;
				}
			}

			if (!divisorFound) {
				System.out.println(n);
			}

		}
	}
}