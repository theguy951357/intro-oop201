package edu.unca.csci201;

public class Stars {

	public static void main(String[] args) {

		int number = CommonInput.input("Stars", 1, 100);

		for (int i = 0; i < number; i++) {
			System.out.println("       **** ");
			System.out.println("   \\ *      * /");
			System.out.println("  \\ *  ~   ~ * /");
			System.out.println("   *          * ");
			System.out.println("   *          *");
			System.out.println("  / *  \\---/ * \\");
			System.out.println("   / *      * \\");
			System.out.println("       **** ");
			System.out.println();
		}
	}

}
