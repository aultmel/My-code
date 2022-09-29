import java.util.Scanner;

public class WordGenerator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter length of word:");
		int n = scnr.nextInt();

		System.out.println("Here are all the " + n + "-letter words I could generate")

		String str = "";

		for (int i = 0; i < n; i++) {
			str += "E";
		}

		System.out.println(str);
		int counter = 0;
		while (counter < Math.pow(4, n) - 1) {
			counter += 1;
		
			//increment the last letter
			str = str.substring(0 , str.length() - 1) + (char)((int)(str.charAt(str.length() - 1)) + 1);
			

			int index = str.length() - 1;
			//check through from the end backwards, changing each I and incrementing the letter before it
			while(str.charAt(index) == 'I') {
				String newStr = "";
				//rebuild the string, editing the I character
				for (int j = 0; j <= str.length() - 1; j++) {
					char letter = str.charAt(j);
					char nextLetter;
					if (j == str.length() - 1) {
						nextLetter = 'Z';
					} -else {
						nextLetter = str.charAt(j + 1);
					}
				
					if (nextLetter == 'I') {
						newStr += (char)((int)letter + 1);
					}
					else if (letter == 'I') {
						newStr += 'E';
					}
					else {
						newStr += letter;
					}
				}
				str = newStr;

				index -= 1;

			}
			
			System.out.println(str);
			
		}


	}
}