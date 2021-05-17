package edu.unca.csci201.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.unca.csci201.Answer;
import edu.unca.csci201.InvalidResponseException;
import edu.unca.csci201.NoAnswersException;
import edu.unca.csci201.NoCorrectAnswerException;
import edu.unca.csci201.ShortAnswer;
import edu.unca.csci201.ShortAnswerQuestion;

public class ShortAnswerQuestionTest {

	private ShortAnswerQuestion question;

	private String questionPrompt = "Explain this craziness!!!!";

	private Answer answer = new ShortAnswer("don't worry about it");

	@Before
	public void setUp() throws Exception {
		question = new ShortAnswerQuestion(questionPrompt);
	}

	@Test
	public void testGetTextPrompt() {

		assertTrue("Text prompt not returned correctly", question.getTextPrompt().equals(questionPrompt));
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

		assertTrue("test should only return one answer with 'don't worry about it' as a parameter",
				question.getPossibleAnswers()[0].isSameAs(answer));
	}

	@Test
	public void testGetCorrectAnswer() throws NoCorrectAnswerException {

		try {
			Answer ans = question.getCorrectAnswer();
		} catch (NoCorrectAnswerException e) {
			System.out.println("This question will be reviewed later and will not count towards your grade yet.");
			return;
		}

		fail("Exception not thrown when question asked for correct answer");

	}

	@Test
	public void testConvertResponseToAnswer() throws InvalidResponseException {
		Answer ans = question.convertResponseToAnswer("b");

		ShortAnswer sAns = (ShortAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'b'", sAns.isSameAs(new ShortAnswer("b")));

		ans = question.convertResponseToAnswer("c");

		sAns = (ShortAnswer) ans;

		assertTrue("Incorrect answer returned converting user response 'c'", sAns.isSameAs(new ShortAnswer("c")));

	}

}
