import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int i = 1;
		String password = "bananas";
		String userInputPassword = "...";

		while (i <= 5) {
			System.out.println("Enter password: ");
			userInputPassword = scnr.nextLine();
			if (userInputPassword.equals("bananas")) {
				System.out.println("Access granted, welcome.");
				i += 5;
			}
			else {
				if((5 - i) > 1) {
					System.out.println("Incorrect password. You have " + (5 - i) + " attempts remaining before system lockout.");
				}
				else if ((5 - i) == 1) {
					System.out.println("Incorrect password. You have " + (5 - i) + " attempt remaining before system lockout.");
				}
				else if ((5 - i) == 0) {
					System.out.println("Your account has been disabled for 24 hours. The authorities have been notified.");
				}
			}
			i++;
		}

	}
}