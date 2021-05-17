package edu.unca.csci201.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.unca.csci201.Answer;
import edu.unca.csci201.FillInTheBlankQuestion;
import edu.unca.csci201.InvalidResponseException;
import edu.unca.csci201.NoAnswersException;
import edu.unca.csci201.NoCorrectAnswerException;
import edu.unca.csci201.SingleWordAnswer;

public class FillInTheBlankQuestionTest {

	private FillInTheBlankQuestion question;

	@Before
	public void setUp() throws Exception {
		question = new FillInTheBlankQuestion("put 'a' in the blank ____", "a");
	}

	@Test
	public void testGetTextPrompt() {

		assertTrue("Text prompt not returned correctly", question.getTextPrompt().equals("put 'a' in the blank ____"));
	}

	@Test
	public void testGetPossibleAnswers() throws NoAnswersException {

		try {
			question.getPossibleAnswers();
		} catch (NoAnswersException e) {
			// Exception thrown successfully (fill in the blank doesn't give a list of
			// possible
			// answers)
			return;
		}

		// fail("Exception not thrown when question asked for a list of
		// possible answers");
	}

	@Test
	public void testGetCorrectAnswer() throws NoCorrectAnswerException {
		Answer ans = question.getCorrectAnswer();

		SingleWordAnswer swAns = (SingleWordAnswer) ans;

		assertTrue("Incorrect answer returned for the fill in the blank question",
				swAns.isSameAs(new SingleWordAnswer("a")));

	}

	@Test
	public void testConvertResponseToAnswer() throws InvalidResponseException {
		Answer ans = question.convertResponseToAnswer("b");

		SingleWordAnswer swAns = (SingleWordAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'b'", swAns.isSameAs(new SingleWordAnswer("b")));

		ans = question.convertResponseToAnswer("c");

		swAns = (SingleWordAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'c'", swAns.isSameAs(new SingleWordAnswer("c")));

		try {
			ans = question.convertResponseToAnswer("this is not a valid response");
		} catch (InvalidResponseException e) {
			// Correct exception thrown in response to invalid input
			return;
		}

		fail("Converting user response did not throw an exception when invalid input is received");

	}

}
