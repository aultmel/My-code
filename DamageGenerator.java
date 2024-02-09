import java.util.Scanner;
import java.util.Random;

public class DamageGenerator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random attack = new Random();

		// Get user input
		System.out.println("What is the minimum possible damage?");
		int minDamage = scnr.nextInt();

		System.out.println("What is the maximum possible damage?");
		int maxDamage = scnr.nextInt();

		// Create an equation to figure out result
		int damage = attack.nextInt((maxDamage + 1) - minDamage) + minDamage;

		// Display the results
		System.out.println("POW! Your attack just dealt " + damage + " damage!");
	}
}