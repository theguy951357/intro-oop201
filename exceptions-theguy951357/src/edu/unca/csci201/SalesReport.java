package edu.unca.csci201;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class SalesReport {

	Scanner dataFile;
	double[] allData;
	double[] quarter1data;
	double[] quarter2data;
	double[] quarter3data;
	double[] quarter4data;
	int badData = 0;

	public SalesReport(String filename) throws SalesReportBaseException {
		try {
			dataFile = new Scanner(new FileReader(filename));
		} catch (FileNotFoundException e) {
			throw new SalesReportMissingFileException();
		}

		// read in each data point, validate, add to appropriate data sets

		allData = new double[0];
		quarter1data = new double[0];
		quarter2data = new double[0];
		quarter3data = new double[0];
		quarter4data = new double[0];

		while (dataFile.hasNext()) {

			try {

				double amount = dataFile.nextDouble();
				int month = dataFile.nextInt();

				validateDataPoint(amount, month);

				int quarter = 1;
				if (month >= 4 && month <= 6)
					quarter = 2;
				else if (month >= 7 && month <= 9)
					quarter = 3;
				else if (month >= 10 && month <= 12)
					quarter = 4;

				addToArrays(amount, quarter);

			} catch (SalesReportBadDataException f) {
				badData++;
			} catch (SalesReportBaseException e) {
				// bad data point, just ignore it for now
			}
		}

	}

	public void validateDataPoint(double amount, int month) throws SalesReportBadDataException {

		// can't have negative sales! (we hope)

		// No one can sell more than 1000, this has to be an error

		// Month can't be less than 1

		// Month can't be greater than 12

		if (amount < 0 || amount > 1000 || month < 1 || month > 12) {
			throw new SalesReportBadDataException();
		}

	}

	public int getBadData() {
		return badData;
	}

	public double getAverage() throws SalesReportNotEnoughDataException {
		Calculator c = new Calculator(allData);

		return c.getAverage();
	}

	public double getStdDev() throws SalesReportNotEnoughDataException {
		Calculator c = new Calculator(allData);

		return c.getStdDev();
	}

	public double getQuarterAverage(int quarter) throws SalesReportNotEnoughDataException {
		Calculator c;

		if (quarter == 1)
			c = new Calculator(quarter1data);
		else if (quarter == 2)
			c = new Calculator(quarter2data);
		else if (quarter == 3)
			c = new Calculator(quarter3data);
		else
			c = new Calculator(quarter4data);

		return c.getAverage();
	}

	public double getQuarterStdDev(int quarter) throws SalesReportNotEnoughDataException {
		Calculator c;
		if (quarter == 1)
			c = new Calculator(quarter1data);
		else if (quarter == 2)
			c = new Calculator(quarter2data);
		else if (quarter == 3)
			c = new Calculator(quarter3data);
		else
			c = new Calculator(quarter4data);

		return c.getStdDev();
	}

	public void addToArrays(double data, int quarter) {

		allData = Arrays.copyOf(allData, allData.length + 1);
		allData[allData.length - 1] = data;

		if (quarter == 1) {
			quarter1data = Arrays.copyOf(quarter1data, quarter1data.length + 1);
			quarter1data[quarter1data.length - 1] = data;
		} else if (quarter == 2) {
			quarter2data = Arrays.copyOf(quarter2data, quarter2data.length + 1);
			quarter2data[quarter2data.length - 1] = data;
		} else if (quarter == 3) {
			quarter3data = Arrays.copyOf(quarter3data, quarter3data.length + 1);
			quarter3data[quarter3data.length - 1] = data;
		} else if (quarter == 4) {
			quarter4data = Arrays.copyOf(quarter4data, quarter4data.length + 1);
			quarter4data[quarter4data.length - 1] = data;
		}
	}
}
