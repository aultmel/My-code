import java.util.Scanner;

public class MovieTickets {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("What's your desired showtime?");
		int showtime = scnr.nextInt();

		int n = 1;
		int i = 1;
		int numChildren = 0;
		int numAdults = 0;
		int numSeniors = 0;
		double priceChild = 0;
		double priceAdult = 0;
		double priceSenior = 0;
		double totalSum = 0;

		while (n > 0) {
			System.out.print("Enter age of party member " + i + " (any negative value to exit): ");
			n = scnr.nextInt();
			if (n <= 10 && n >= 0) {
				numChildren++;
			}
			else if (n >= 65) {
				numSeniors++;
			}
			else if (n > 10 && n < 65) {
				numAdults++;
			}
			i++;
		}
		if (showtime < 1700 && showtime >= 900) {
			priceChild = 0;
			priceAdult = numAdults * 8.0;
			priceSenior = numSeniors * 6.5;
			totalSum = priceChild + priceAdult + priceSenior;
			System.out.println("\nDaytime prices\n--------------");
			System.out.format("Adult:\t\t%d at $8.00 each\t\t$%.2f\n", numAdults, priceAdult);
			System.out.format("Child:\t\t%d for free\t\t$%.2f\n", numChildren, priceChild);
			System.out.format("Senior:\t\t%d at $6.50 each\t\t$%.2f\n", numSeniors, priceSenior);
			System.out.format("\nTOTAL:\t\t\t\t\t$%.2f", totalSum);
		}
		else if ((showtime >= 1700 && showtime <= 2359) || showtime == 0) {
			priceChild = numChildren * 5.5;
			priceAdult = numAdults * 11.5;
			priceSenior = numSeniors * 9.5;
			totalSum = priceChild + priceAdult + priceSenior;
			System.out.println("\nEvening prices\n--------------");
			System.out.format("Adult:\t\t%d at $11.50 each\t$%.2f\n", numAdults, priceAdult);
			System.out.format("Child:\t\t%d at $5.50 each\t\t$%.2f\n", numChildren, priceChild);
			System.out.format("Senior:\t\t%d at $9.50 each\t\t$%.2f\n", numSeniors, priceSenior);
			System.out.format("\nTOTAL:\t\t\t\t\t$%.2f", totalSum);
		}
		else if (showtime > 0 && showtime < 900) {
			System.out.println("Sorry, there are no showings at this time.");
		}

	}
}