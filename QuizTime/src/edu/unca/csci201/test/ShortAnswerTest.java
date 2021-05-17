package edu.unca.csci201.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.unca.csci201.ShortAnswer;
import edu.unca.csci201.SingleWordAnswer;

public class ShortAnswerTest {

	@Test
	public void testCreateSingleWordAnswer() {

		ShortAnswer answer1 = new ShortAnswer("B");
		ShortAnswer answer2 = new ShortAnswer("not B");

	}

	@Test
	public void testIsSameAs() {

		ShortAnswer answer1 = new ShortAnswer("B");
		ShortAnswer answer2 = new ShortAnswer("B");
		ShortAnswer answer3 = new ShortAnswer("not B");

		assertTrue("IsSameAs() should always assert true", answer1.isSameAs(answer1));
		assertTrue("IsSameAs() should always assert true", answer2.isSameAs(answer2));
		assertTrue("IsSameAs() should always assert true", answer1.isSameAs(answer2));
		assertTrue("IsSameAs() should always assert true", answer1.isSameAs(answer3));

	}

	@Test
	public void testToString() {
		SingleWordAnswer answer1 = new SingleWordAnswer("B");
		SingleWordAnswer answer2 = new SingleWordAnswer("not B");

		assertTrue("toString() does not output 'B'", answer1.toString().equalsIgnoreCase("B"));
		assertTrue("toString() does not output 'not B'", answer2.toString().equalsIgnoreCase("not B"));

	}

}
