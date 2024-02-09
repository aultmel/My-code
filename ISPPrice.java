import java.util.Scanner;

public class ISPPrice {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//Get user input for numGigabytes
		System.out.print("How many gigabytes of data did you use this month? ");
		double numGigabytes = scnr.nextDouble();

		//Plug in numGigabytes to a formula to figure out how much their bill is this month
		double totalBill = 10 + numGigabytes * 0.06;

		//Display the results on the screen
		System.out.println("Your bill this month is $" + totalBill + ".");

	}
}