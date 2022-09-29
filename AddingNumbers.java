import java.util.Scanner;

public class AddingNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		final int SENTINEL = 0;

		int n = 192938;
		int sum = 0;
		while (n != SENTINEL) {
			System.out.println("Enter a number (0 to exit):");
			n = scnr.nextInt();
			sum += n;
		}

		sum -= SENTINEL;

		System.out.println("The sum is " + sum);

	}
}