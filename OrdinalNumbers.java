import java.util.Scanner;

public class OrdinalNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter lower limit: ");
		int lowerLimit = scnr.nextInt();
		System.out.print("Enter upper limit: ");
		int upperLimit = scnr.nextInt();
		System.out.println("");
		for (int i = lowerLimit; i <= upperLimit; i++) {
			System.out.println(toOrdinal(i));
		}
	}

	public static String toOrdinal(int userNum) {
		String userNumStr = Integer.toString(userNum);
		char lastNum = userNumStr.charAt(userNumStr.length() - 1);
		String ordinalNum = "";
		if (userNum < 0) {
			ordinalNum = "invalid";
		}
		else if (userNumStr.length() == 1) {
			if (lastNum == '1') {
				ordinalNum = userNumStr + "st";
			}
			else if (lastNum == '2') {
				ordinalNum = userNumStr + "nd";
			}
			else if (lastNum == '3') {
				ordinalNum = userNumStr + "rd";
			}	
			else {
				ordinalNum = userNumStr + "th";
			}
		}
		else {
			char penultNum = userNumStr.charAt(userNumStr.length() - 2);
			if (lastNum == '1' && penultNum != '1') {
				ordinalNum = userNumStr + "st";
			}
			else if (lastNum == '2' && penultNum != '1') {
				ordinalNum = userNumStr + "nd";
			}
			else if (lastNum == '3' && penultNum != '1') {
				ordinalNum = userNumStr + "rd";
			}
			else {
				ordinalNum = userNumStr + "th";
			}
		}
		return ordinalNum;
	}
}