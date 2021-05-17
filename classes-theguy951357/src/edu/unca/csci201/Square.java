package edu.unca.csci201;

public class Square {
	public static void square() {

		squareTop();
		squareBottom();
	}

	public static void squareTop() {
		System.out.println(" |------|");
		System.out.println(" |      |");
		System.out.println(" |      |");
	}

	public static void squareBottom() {
		System.out.println(" |      |");
		System.out.println(" |      |");
		System.out.println(" |------|");

		System.out.println();
	}
}
