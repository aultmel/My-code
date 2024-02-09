import java.util.Scanner;

public class BackwardsLinearSearch {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many items would you like to put into the store inventory? ");
		int numItems = scnr.nextInt();
		scnr.nextLine();
		String[] inventoryItems = new String[numItems];
		for (int i = 0; i < inventoryItems.length; i++) {
			System.out.print("Enter item " + (i + 1) + ": ");
			inventoryItems[i] = scnr.nextLine();
		}
		System.out.println("\nData entry complete.");
		System.out.println("");
		String userInput = "";
		while (!userInput.equals("Q")) {
			System.out.print("Enter item to search for (Q to exit): ");
			userInput = scnr.nextLine();
			if (!userInput.equals("Q")) {
				if (backwardsLinearSearch(inventoryItems, userInput) != -1) {
					System.out.println("In stock at index " + backwardsLinearSearch(inventoryItems, userInput) + ".");
				}
				else if (backwardsLinearSearch(inventoryItems, userInput) == -1) {
					System.out.println("Sorry, out of stock.");
				}
			}
		}
		System.out.println("OK, bye!");
	}
	public static int backwardsLinearSearch(String[] arr, String key) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}