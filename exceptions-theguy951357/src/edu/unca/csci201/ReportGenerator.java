package edu.unca.csci201;

import java.util.Scanner;

public class ReportGenerator {

	public static void main(String[] args) throws SalesReportBaseException {

		Scanner scan = new Scanner(System.in);

		SalesReport report = null;

		do {
			try {

				System.out.print("Enter data file name: ");
				String filename = scan.nextLine();

				report = new SalesReport(filename);

				break;
			} catch (SalesReportMissingFileException e) {
				System.out.println("File not found, please try again");
				continue;
			}
		} while (true);

		System.out.println();
		System.out.println("Full Results");
		System.out.println();
		System.out.println(report.getAverage() + " (" + report.getStdDev() + ")");

		System.out.println();
		System.out.println("Quarterly results");
		System.out.println();

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println((i + 1) + ": " + report.getQuarterAverage(i + 1) + "\t("
						+ report.getQuarterStdDev(i + 1) + ")");
			} catch (SalesReportNotEnoughDataException e) {
				System.out.println("Not enough data. ");
			}
		}

		System.out.println("Total number of bad entries: " + report.getBadData());

	}

}
