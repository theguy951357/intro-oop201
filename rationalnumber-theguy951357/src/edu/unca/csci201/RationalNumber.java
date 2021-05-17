package edu.unca.csci201;

public class RationalNumber implements Comparable<RationalNumber> {

	private int numerator, denominator;

	public RationalNumber(int numer, int denom) {
		if (denom == 0)
			denom = 1;

		if (denom < 0) {
			numer *= -1;
			denom *= -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	// Copy constructor
	public RationalNumber(RationalNumber other) {

		numerator = other.numerator;
		denominator = other.denominator;
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public RationalNumber reciprocal() {

		return new RationalNumber(denominator, numerator);
	}

	public RationalNumber add(RationalNumber other) {

		int cd = denominator * other.denominator;
		int num1 = numerator * other.denominator;
		int num2 = other.numerator * denominator;

		return new RationalNumber(num1 + num2, cd);
	}

	public RationalNumber subtract(RationalNumber other) {
		int cd = denominator * other.denominator;
		int num1 = numerator * other.denominator;
		int num2 = other.numerator * denominator;

		return new RationalNumber(num1 - num2, cd);

	}

	private void reduce() {

		if (numerator != 0) {

			int common = gcd(Math.abs(numerator), denominator);

			numerator /= common;
			denominator /= common;
		}
	}

	private int gcd(int num1, int num2) {

		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
			} else {

				num2 -= num1;
			}
		}
		return num1;
	}

	public String toString() {

		return numerator + "/" + denominator;
	}

	@Override
	public int compareTo(RationalNumber o) {
		if (this.numerator * o.denominator > this.denominator * o.numerator) {
			return 1;
		} else if (this.numerator * o.denominator < this.denominator * o.numerator) {
			return -1;
		}
		return 0;
	}

}
