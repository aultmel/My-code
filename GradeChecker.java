import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter your numerical grade:");
		double grade = scnr.nextDouble();

		if (grade >= 90) {
			System.out.println("A :D");
		}

		if (grade >= 80 && grade < 90) {
			System.out.println("B :)");
		}

		if (grade >= 70 && grade < 80) {
			System.out.println("C :|");
		}

		if (grade >= 60 && grade < 70) {
			System.out.println("D :(");
		}

		if (grade < 60) {
			System.out.println("F D:");
		}

	}
}