import java.util.Scanner; 

public class StoreCheckout {
	public static void main(String[] args) {	
		Scanner scnr = new Scanner(System.in);

		final double PRICE_MILK = 30;
		final double PRICE_BEETS = 0.99;
		final double PRICE_SLOTH = 22000;
		int qtyMilk;
		int qtyBeets;
		int qtySloths;

		System.out.println("Welcome to the best online store of all time!");
		System.out.println("You can buy the following:");
		System.out.println("Milk - $" + PRICE_MILK + " per unit");
		System.out.println("Beets - $" + PRICE_BEETS + " per unit");
		System.out.println("Adorable sloths - $" + PRICE_SLOTH + " per unit");

		System.out.println("How many units of milk would you like to buy?");
		qtyMilk = scnr.nextInt();
		System.out.println("How many units of beets would you like to buy?");
		qtyBeets = scnr.nextInt();
		System.out.println("How many units of sloths would you like to buy?");
		qtySloths = scnr.nextInt();

		double subtotal;
		subtotal = PRICE_MILK*qtyMilk + PRICE_BEETS*qtyBeets + PRICE_SLOTH*qtySloths;
		System.out.println("Your subtotal is: $" + subtotal);




	}
}