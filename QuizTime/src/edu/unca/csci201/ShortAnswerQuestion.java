package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {

	private String question;

	private Answer[] answers = { new ShortAnswer(" ") };

	public ShortAnswerQuestion(String question) {

		this.question = question;

	}

	@Override
	public String getTextPrompt() {

		return question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {

		return answers;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {

		throw new NoCorrectAnswerException();
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {

		return new ShortAnswer(userResponse);

	}

}
