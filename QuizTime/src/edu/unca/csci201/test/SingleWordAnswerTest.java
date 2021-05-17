package edu.unca.csci201.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.unca.csci201.SingleWordAnswer;

public class SingleWordAnswerTest {

	@Test
	public void testCreateSingleWordAnswer() {

		SingleWordAnswer answer1 = new SingleWordAnswer("B");
		SingleWordAnswer answer2 = new SingleWordAnswer("not B");

	}

	@Test
	public void testIsSameAs() {

		SingleWordAnswer answer1 = new SingleWordAnswer("B");
		SingleWordAnswer answer2 = new SingleWordAnswer("B");
		SingleWordAnswer answer3 = new SingleWordAnswer("not B");

		assertTrue("IsSameAs() fails self-test for true", answer1.isSameAs(answer1));
		assertTrue("IsSameAs() fails self-test for false", answer2.isSameAs(answer2));
		assertTrue("IsSameAs() fails for true", answer1.isSameAs(answer2));
		assertFalse("IsSameAs() fails for false", answer1.isSameAs(answer3));

	}

	@Test
	public void testToString() {
		SingleWordAnswer answer1 = new SingleWordAnswer("B");
		SingleWordAnswer answer2 = new SingleWordAnswer("not B");

		assertTrue("toString() does not output 'B'", answer1.toString().equalsIgnoreCase("B"));
		assertTrue("toString() does not output 'not B'", answer2.toString().equalsIgnoreCase("not B"));

	}

}
