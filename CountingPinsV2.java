import java.util.Scanner;

public class CountingPinsV2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("How many rows do you want to use?");
		int numRows = scnr.nextInt();

		int i = 1;
		int pinsPerRow = 0;
		int totalSum = 0;

		while (i <= numRows) {
			pinsPerRow = (i * (i + 1)) / 2;
			totalSum = totalSum + pinsPerRow;
			i++;
		}

		if (totalSum != 1) {
			System.out.println("That will require " + totalSum + " pins.");
		}
		else {
			System.out.println("That will require " + totalSum + " pin.");
		}	
	}
}