package edu.unca.csci201;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	private Scanner scan = new Scanner(System.in);
	private int count = 0;
	private int shortAnswerCount = 0;
	private double score;
	private double scoreCount = 0.0;

	private String[][] wrongAnswers = new String[0][4];
	private String[] wrongAnswer;
	private String prompt;
	private String input;

	private Answer[] possibleAnswers;
	private Answer enteredAnswer;
	private Answer answer;

	private Question[] questions = new Question[0];
	private Question question;

	public void addQuestion(Question question) throws QuizFullException {

		if (count >= 25) {

			System.out.println("no more than 25 questions");
			throw new QuizFullException();

		}
		questions = Arrays.copyOf(questions, questions.length + 1);

		questions[count] = question;

		count++;

	}

	public double giveQuiz() throws QuizBaseException {

		score = 0.0;

		try {
			for (int i = 0; i < questions.length; i++) {

				question = questions[i];
				prompt = question.getTextPrompt().toString();
				System.out.println((i + 1) + ") " + prompt);
				possibleAnswers = question.getPossibleAnswers();

				for (int j = 0; j < possibleAnswers.length; j++) {

					System.out.println(possibleAnswers[j].toString());
				}

				if (scan.hasNext()) {

					input = scan.nextLine();
				}

				try {

					enteredAnswer = question.convertResponseToAnswer(input);

				} catch (InvalidResponseException e1) {

					System.out.println("that is an invalid response. try again");
					i--;
					continue;
				}

				if (question instanceof ShortAnswerQuestion) {
					shortAnswerCount++;
					try {

						answer = question.getCorrectAnswer();
					} catch (NoCorrectAnswerException e) {

						System.out.println(
								"This question will be reviewed later and will not count towards your grade yet.");

					}

				} else {

					answer = question.getCorrectAnswer();

					if (answer.isSameAs(enteredAnswer)) {

						scoreCount++;

					} else {

						wrongAnswer = new String[4];
						wrongAnswer[0] = "***************************";
						wrongAnswer[1] = "The question was: " + prompt;
						wrongAnswer[2] = "You answered: " + enteredAnswer.toString();
						wrongAnswer[3] = "The correct answer is: " + answer.toString();
						wrongAnswers = Arrays.copyOf(wrongAnswers, wrongAnswers.length + 1);
						wrongAnswers[wrongAnswers.length - 1] = wrongAnswer;
					}
				}
			}
		} catch (QuizBaseException e) {

		}

		score += (scoreCount / (questions.length - shortAnswerCount)) * 100;

		score = Math.round(score * 100.0) / 100.0;

		return score;
	}

	public String[][] getWrongAnswers() {

		return wrongAnswers;
	}

}
