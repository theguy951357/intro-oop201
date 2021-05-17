import java.util.Random;
import java.util.Scanner;

public class HiLo {

	private enum Difficulty {
		EASY, MEDIUM, HARD
	};

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String answer;

		hiLo();
		System.out.print("would you like to play again? ");
		answer = scan.next();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			System.out.println("Ok. lets play again!");
		} else {
			System.out.println("I'll take that as a no.");
		}
		while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			hiLo();
			System.out.print("would you like to play again? ");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {

				System.out.println("Ok. lets play again!");
			} else {

				System.out.println("I'll take that as a no.");
			}
		}
	}

	public static void hiLo() {
		// a guess the number game against a computer opponent.

		Random rand = new Random();

		System.out.print("pick a minimum number: ");
		int min = scan.nextInt();

		System.out.print("pick a maximum number");
		int max = scan.nextInt();

		System.out.print("Easy, Medium, or Hard?");
		String level = scan.next();
		while (!(level.equalsIgnoreCase("easy") || level.equalsIgnoreCase("medium")
				|| level.equalsIgnoreCase("hard"))) {
			System.out.print("Easy, Medium, or Hard?");
			level = scan.next();
		}
		int diffmult = 0;
		Difficulty difficulty = Difficulty.valueOf(level.toUpperCase());
		switch (difficulty) {
		case EASY:
			diffmult = 10;
			break;
		case MEDIUM:
			diffmult = 5;
			break;
		case HARD:
			diffmult = 1;
			break;
		}

		int number = rand.nextInt(max - min + 1) + min;

		int numGuess = 1;

		int opponent = 1;
		int oppMax = max;
		int oppMin = min;
		int oppGuess = rand.nextInt(oppMax - oppMin + 1) + min;

		System.out.print("guess a number between " + min + " and " + max + ": ");
		int guess = scan.nextInt();
		while (guess > max || guess < min) {
			System.out.print("that number is not between " + min + " and " + max + " guess another one: ");
			numGuess++;
			guess = scan.nextInt();

		}

		while (guess != number) {
			if (guess < number) {
				if (number - guess > 100) {
					System.out.print("way way too low. guess again: ");
				} else if (number - guess > 10 && number - guess < 100) {
					System.out.print("way too low. guess again: ");
				} else if (guess - number < 10) {
					System.out.print("too low, but sooooo close. guess again: ");
				}

				numGuess++;
				guess = scan.nextInt();

			}

			if (guess > number) {
				if (guess - number > 100) {
					System.out.print("way way too high. guess again: ");
				} else if (guess - number > 10 && guess - number < 100) {
					System.out.print("way too high. guess again: ");
				} else if (guess - number < 10) {
					System.out.print("too high, but sooooo close. guess again: ");
				}
				numGuess++;
				guess = scan.nextInt();
			}
		}

		while (oppGuess != number) {
			if (oppGuess < number) {
				oppMin = oppGuess;

				opponent += diffmult;
				oppGuess = oppMax - ((oppMax - oppMin) / 2);

			}

			if (oppGuess > number) {

				oppMax = oppGuess;
				opponent += diffmult;
				oppGuess = oppMin + ((oppMax - oppMin) / 2);
			}
		}

		String champion;

		if (numGuess < opponent) {
			champion = "you";
		} else {
			champion = "the computer";
		}

		System.out.print("you got it right in " + numGuess + " guesses!!!\r\nYour opponent got " + opponent
				+ " guesses!!!!\r\nThe correct number is " + number + "!!!!\r\nThe winner is..." + champion
				+ "!!!\r\n");
	}

}
