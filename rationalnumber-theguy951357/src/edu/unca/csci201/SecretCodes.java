package edu.unca.csci201;

import java.util.Scanner;

public class SecretCodes {

	public static void main(String[] args) {

		String password = "java";

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the password: ");
		String entered = scan.nextLine();

		if (password.equalsIgnoreCase(entered)) {

			System.out.print("Good guess, now solve the following math problem: what is 11 divided by 10?");
			double d = scan.nextDouble();
			scan.nextLine();

			double comparison = 0.0;
			for (int i = 0; i < 11; i++) {
				comparison += 0.1;
			}

			if (Math.abs(d - comparison) < 0.00000001) {

				System.out.print(
						"I almost believe you are ready for the secret!\nOne final question, enter a letter that is less than B : ");
				char c = scan.nextLine().toUpperCase().charAt(0);
				if (c < 'B') {
					System.out.println(
							"You did it! Unfortunately, I forgot the secret.  Oh well, it's the journey not the destination right?");
				}
			}

		}
	}

}
