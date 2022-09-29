import java.util.Scanner;

public class CalendarDates {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//Get user input
		System.out.println("What day of the week was Jan. 1? Enter 0 for Sunday, 1 for Monday, etc.");
		int numJanfirst = scnr.nextInt();

		//Set variables and create formulas to find answer
		int numMonthsmay = numJanfirst + 31 + 28 + 31 + 30;
		int numMonthsnov = numJanfirst + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		int numMayfirst = numMonthsmay%7;
		int numNovfirst = numMonthsnov%7;

		//Display results on screen
		System.out.println("The day of the week of May 1: " + numMayfirst);
		System.out.println("The day of the week of Nov. 1: " + numNovfirst); 

	}
}