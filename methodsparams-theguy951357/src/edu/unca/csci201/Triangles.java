package edu.unca.csci201;

public class Triangles {

	public static void main(String[] args) {

		int size = CommonInput.input("Triangles", 1, 50);

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < size; j++) {

				for (int k = 0; k < (size - j); k++) {
					System.out.print(" ");
				}

				System.out.print("/");

				for (int k = j * 2; k > 0; k--) {
					if (j == size - 1)
						System.out.print("_");
					else
						System.out.print(" ");
				}
				System.out.println("\\");
			}

		}

	}
}
