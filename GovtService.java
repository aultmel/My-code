import java.util.Scanner;

public class GovtService {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("How old are you?");
			int age = scnr.nextInt();
			
			if (age >= 25) {
				System.out.println("You can service in the House of Representatives.");
			}

			if (age >= 30) {
				System.out.println("You can service in the Senate.");
			}

			if (age >= 35) {
				System.out.println("You can serve as the President.");
			}

	}
}