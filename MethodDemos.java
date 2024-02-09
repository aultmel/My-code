import java.util.Random;
public class MethodDemos {
	public static void main(String[] args) {
		double cost = pizzaCost("L", 50);
		System.out.println(cost);

		for (int s = 0; s <= 20; s++) {
			printSloths(s);
		}

		System.out.println(monkeyBusiness("HAM"));
	}

	public static double pizzaCost(String size) {  // method header
		// method body
		double cost;
		if (size.equals("S")) {
			cost = 6;
		}
		else if (size.equals("M")) {
			cost = 10;
		}
		else {
			cost = 15;
		}
		return cost;
	}

	public static double pizzaCost(String size, int howManyToppings) {  // method header
		// method body
		double cost;
		double costPerTopping;
		if (size.equals("S")) {
			cost = 6;
			costPerTopping = 0.75;
		}
		else if (size.equals("M")) {
			cost = 10;
			costPerTopping = 1.50;
		}
		else {
			cost = 15;
			costPerTopping = 7.99;
		}

		double total = cost + costPerTopping * howManyToppings;
		return total;
	}

	public static void printSloths(int n) {
		System.out.print("sl");
		for (int i = 0; i < n; i++) {
			System.out.print("o");
		}
		System.out.println("ths");
	}

	public static int monkeyBusiness (String target) {
		Random rng = new Random();

		int keysPressed = 0;

		String monkeysOutput = "";
		for (int i = 0; i < target.length(); i++) {
			char nextChar = (char)(rng.nextInt(26) + 'A');
			keysPressed++;
			monkeysOutput = monkeysOutput + nextChar;

		}

		while (!monkeysOutput.equals(target)) {
			char nextChar = (char)(rng.nextInt(26) + 'A');
			keysPressed++;
			monkeysOutput = monkeysOutput + nextChar;
			monkeysOutput = monkeysOutput.substring(1);
		}
		return keysPressed;
	}
}