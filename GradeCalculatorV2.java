import java.util.Scanner;

public class GradeCalculatorV2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter your numerical grade:");
		double grade = scnr.nextDouble();

		if (grade >= 90) {
			System.out.println("A :D");
		}

		else if (grade >= 80 && grade < 90) {
			System.out.println("B :)");
		}

		else if (grade >= 70 && grade < 80) {
			System.out.println("C :|");
		}

		else if (grade >= 60 && grade < 70) {
			System.out.println("D :(");
		}

		else if (grade < 60) {
			System.out.println("F D:");
		}

	}
}