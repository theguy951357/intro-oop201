package edu.unca.csci201;

import java.util.Scanner;

public class CommonInput {

	public static int input(String shape, int min, int max) {

		int size;
		String question = "make sure you asked for triangles or stars.";

		if (shape.equalsIgnoreCase("Triangles")) {
			question = "How big do you want your " + shape + "? (" + min + " - " + max + ") ";
		} else {
			question = "How many " + shape + " do you want? (" + min + " - " + max + ") ";
		}

		do {
			System.out.print(question);
			Scanner scan = new Scanner(System.in);

			size = scan.nextInt();
		} while (size < min || size > max);

		return size;
	}
}
