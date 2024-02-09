import java.util.Scanner;

public class SlothRacing {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many sloth speeds would you like to enter? ");
		int numSloths = scnr.nextInt();
		double[] slothSpeeds = new double[numSloths];
		int numFastSloths = 0;
		double sumFastSpeeds = 0;
		int numSlowSloths = 0;
		double sumSlowSpeeds = 0;
		double sumSpeeds = 0;
		for (int i = 0; i < numSloths; i++) {
			System.out.print("Enter speed of sloth " + (i + 1) + ": ");
			slothSpeeds[i] = scnr.nextDouble();
			sumSpeeds += slothSpeeds[i];
			if (slothSpeeds[i] >= 3) {
				numFastSloths++;
				sumFastSpeeds += slothSpeeds[i];
			}
			else {
				numSlowSloths++;
				sumSlowSpeeds += slothSpeeds[i];
			}
		}
		double avgSpeed = sumSpeeds / numSloths;
		double avgFastSpeed = sumFastSpeeds / numFastSloths;
		double avgSlowSpeed = sumSlowSpeeds / numSlowSloths;
		System.out.println("\nHere are some statistics on your sloths!");
		System.out.println("\nAverage overall speed: " + avgSpeed);
		System.out.println("Number of fast sloths: " + numFastSloths);
		System.out.print("Average speed of fast sloths: ");
		if (numFastSloths != 0) {
			System.out.println(avgFastSpeed);
		}
		else {
			System.out.println("N/A");
		}
		System.out.println("Number of slow sloths: " + numSlowSloths);
		System.out.print("Average speed of slow sloths: ");
		if (numSlowSloths != 0) {
			System.out.println(avgSlowSpeed);
		}
		else {
			System.out.println("N/A");
		}
	}
}