import java.util.Scanner;
import java.util.Random;

public class LotteryGame {
	public static void main(String[] args) {
		System.out.println("Ready to lose some money?? Let's play MEGA MILLIONS!");
		System.out.println();
		int n = 5;
		int k = 2; 
		int[] a = getPlayerNumbers(n, k);
		int[] b = getRandomNumbers(n, k);
		System.out.println("You chose these numbers:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("The drawn numbers were:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		if (containSameElements(a, b)) {
			System.out.println("Congratulations! You're a winner!");
		}
		else {
			System.out.println("Sorry, you're not a winner. But thanks for supporting your state's education system!");
		}
	}
	public static boolean exists(int[] a, int key, int startIndex) {
		for (int i = 0; i <= startIndex; i++) {
			if (a[i] == key) {
				return true;
			}
		}
		return false;
	}
	public static int[] getRandomNumbers(int n, int k) {
		Random randGen = new Random();
		int[] x = new int[k];
		for (int i = 0; i < k; i++) {
			x[i] = randGen.nextInt(n) + 1;
			if (i != 0) {
				while (exists(x, x[i], i - 1)) {
					x[i] = randGen.nextInt(n) + 1;
				}
			}
		}
		return x;
	}
	public static int[] getPlayerNumbers(int n, int k) {
		Scanner scnr = new Scanner(System.in);
		int[] b = new int[k];
		for (int i = 0; i < k; i++) {
			System.out.print("Pick a number from 1-" + n + ": ");
			b[i] = scnr.nextInt();
			while (b[i] < 1 || b[i] > n) {
				System.out.println("Must be between 1 and " + n + ".");
				System.out.print("Pick a number from 1-" + n + ": ");
				b[i] = scnr.nextInt();
			}
			if (i != 0) {
				while (exists(b, b[i], i - 1)) {
					System.out.println("You've already picked that number! Pick another.");
					System.out.print("Pick a number from 1-" + n + ": ");
					b[i] = scnr.nextInt();
				}
			}
		}
		return b;
	}
	public static boolean containSameElements(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (!exists(a, b[i], i)) {
				return false;
			}
		}
		return true;
	}
}