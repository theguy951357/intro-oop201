package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	private String question;

	private boolean answer;

	private TrueFalseAnswer tfAnswer;
	private TrueFalseAnswer wrong;
	private Answer[] possibleAnswers = new Answer[2];

	public TrueFalseQuestion(String question, boolean answer) {

		this.question = question;
		this.answer = answer;
		this.tfAnswer = new TrueFalseAnswer(answer);
		this.wrong = new TrueFalseAnswer(!answer);

	}

	@Override
	public String getTextPrompt() {

		return question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {

		if (answer == true) {

			possibleAnswers[0] = tfAnswer;
			possibleAnswers[1] = wrong;
		} else {

			possibleAnswers[0] = wrong;
			possibleAnswers[1] = tfAnswer;
		}

		if (possibleAnswers[0] == null) {

			throw new NoAnswersException();
		}

		return possibleAnswers;

	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {

		return tfAnswer;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {

		if (userResponse.equalsIgnoreCase("t") || userResponse.equalsIgnoreCase("true")) {

			return new TrueFalseAnswer(true);
		} else if (userResponse.equalsIgnoreCase("f") || userResponse.equalsIgnoreCase("false")) {

			return new TrueFalseAnswer(false);
		} else {

			throw new InvalidResponseException();
		}

	}

}
