import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a positive integer to test:");
		int n = scnr.nextInt();

		boolean divisorFound = false;
		for (int d = 2; d < n; d++) {
			if (n % d == 0) {
				divisorFound = true;
				break;
			}
		}

		if (divisorFound) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}