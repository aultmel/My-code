import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//Get user input
		System.out.println("Welcome to Cash Register Buddy!");
		System.out.println("\nEnter the quantity of:");
		System.out.print("Pennies - ");
		int numPennies = scnr.nextInt();
		System.out.print("Nickels - ");
		int numNickels = scnr.nextInt();
		System.out.print("Dimes - ");
		int numDimes = scnr.nextInt();
		System.out.print("Quarters - ");
		int numQuarters = scnr.nextInt();
		System.out.print("$1 bills - ");
		int numOnebill = scnr.nextInt();
		System.out.print("$5 bills - ");
		int numFivebill = scnr.nextInt();
		System.out.print("$10 bills - ");
		int numTenbill = scnr.nextInt();
		System.out.print("$20 bills - ");
		int numTwentybill = scnr.nextInt();

		//Create formulas and set variables to find totals
		double numCents = (numPennies * 0.01) + (numNickels * 0.05) + (numDimes * 0.10) + (numQuarters * 0.25);
		int numBills = (numOnebill * 1) + (numFivebill * 5) + (numTenbill * 10) + (numTwentybill * 20);
		double totalCash = numCents + numBills;

		//Display the results on the screen
		System.out.println("\nCash in coins: $" + numCents);
		System.out.println("Cash in bills: $" + numBills);
		System.out.println("Total cash: $" + totalCash);

	}
}