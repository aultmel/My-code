import java.util.Scanner;

public class RefundsGalore {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scnr.nextInt();
		System.out.println(isLeapYear(year));
	}

	public static boolean isLeapYear(int year) {
		boolean leapYear;
		if ((year % 4) == 0) {
			if ((year % 100) == 0 && (year % 400) != 0) {
				leapYear = false;
			}
			else if ((year % 400) == 0) {
				leapYear = true;
			}
		}
		return leapYear;
	}
}