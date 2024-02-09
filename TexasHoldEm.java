import java.util.Scanner;
import java.util.Random;

public class TexasHoldEm {
	public static void main(String[] args) {
		String[] hand = playerHand(2);
		printArray(hand);
	}
	public static void printArray(String[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
	public static boolean exists(String[] a, String key, int startIndex) {
		for (int i = 0; i <= startIndex; i++) {
			if (a[i] == key) {
				return true;
			}
		}
		return false;
	}
	public static String[] playerHand(int k) {
		Random rng = new Random();
		String[] a = new String[k];
		int x;
		int y;
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < k; i++) {
			x = rng.nextInt(13);
			y = rng.nextInt(4);
			if (x == 0) {
				str1 = "Ace";
			}
			if (x == 1) {
				str1 = "2";
			}
			if (x == 2) {
				str1 = "3";
			}
			if (x == 3) {
				str1 = "4";
			}
			if (x == 4) {
				str1 = "5";
			}
			if (x == 5) {
				str1 = "6";
			}
			if (x == 6) {
				str1 = "7";
			}
			if (x == 7) {
				str1 = "8";
			}
			if (x == 8) {
				str1 = "9";
			}
			if (x == 9) {
				str1 = "10";
			}
			if (x == 10) {
				str1 = "Jack";
			}
			if (x == 11) {
				str1 = "Queen";
			}
			if (x == 12) {
				str1 = "King";
			}
			if (y == 0) {
				str2 = " of hearts";
			}
			if (y == 1) {
				str2 = " of diamonds";
			}
			if (y == 2) {
				str2 = " of clubs";
			}
			if (y == 3) {
				str2 = " of spades";
			}
			a[i] = str1.concat(str2);
		}
		return a;
	}
}