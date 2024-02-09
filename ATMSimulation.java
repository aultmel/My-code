/*
Simulates a simple ATM.  The user can check his/her balance,
deposit money, and withdraw money.
*/
import java.util.Scanner;

public class ATMSimulation {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Show the ATM menu
		System.out.println("ATM");
		System.out.println("1. Check balance");
		System.out.println("2. Deposit moneh");
		System.out.println("3. Withdraw moneh");
		System.out.println("4. Exit");

		final int SENTINEL = 4;

		// This variable stores the amount of money in the account
		double balance = 9123082.76;	// a not-very-realistic college student amount

		// This variable stores the max allowable one-time withdrawal
		double limit = 1000;

		// Get user input for his/her choice
		System.out.println("Enter the number corresponding to your choice:");
		int choice = scnr.nextInt();

		while (choice != SENTINEL) {

			if (choice == 1) {	// Check balance
				System.out.println("Your balance is: $" + balance);
				choice = scnr.nextInt();
			}
			else if (choice == 2) {	// Deposit money
				System.out.println("How much to deposit?");
				double amount = scnr.nextDouble();
				balance += amount;
				System.out.println("Your new balance is: $" + balance);
				choice = scnr.nextInt();
			}
			else if (choice == 3) {	// Withdraw money
				System.out.println("How much to withdraw?");
				double amount = scnr.nextDouble();

				// Let's make sure the withdraw amount is valid!
				if (amount > balance) {		// Not enough balance to withdraw
					System.out.println("Insufficient funds.  Get a job :(");
				}
				else if (amount - (int)amount > 0) {	// Casting to int gives us just the int portion of amount.
														// If there's something left over after subtracting that portion
														//  from the original amount, it means amount must have a
														//  nonzero number of cents.
					System.out.println("Can't dispense change, this is not a casino.");
				}
				else if (amount % 10 != 0) {	// We assume the ATM only gives money in increments of $10.
					System.out.println("Amount must be a multiple of $10.");
				}
				else if (amount > limit) {		// Can't exceed withdraw limit
					System.out.println("Can't withdraw more than $" + limit + " at one time.");
				}
				else if (amount <= 0) {			// Can't withdraw a negative or zero amount
					System.out.println("Withdraw amount must be positive, what are you even doing here?");
				}
				else {
					balance -= amount;
					System.out.println("Your new balance is: $" + balance);
				}
				choice = scnr.nextInt();
			}
			else {	// When provided at the end of a multibranch conditional, else
					//  gives the program something to do if *none* of the preceding
					//  conditions are true.  Here, we use it to detect invalid choices
					//  (i.e., anything besides 1, 2, or 3).
				System.out.println("Learn2read");			
			}
		}
		System.out.println("Thank you, have a nice day.");
	}
}
