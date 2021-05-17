package edu.unca.csci201;

public class FillInTheBlankQuestion implements Question {

	private String question;
	private String stringAnswer;

	private Answer answer;
	private Answer[] answers = { new SingleWordAnswer("____") };

	public FillInTheBlankQuestion(String question, String answer) {

		this.question = question;
		this.stringAnswer = answer;
		this.answer = new SingleWordAnswer(answer);
	}

	@Override
	public String getTextPrompt() {

		return question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {

		if (answers[0] == null) {
			throw new NoAnswersException();
		}

		return answers;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {

		if (stringAnswer.equalsIgnoreCase(answer.toString())) {
			return answer;
		}
		throw new NoCorrectAnswerException();
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {

		if (userResponse.contains(" ")) {

			throw new InvalidResponseException();
		}
		return new SingleWordAnswer(userResponse);

	}

}
