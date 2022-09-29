import java.util.Scanner;

public class MakingChange {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter how many cents to make change for:");
		int numCents = scnr.nextInt();

		int numQuarters = numCents / 25;
		int numDimes = numCents % 25 / 10;
		int numNickels = numCents % 25 % 10 / 5;
		int numPennies = numCents % 25 % 10 % 5 / 1;

		System.out.println(numQuarters + " quarter(s)");
		System.out.println(numDimes + " dime(s)");
		System.out.println(numNickels + " nickel(s)");
		System.out.println(numPennies + " penny/pennies");

	}
}
