import java.util.Scanner;

public class CubicSolver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("What is the value of p?");
		double p = scnr.nextDouble();

		System.out.println("What is the value of q?");
		double q = scnr.nextDouble();

		double x = Math.cbrt((-q / 2) + Math.sqrt((Math.pow(q , 2) / 4) + (Math.pow(p , 3) / 27))) + Math.cbrt((-q / 2) - Math.sqrt((Math.pow(q , 2) / 4) + (Math.pow(p , 3) / 27)));
 
		System.out.println("The solution x is " + x);

	}
}