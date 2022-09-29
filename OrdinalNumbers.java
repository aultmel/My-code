import java.util.Scanner;

public class OrdinalNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int userInput = scnr.nextInt();
		System.out.println(toOrdinal(userInput));
	}

	public static String toOrdinal(int userNum) {
		userNum = (String)userNum;
		char lastNum = userNum.charAt(userNum.length - 1);
		char penultNum = userNum.charAt(userNum.length - 2);
		String ordinalNum;
		if (userNum.length == 1) {
			if (lastNum == 1) {
				ordinalNum = userNum + "st";
			}
			else if (lastNum == 2) {
				ordinalNum = userNum + "nd";
			}
			else if (lastNum == 3) {
				ordinalNum = userNum + "rd";
			}	
		}
		else if ((int)userNum < 0) {
			ordinalNum = "invalid";
		}
		else {
			if (lastNum == 1 && penultNum != 1) {
				ordinalNum = userNum + "st";
			}
			else if (lastNum == 2 && penultNum != 1) {
				ordinalNum = userNum + "nd";
			}
			else if (lastNum == 3 && penultNum != 1) {
				ordinalNum = userNum + "rd";
			}
			else {
				ordinalNum = userNum + "th";
			}
			return ordinalNum;
		}

	}