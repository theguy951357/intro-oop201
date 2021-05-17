package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	private String question;
	private String alpha;
	private String choice;
	private String[] choices;

	private MultipleChoiceAnswer answer;

	private char alphabet = 'a';

	private Answer[] answers;

	public MultipleChoiceQuestion(String question, String answer, String[] choices) {

		this.question = question;
		this.answer = new MultipleChoiceAnswer(answer);
		this.choices = new String[choices.length];
		for (int i = 0; i < choices.length; i++) {
			alpha = String.valueOf(this.alphabet);
			this.choices[i] = alpha + " ) " + choices[i];
			this.alphabet++;
		}
	}

	@Override
	public String getTextPrompt() {

		return question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {

		answers = new Answer[choices.length];
		for (int i = 0; i < answers.length; i++) {

			answers[i] = new MultipleChoiceAnswer(this.choices[i]);
		}
		if (choices == null) {

			throw new NoAnswersException();
		}
		return answers;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {

		for (int i = 0; i < choices.length; i++) {

			if (this.choices[i].substring(0, 1).equalsIgnoreCase(answer.toString())) {

				return answer;
			}
		}
		throw new NoCorrectAnswerException();

	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {

		for (int i = 0; i < this.choices.length; i++) {

			choice = this.choices[i].substring(0, 1);
			if (userResponse.equalsIgnoreCase(choice)) {

				return new MultipleChoiceAnswer(userResponse);
			}

		}

		throw new InvalidResponseException();

	}

}
