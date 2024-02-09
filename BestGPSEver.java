import java.util.Scanner;

public class BestGPSEver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Starting corner:");
		System.out.print("Street - ");
		int startStreet = scnr.nextInt();
		System.out.print("Avenue - ");
		int startAve = scnr.nextInt();

		System.out.println("Ending corner:");
		System.out.print("Street - ");
		int endStreet = scnr.nextInt();
		System.out.print("Avenue - ");
		int endAve = scnr.nextInt();

		double distanceEast = (endStreet - startStreet) / 2 * 1000;
		double distanceWest = (startStreet - endStreet) / 2 * 1000;
		double distanceSouth = (endAve - startAve) / 2 * 1000;
		double distanceNorth = (startAve - endAve) / 2 * 1000;

		if (startStreet < endStreet) {
			System.out.println("Take Avenue " + startAve + " east for " + distanceEast + " ft until you get to Street " + endStreet + ".");
			if (startAve < endAve) {
				System.out.println("Turn right onto Street " + endStreet + ".");
				System.out.println("Take Street " + endStreet + " south for " + distanceSouth + " ft until you get to Avenue " + endAve + ".");
			}
			if (startAve > endAve) {
				System.out.println("Turn left onto Street " + endStreet + ".");
				System.out.println("Take Street " + endStreet + " north for " + distanceNorth + " ft until you get to Avenue " + endAve + ".");
			}
			System.out.println("You have arrived at your destination!");
		}

		if (startStreet > endStreet) {
			System.out.println("Take Avenue " + startAve + " west for " + distanceWest + " ft until you get to Street " + endStreet + ".");
			if (startAve < endAve) {
				System.out.println("Turn left onto Street " + endStreet + ".");
				System.out.println("Take Street " + endStreet + " south for " + distanceSouth + " ft until you get to Avenue " + endAve + ".");
			}
			if (startAve < endAve) {
				System.out.println("Turn right onto Street " + endStreet + ".");
				System.out.println("Take Street " + endStreet + " north for " + distanceNorth + " ft until you get to Avenue " + endAve + ".");
			}
			System.out.println("You have arrived at your destination!");
		}

		if (startStreet == endStreet) {
			if (startAve < endAve) {
				System.out.println("Take Street " + startStreet + " south for " + distanceSouth + " ft until you get to Avenue " + endAve + ".");
			}
			if (startAve > endAve) {
				System.out.println("Take Street " + startStreet + " north for " + distanceNorth + " ft until you get to Avenue " + endAve + ".");
			}
			System.out.println("You have arrived at your destination!");
		}

	}
}