import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		final int SENTINEL = 0;

		int n = 192938;
		int max = Integer.MIN_VALUE;;
		while (n != SENTINEL) {
			System.out.println("Enter a number (0 to exit):");
			n = scnr.nextInt();
			if (n != SENTINEL) {
				if (n > max) {
					max = n;
				}
			}
		}

		System.out.println("The max is " + max);

	}
}