import java.util.Scanner;

public class UnixTimeConverter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Get user input
		System.out.println("Enter a Unix time:");
		int unixTime = scnr.nextInt();

		// Assign variables and create equations
		int numDays = unixTime / (24 * 60 * 60);
		int numHours = unixTime % (24 * 60 * 60) / (60 * 60);
		int numMinutes = unixTime % (24 * 60 * 60) % (60 * 60) / 60;
		int numSeconds = unixTime % (24 * 60 * 60) % (60 * 60) % 60 / 1;

		// Display results
		System.out.println("\n" + numDays + " day(s)");
		System.out.println(numHours + " hour(s)");
		System.out.println(numMinutes + " minute(s)");
		System.out.println(numSeconds + " second(s)");
	}
}