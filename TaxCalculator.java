import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("What was your 2018 income?");
		double income = scnr.nextDouble();

		if (income <= 9525) {
			double firstTax = income * 0.1;
			double totalTax = firstTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}

		if (income > 9525 && income <= 38700) {
			double firstTax = 9525 * 0.1;
			double secondTax = (income - 9525) * 0.12;
			double totalTax = firstTax + secondTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));

		}

		if (income > 38700 && income <= 82500) {
			double firstTax = 9525 * 0.1;
			double secondTax = (38700 - 9525) * 0.12;
			double thirdTax = (income - 38700) * 0.22;
			double totalTax = firstTax + secondTax + thirdTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("$38700 - $82500: $" + thirdTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}

		if (income > 82500 && income <= 157500) {
			double firstTax = 9525 * 0.1;
			double secondTax = (38700 - 9525) * 0.12;
			double thirdTax = (82500 - 38700) * 0.22;
			double fourthTax = (income - 82500) * 0.24;
			double totalTax = firstTax + secondTax + thirdTax + fourthTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("$38700 - $82500: $" + thirdTax);
			System.out.println("$82500 - $157500: $" + fourthTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}

		if (income > 157500 && income <= 200000) {
			double firstTax = 9525 * 0.1;
			double secondTax = (38700 - 9525) * 0.12;
			double thirdTax = (82500 - 38700) * 0.22;
			double fourthTax = (157500 - 82500) * 0.24;
			double fifthTax = (income - 157500) * 0.32;
			double totalTax = firstTax + secondTax + thirdTax + fourthTax + fifthTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("$38700 - $82500: $" + thirdTax);
			System.out.println("$82500 - $ 157500: $" + fourthTax);
			System.out.println("$157500 - $200000: $" + fifthTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}

		if (income > 200000 && income <= 500000) {
			double firstTax = 9525 * 0.1;
			double secondTax = (38700 - 9525) * 0.12;
			double thirdTax = (82500 - 38700) * 0.22;
			double fourthTax = (157500 - 82500) * 0.24;
			double fifthTax = (200000 - 157500) * 0.32;
			double sixthTax = (income - 200000) * 0.35;
			double totalTax = firstTax + secondTax + thirdTax + fourthTax + fifthTax + sixthTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("$38700 - $82500: $" + thirdTax);
			System.out.println("$82500 - $ 157500: $" + fourthTax);
			System.out.println("$157500 - $200000: $" + fifthTax);
			System.out.println("$200000 - $500000: $" + sixthTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}

		if (income > 500000) {
			double firstTax = 9525 * 0.1;
			double secondTax = (38700 - 9525) * 0.12;
			double thirdTax = (82500 - 38700) * 0.22;
			double fourthTax = (157500 - 82500) * 0.24;
			double fifthTax = (200000 - 157500) * 0.32;
			double sixthTax = (500000 - 200000) * 0.35;
			double seventhTax = (income - 500000) * 0.37;
			double totalTax = firstTax + secondTax + thirdTax + fourthTax + fifthTax + sixthTax + seventhTax;
			double taxRate = totalTax / income;
			System.out.println("\nFirst $9525: $" + firstTax);
			System.out.println("$9525 - $38700: $" + secondTax);
			System.out.println("$38700 - $82500: $" + thirdTax);
			System.out.println("$82500 - $ 157500: $" + fourthTax);
			System.out.println("$157500 - $200000: $" + fifthTax);
			System.out.println("$200000 - $500000: $" + sixthTax);
			System.out.println("$500000 and above: $" + seventhTax);
			System.out.println("\nTotal tax owed: $" + totalTax);
			System.out.println("Effective tax rate: %" + (taxRate * 100));
		}
	}
}