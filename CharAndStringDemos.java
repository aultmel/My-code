import java.util.Scanner;

public class CharAndStringDemos {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		char myCharacter = 'A';
		System.out.println(myCharacter);

		char myCharacter2 = 'B';
		System.out.println(myCharacter2);

		System.out.println(myCharacter + myCharacter2);

		String sentence = "I'm hungry!";
		System.out.println(sentence);
		System.out.println(sentence + sentence);

		System.out.println("What is your name?");
		String name = scnr.nextLine();
		System.out.println("What is your quest?");
		String quest = scnr.nextLine();
		System.out.println("Hello, " + name + ". I wish you the best of luck with " + quest + ".");
	}
}