import java.util.Scanner;

public class PartyPlanner {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Party Planner Pro!");
		System.out.println("\nHow many friends are you throwing this party for?");
		int numFriends = scnr.nextInt();
		scnr.nextLine();
		System.out.println("What is the drink of choice?");
		String drink = scnr.nextLine();
		System.out.println("How many cans will each person drink?");
		int cansPerPerson = scnr.nextInt();
		System.out.println("How many cans are sold per pack?");
		int cansPerPack = scnr.nextInt();
		

		int totalCans = cansPerPerson * (numFriends + 1);
		int minPurchase = totalCans / cansPerPack;

		if ((totalCans % cansPerPack) > 0) {
			System.out.println("The minimum purchase is " + (minPurchase + 1) + " " + cansPerPack + "-packs of " + drink + ", which will satisfy everyone and leave " + (((minPurchase + 1) * cansPerPack) - totalCans) + " extra can(s).");
		}

		if ((totalCans % cansPerPack) == 0) {
			System.out.println("The minimum purchase is " + minPurchase + " " + cansPerPack + "-packs of " + drink + ", which will satisy everyone.");
		}
	}
}