package edu.unca.csci201;

public class Diamond {
	public static void diamond() {

		diamondTop();
		diamondBottom();
	}

	public static void diamondTop() {
		System.out.println("    /\\   ");
		System.out.println("   /  \\    ");
		System.out.println("  /    \\    ");

	}

	public static void diamondBottom() {
		System.out.println("  \\    /   ");
		System.out.println("   \\  /   ");
		System.out.println("    \\/    ");

		System.out.println();

	}
}
