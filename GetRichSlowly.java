import java.util.Scanner;

public class GetRichSlowly {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.print("Current age:\t\t\t\t");
		int age = scnr.nextInt();
		System.out.print("Starting balance:\t\t\t");
		double startBalance = scnr.nextDouble();
		System.out.print("Desired retirement age:\t\t\t");
		int retirementAge = scnr.nextInt();
		System.out.print("Desired balance at retirement age:\t");
		double retirementBalance = scnr.nextDouble();
		System.out.print("Projected annual growth (percent):\t");
		double growthRate = scnr.nextDouble();

		growthRate = growthRate / 100;
		int amtYears = retirementAge - age;
		double neededContribution = 0;
		double growth = 0;
		double balance = startBalance;

		while (balance < retirementBalance) {
			/*
				output: How much you need to contribute each year
				given: growthRate, amtYears, startBalance
				method: guess a yearly contribution, see if it works
			*/

			//TODO: this function will run through n years and calculate the balance with the needed contribution and current growthrate
			balance = startBalance;
			for (int i = 0; i <= amtYears; i++) {
				growth = growthRate * balance;
				balance = balance + growth + neededContribution;
			}

			//

			if (balance < retirementBalance) {
				neededContribution += .01;
			}


		}
		System.out.format("\nTo reach that goal, you'll need to contribute $%.2f per year until you retire.\n", neededContribution);

		System.out.println("\nProjected growth:\n-----------------");
		System.out.println("Age          Start        Interest           Extra             End");

		double yearStart = startBalance;

		for (int k = 0; k < amtYears; k++) {
			growth = growthRate * yearStart;
			balance = yearStart + growth + neededContribution;
			System.out.format(" %d\t%10.2f\t%10.2f\t%10.2f\t%10.2f\n", age + k, yearStart, growth, neededContribution, balance);
			yearStart = balance;
		}
	}
}