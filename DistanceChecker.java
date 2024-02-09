import java.util.Scanner;

public class DistanceChecker {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Get user input
		System.out.println("What is the radius of your circular landmass?");
		double radius = scnr.nextDouble();

		System.out.println("What are the x and y coordinates of the center of your landmass?");
		double xCenter = scnr.nextDouble();
		double yCenter = scnr.nextDouble();

		System.out.println("What are the x and y coordinates of your fish spawn point?");
		double xFish = scnr.nextDouble();
		double yFish = scnr.nextDouble();

		// Create a formula to find answer
		double distanceShoreline = Math.sqrt(Math.pow((xFish - xCenter) , 2) + Math.pow((yFish - yCenter) , 2)) - radius;

		// Display answer
		System.out.println("The fish are a distance of " + distanceShoreline + " from the shoreline.");
	}
}
