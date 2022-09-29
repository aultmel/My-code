import java.util.Random;
import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rng = new Random();

		boolean keepGoing = true;

		while (keepGoing) {

			System.out.print("Say something: ");
			String input = scnr.nextLine();

			String response = "...";

			if(input.equals("stop")) {
				response = "OK, bye, thanks, come again.";
				keepGoing = false;
			}

				else if (input.indexOf("no") >= 0) {
					response = "Oh, why are you so negative?";
				}

				else if(input.indexOf("like") >= 0) {
					String objectOfLike = input.substring(input.indexOf("like") + 5);
					response = "Oh really? Tell me why you like " + objectOfLike + ".";
				}
				else if (input.length() >= 50) {
					response = "My my, aren't we long-winded today?";
				}

				else if (input.equals(input.toUpperCase())) {
					response = "STOP SHOUTING!!!!!!!";
				}

				else {
					int r = rng.nextInt(3);
					if (r == 0) {
						response = "k";
					}
					else if (r == 1) {
						response = "Hello there.";
					}
					else if (r == 2) {
						response = "Go away!";
					}
				}

			System.out.println(response);
		}
	}
}