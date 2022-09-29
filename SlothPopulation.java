public class SlothPopulation {
	public static void main(String[] args) {
		int[] counts = {4, 5, 6, 6, 8, 13};
		for (int i = 0; i < counts.length; i++) {
			System.out.print(counts[i] + " ");
		}
		System.out.println();
		analyzeData(counts);
		int[] counts1 = {12, 9, 8, 11, 10, 6, 5};
		for (int i = 0; i < counts1.length; i++) {
			System.out.print(counts1[i] + " ");
		}
		System.out.println();
		analyzeData(counts1);
		int[] counts2 = {12, 13, 10, 11, 6, 7, 0};
		for (int i = 0; i < counts2.length; i++) {
			System.out.print(counts2[i] + " ");
		}
		System.out.println();
		analyzeData(counts2);
	}
	public static void analyzeData(int[] counts) {
		double sumOfChange = 0;
		int numIncreases = 0;
		int numDecreases = 0;
		if (counts.length > 1) {
			for (int i = 1; i < counts.length; i++) {
				sumOfChange += (counts[i] - counts[i - 1]);
			}
			double averageChange = sumOfChange / (counts.length - 1);
			System.out.println("Average month-to-month change: " + averageChange);
			for (int i = 1; i < counts.length; i++) {
				if ((counts[i] - counts[i - 1]) > 0) {
					numIncreases++;
				}
				else if ((counts[i] - counts[i - 1]) < 0) {
					numDecreases++;
				}
			}
			System.out.println("Number of month-to-month increases: " + numIncreases);
			System.out.println("Number of month-to-month decreases: " + numDecreases);
			System.out.print("Overall trend: ");
			if (averageChange > 0 && numIncreases > numDecreases) {
				System.out.println("increasing");
			}
			else if (averageChange < 0 && numDecreases > numIncreases) {
				System.out.println("decreasing");
			}
			else {
				System.out.println("inconclusive");
			}
		}
		else {
			System.out.println("Insufficient data");
		}
	}
}