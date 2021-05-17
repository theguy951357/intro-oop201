import java.util.Scanner;

public class DoubleFeature {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double total = 0;
		// this first block takes coins and gives a total dollar amount.
		{

			int quarter = 25;
			int dime = 10;
			int nickel = 5;
			int penny = 1;

			System.out.print("How many quarters do you have? ");
			total += (quarter * scan.nextInt());

			System.out.print("How many dimes do you have? ");
			total += (dime * scan.nextInt());

			System.out.print("How many nickels do you have? ");
			total += (nickel * scan.nextInt());

			System.out.print("How many pennies do you have? ");
			total += (penny * scan.nextInt());

			System.out.println("The total is: $" + total / 100);

			total = 0;

		}

		// this next block takes a numerator and a denominator and outputs a decimal.

		{
			System.out.print("gimme da numerata. ");
			double numerator = scan.nextDouble();

			System.out.print("gimme da denominata. ");
			double denominator = scan.nextDouble();

			total += (numerator / denominator);

			System.out.println(total);

			total = 0;

		}

	}

}
