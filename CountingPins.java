import java.util.Scanner;

public class CountingPins {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("How many rows do you want to use?");
		int numRows = scnr.nextInt();

		int i = 1;
		int numPins = 0;
		while (i <= numRows) {
			numPins += i;
			i++;
		}

		if (numPins != 1) {
			System.out.println("That will require " + numPins + " pins.");
		}
		else {
			System.out.println("That will require " + numPins + " pin.");
		}
	}
}
