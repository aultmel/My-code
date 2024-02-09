import java.util.Scanner;

public class RefundsGalore {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("When did you cancel your Subprime service?");
		System.out.print("Month: ");
		int month = scnr.nextInt();
		System.out.print("Day: ");
		int day = scnr.nextInt();
		System.out.print("Year: ");
		int year = scnr.nextInt();

		boolean leapYear = isLeapYear(year);
		int daysPerMonth = daysInMonth(month, year);
		double fractionOfYear = fractionOfYearRemaining(month, day, year);
		final double SUBPRIME_COST = 238.0;
		double refund = SUBPRIME_COST * fractionOfYear;

		boolean validity = true;

		while (validity) {
			if (month < 1 || month > 12) {
				System.out.println("Sorry, " + month + "/" + day + "/" + year + " doesn't seem to be a valid date. Care to try again?");
				System.out.print("Month: ");
				month = scnr.nextInt();
				System.out.print("Day: ");
				day = scnr.nextInt();
				System.out.print("Year: ");
				year = scnr.nextInt();
			}
			else if (day > daysPerMonth || day < 0) {
				System.out.println("Sorry, " + month + "/" + day + "/" + year + " doesn't seem to be a valid date. Care to try again?");
				System.out.print("Month: ");
				month = scnr.nextInt();
				System.out.print("Day: ");
				day = scnr.nextInt();
				System.out.print("Year: ");
				year = scnr.nextInt();
			}
			else if (year < 2019) {
				System.out.println("Sorry, " + month + "/" + day + "/" + year + " doesn't seem to be a valid date. Care to try again?");
				System.out.print("Month: ");
				month = scnr.nextInt();
				System.out.print("Day: ");
				day = scnr.nextInt();
				System.out.print("Year: ");
				year = scnr.nextInt();
			}
			else {
				System.out.format("OK, you'll be issued a prorated refund of $%.2f. Thanks for using Subprime - disappointing customers since 2019!", refund);
				break;
			}
		}
	}

	public static boolean isLeapYear(int year) {
		boolean leapYear = false;
		if ((year % 4) == 0) {

			if ((year % 100) == 0 && (year % 400) != 0) {
				leapYear = false;
			}
			else if ((year % 400) == 0) {
				leapYear = true;
			}
			else {
				leapYear = true;
			}
		}
		return leapYear;
	}

	public static int daysInMonth(int month, int year) {
		boolean leapYear = isLeapYear(year);
		int daysPerMonth = 0;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			daysPerMonth = 30;
		}
		else if (month == 2) {
			if (leapYear) {
				daysPerMonth = 29;
			}
			else {
				daysPerMonth = 28;
			}
		}
		else {
			daysPerMonth = 31;
		}
		return daysPerMonth;
	}

	public static double fractionOfYearRemaining(int month, int day, int year) {
		boolean leapYear = isLeapYear(year);
		int sumOfDays = 0;
		int daysRemaining = 0;
		double fractionOfYear = 100;

		for (int i = 1; i < month; i++) {
			sumOfDays += daysInMonth(i, year);
		}
		sumOfDays += day;
		if (leapYear) {
			daysRemaining = 366 - sumOfDays;
			fractionOfYear = daysRemaining / 366.0;
		}
		else {
			daysRemaining = 365 - sumOfDays;
			fractionOfYear = daysRemaining / 365.0;
		}
		return fractionOfYear;
	}
}