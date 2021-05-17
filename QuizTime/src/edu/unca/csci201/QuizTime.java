package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) throws QuizBaseException {

		Quiz myQuiz = new Quiz();
		fillQuiz(myQuiz);

		double score = myQuiz.giveQuiz();

		System.out.println(score);
		String[][] wrongAnswers = myQuiz.getWrongAnswers();
		for (int i = 0; i < wrongAnswers.length; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.println(wrongAnswers[i][j]);
			}
		}
	}

	public static void fillQuiz(Quiz quiz) throws QuizFullException {

		quiz.addQuestion(new MultipleChoiceQuestion("In the original Pac-Man, what happens at level 256?", "b",
				new String[] { "Ghost party.", "A kill screen.", "it resets to level one", "nothing happens" }));
		quiz.addQuestion(new ShortAnswerQuestion("Why would that happen?"));
		quiz.addQuestion(new TrueFalseQuestion("I currently work in a bong warehouse", true));
		quiz.addQuestion(
				new MultipleChoiceQuestion("At one point, Connecticut's Wikipedia had what as its state dinosaur", "e",
						new String[] { "The baby dinosaur from Dinosaurs", "Malcom from jurassic park", "Spinosaurus",
								"Raptor", "Reptar from Rugrats", "Stegosaurus", "Galamimus" }));
		quiz.addQuestion(new FillInTheBlankQuestion("Giggity", "Goo"));
		quiz.addQuestion(new FillInTheBlankQuestion("My Great Great uncle has a ______ named after him.", "Mountain"));
		quiz.addQuestion(
				new TrueFalseQuestion("Christopher Lee, when he was alive, sang in a symphonic metal band.", true));
		quiz.addQuestion(new ShortAnswerQuestion("In the world of machine learning, what is overfitting?"));
		quiz.addQuestion(new TrueFalseQuestion("Android uses HTML for its front end.", false));
		quiz.addQuestion(new ShortAnswerQuestion("I have lost the remote. Do you know where it is?"));
		quiz.addQuestion(new MultipleChoiceQuestion(
				"The Andean Condor can fly for over ____ hours without flapping, covering over 170km.", "e",
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
	}

}
