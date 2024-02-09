import java.util.Random;
import java.util.Scanner;

public class AmExNumberGenerator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("How many AmEx numbers would you like to generate?");
		int numAmExNumbers = scnr.nextInt();

		int amExNumberBeginner = 0;
		int sum = 0;
		int x = 0;

		System.out.println("\nHere you go, have fun:");

		for (int i = 0; i <= numAmExNumbers; i++) {
			x = 0; 
			int r = rng.nextInt(2);
			if (r == 0) {
				amExNumberBeginner = 34;
				System.out.print(amExNumberBeginner);
			}
			else if (r == 1) {
				amExNumberBeginner = 37;
				System.out.print(amExNumberBeginner);
			}
			for (int k = 0; k < 12; k++) {
				int random = rng.nextInt(10);
				System.out.print(random);
				if ((k % 2) == 0) {
					random = random * 2;
					if (random > 9) {
						random = random - 9;
					}
				}
				sum += random;
				if (amExNumberBeginner == 34) {
					sum += 11;
				}
				else if (amExNumberBeginner == 37) {
					sum += 8;
				}
			}
			while ((sum % 10) != 0) {
				sum++;
				x++;
			}
			System.out.println(x);
		} 
	}
}