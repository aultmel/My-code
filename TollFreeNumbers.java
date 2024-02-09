import java.util.Scanner;

public class TollFreeNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a 10-digit phone number (no spaces or dashes):");
		long phoneNumber = scnr.nextLong();

		if ((phoneNumber / 10000000) == 800) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) == 888) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) == 877) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) == 866) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) == 855) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) == 844) {
			System.out.println("That number is toll-free!");
		}

		else if ((phoneNumber / 10000000) != 800) {
			System.out.println("That number is not toll-free!");
		}


		else if ((phoneNumber / 10000000) != 888) {
			System.out.println("That number is not toll-free!");
		}

		else if ((phoneNumber / 10000000) != 877) {
			System.out.println("That number is not toll-free!");
		}

		else if ((phoneNumber / 10000000) != 866) {
			System.out.println("That number is not toll-free!");
		}

		else if ((phoneNumber / 10000000) != 855) {
			System.out.println("That number is not toll-free!");
		}

		else if ((phoneNumber / 10000000) != 844) {
			System.out.println("That number is not toll-free!");
		}



	}
}