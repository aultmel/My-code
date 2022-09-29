import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter plaintext:");
		String plaintext = scnr.nextLine();
		System.out.println("Enter shift amount:");
		int shift = scnr.nextInt();

		String ciphertext = ""; // empty string
		for (int i = 0; i < plaintext.length(); i++) {
			char oldChar = plaintext.charAt(i);
			if (oldChar >= 'A' && oldChar <= 'Z') {
				char newChar = (char)(oldChar + shift); 
				if (newChar > 'Z') {
					newChar = (char)(newChar - 26);
				}
				ciphertext += newChar;
			}
			else {
				ciphertext += oldChar;
			}
		}

		System.out.println(ciphertext);
	}
}