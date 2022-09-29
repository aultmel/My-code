import java.util.Scanner;

public class QuadraticSolver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Get user input for coefficients a, b, and c
		System.out.println("Enter the value of a:");
		double a = scnr.nextDouble();
		System.out.println("Enter the value of b:");
		double b = scnr.nextDouble();
		System.out.println("Enter the value of c:");
		double c = scnr.nextDouble();

		// Plug a, b, and c into the quadratic formula to find the roots
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);

		// Show the results on the screen
		System.out.println("The two roots are:");
		System.out.println(x1);
		System.out.println(x2);

	}
}