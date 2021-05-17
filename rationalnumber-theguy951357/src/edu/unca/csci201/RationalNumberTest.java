package edu.unca.csci201;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class RationalNumberTest {

	@Test
	public void testCompareTo() {
		Comparable a = new RationalNumber(1, 2);
		Comparable b = new RationalNumber(2, 1);

		assertTrue("compareTo() does not return a negative number when the other object is larger", a.compareTo(b) < 0);
		assertTrue("compareTo() does not return a positive number when the other object is smaller",
				b.compareTo(a) > 0);
		assertTrue("compareTo() does not return zero when the other object is equal", a.compareTo(a) == 0);
		assertTrue("compareTo() does not return zero when the other object is equal 2", b.compareTo(b) == 0);

		Comparable c = new RationalNumber(1, 2);

		assertTrue("compareTo() does not return zero when the other object is equal 3", a.compareTo(c) == 0);

	}

	@Test
	public void testCompareToSigns() {

		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			Comparable a = new RationalNumber(rand.nextInt(200), rand.nextInt(200));
			Comparable b = new RationalNumber(rand.nextInt(200) - 200, rand.nextInt(200));

			assertTrue("compareTo() does not return the correct signs",
					Math.signum(a.compareTo(b)) == -Math.signum(b.compareTo(a)));

		}
	}

	@Test
	public void testCompareToTransitivity() {

		Comparable x = new RationalNumber(1, 2);
		Comparable y = new RationalNumber(1, 5);
		Comparable z = new RationalNumber(1, 10);

		assertTrue("compareTo() does not support transitivity",
				x.compareTo(y) > 0 && y.compareTo(z) > 0 && x.compareTo(z) > 0);

		Comparable a = new RationalNumber(1, 2);

		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			Comparable b = new RationalNumber(rand.nextInt(200), rand.nextInt(200));

			assertTrue("compareTo() does not support transitivity 2",
					x.compareTo(a) == 0 && Math.signum(x.compareTo(b)) == Math.signum(a.compareTo(b)));

		}

	}

}
