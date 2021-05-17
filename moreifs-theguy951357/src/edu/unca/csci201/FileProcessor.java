package edu.unca.csci201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	public static void main(String[] args) throws FileNotFoundException {

		DataFilter df;

		df = new VowelsFilter();// Create your data filter object here!

		Scanner scan = new Scanner(new File("randomwords.txt"));

		while (scan.hasNext()) {

			String nextLine = scan.nextLine().trim();

			if (nextLine.length() > 0 && df.shouldBePrinted(nextLine)) {

				System.out.println(nextLine);
			}
		}

	}

}
