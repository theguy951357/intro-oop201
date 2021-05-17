import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// takes in a year and tells if it is a leap year.

		Scanner scan = new Scanner(System.in);

		System.out.print("Tell me a year: ");
		int year = scan.nextInt();

		boolean isLeapYear = false;

		if (year < 1582) {
			System.out.print("The Gregorian calender was not around then. Gimme another year: ");
			year = scan.nextInt();
		}

		if (year % 4 == 0) {
			isLeapYear = true;
		}

		if (year % 100 == 0) {
			isLeapYear = false;
		}

		if (year % 400 == 0) {
			isLeapYear = true;
		}

		if (isLeapYear) {
			System.out.println("That is a leap year");
		} else {
			System.out.println("that is not a leap year");
		}

	}

}
