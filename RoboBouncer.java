import java.util.Scanner;

public class RoboBouncer {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Hey, how old are you?");
		int age = scnr.nextInt();

		if (age >= 21) {
			System.out.println("Welcome to the best club ever! You can come in and kill all your brain cells!");
		}
		else {
			int difference = 21 - age;
			System.out.println("Nothing personal, kid, but your foot is about to hurt.");

			if (difference > 1) {
				System.out.println("You can come back in " + difference + " years.");
			}
			else {
				System.out.println("You can come back in " + difference + " year.");
			}

		}

	}
	
}