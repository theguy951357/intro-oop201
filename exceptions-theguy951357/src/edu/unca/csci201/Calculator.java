package edu.unca.csci201;

public class Calculator {

	double [] dataPoints;
	double average;
	boolean averageComputed;
	
	double stddev;
	boolean stddevComputed;
	
	public Calculator (double [] data) {
		dataPoints = data;
		averageComputed = false;
		stddevComputed = false;
	}
	
	public double getAverage() throws SalesReportNotEnoughDataException{
		if (averageComputed)
			return average;
		
		if (dataPoints == null || dataPoints.length == 0)
			throw new SalesReportNotEnoughDataException();
		
		double sum = 0;
		for (double d : dataPoints) {
			sum += d;
		}
		average = sum / dataPoints.length;
		
		return average;
	}
	
	public double getStdDev() throws SalesReportNotEnoughDataException {
		if (stddevComputed)
			return stddev;
		
		
		if (dataPoints == null || dataPoints.length <= 1)
			throw new SalesReportNotEnoughDataException();

		double avg = getAverage();
		
		double difference = 0;
		for (double d : dataPoints) {
			difference += Math.pow(d - avg, 2);
		}
		difference /= dataPoints.length - 1;
		
		stddev = Math.sqrt(difference);
		
		return stddev;

	}
}
