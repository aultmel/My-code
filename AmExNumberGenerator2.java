import java.util.Random;
import java.util.Scanner;

public class AmExNumberGenerator2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("How many numbers do you want to generate?");
		int n = scnr.nextInt();

		System.out.println("Here you go, have fun:");

		for (int k = 0; k < n; k++) {
			String number = "34";
			int r = rng.nextInt(2);
			if (r == 0) {
				number = "37";
			}

			for (int i = 0; i < 12; i++) {
				number += rng.nextInt(10);
			}

			int sum = 0;
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				int intValue = (int)c - '0';

				if (i % 2 == 1) {
					intValue *= 2;
					if (intValue >= 10) {
						intValue -= 9;
					}
				}

				sum += intValue;
			}

			int onesDigitOfSum = sum % 10;
			if (onesDigitOfSum == 0) {
				number += 0;
			}
			else {
				number += 10 - onesDigitOfSum;
			}

			System.out.println(number);
			
		}	

	}
}