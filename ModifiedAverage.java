import java.util.Scanner;

public class ModifiedAverage {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int i = 1;
		double grade = 1;
		double sum = 0;
		double average = 0;
		double lowestGrade = 100;

		while (grade >= 0) {
			System.out.print("Enter grade " + i + " (any negative value to exit): ");
			grade = scnr.nextDouble();
			if (grade >= 0) {
				sum += grade;
				if (grade < lowestGrade) {
					lowestGrade = grade;
				}
				i++;
			}
		}


		if (i == 1) {
			System.out.println("No grades entered, no data to report.");
		}

		else if (i == 2) {
			System.out.println("1 grade entered.\nAverage: " + sum);
		}

		else if (i > 2) {
			average = sum / (i - 1);
			System.out.println((i - 1) + " grades entered.\nAverage: " + average);
			average = (sum - lowestGrade) / (i - 2);
			System.out.println("Average after dropping lowest grade of " + lowestGrade + ": " + average);
		}
	}
}
