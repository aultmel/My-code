import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter starting balance:");
		double startingBalance = scnr.nextDouble();
		System.out.println("Enter annual interest rate (as a percentage) :");
		double apr = scnr.nextDouble();
		System.out.println("How many years?");
		int numYears = scnr.nextInt();

		double yearStart = startingBalance;

		int i = 0;
		while (i < numYears) {
			double interest = (apr / 100) * yearStart;
			double yearEnd = yearStart + interest;
			System.out.format("Year %d:\t%.2f\t%.2f\t%.2f\n", i + 1, yearStart, interest, yearEnd);
			yearStart = yearEnd;
			i++;
		}
	}
}