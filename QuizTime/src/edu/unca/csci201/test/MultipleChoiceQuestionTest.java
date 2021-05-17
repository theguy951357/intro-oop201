package edu.unca.csci201.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.unca.csci201.Answer;
import edu.unca.csci201.InvalidResponseException;
import edu.unca.csci201.MultipleChoiceAnswer;
import edu.unca.csci201.MultipleChoiceQuestion;
import edu.unca.csci201.NoAnswersException;
import edu.unca.csci201.NoCorrectAnswerException;

public class MultipleChoiceQuestionTest {

	private MultipleChoiceQuestion question;
	private String[] choices;

	@Before
	public void setUp() throws Exception {
		choices = new String[] { "A", "B", "C", "D" };
		question = new MultipleChoiceQuestion("The answer to this question is B", "B", choices);
	}

	@Test
	public void testGetTextPrompt() {

		assertTrue("Text prompt not returned correctly",
				question.getTextPrompt().equals("The answer to this question is B"));
	}

	@Test
	public void testGetPossibleAnswers() throws NoAnswersException {

		try {
			question.getPossibleAnswers();
		} catch (NoAnswersException e) {
			// Exception thrown successfully (true / false doesn't give a list of possible
			// answers)
			return;
		}

		// fail("Exception not thrown when true/false question asked for a list of
		// possible answers");
	}

	@Test
	public void testGetCorrectAnswer() throws NoCorrectAnswerException {
		Answer ans = question.getCorrectAnswer();

		MultipleChoiceAnswer tfAns = (MultipleChoiceAnswer) ans;

		assertTrue("Incorrect answer returned for the multiple choice question",
				tfAns.isSameAs(new MultipleChoiceAnswer("b")));

	}

	@Test
	public void testConvertResponseToAnswer() throws InvalidResponseException {
		Answer ans = question.convertResponseToAnswer("b");

		MultipleChoiceAnswer mcAns = (MultipleChoiceAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'b'",
				mcAns.isSameAs(new MultipleChoiceAnswer("b")));

		ans = question.convertResponseToAnswer("c");

		mcAns = (MultipleChoiceAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'c'",
				mcAns.isSameAs(new MultipleChoiceAnswer("c")));

		try {
			ans = question.convertResponseToAnswer("this is not a valid response");
		} catch (InvalidResponseException e) {
			// Correct exception thrown in response to invalid input
			return;
		}

		fail("Converting user response did not throw an exception when invalid input is received");

	}

}
