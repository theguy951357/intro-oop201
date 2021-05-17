package edu.unca.csci201;

public class TrueFalseAnswer implements Answer {

	private boolean tfAnswer;

	public TrueFalseAnswer(boolean b) {

		this.tfAnswer = b;

	}

	@Override
	public boolean isSameAs(Answer other) {

		if (other.toString() == this.toString()) {

			return true;
		} else {

			return false;
		}
	}

	@Override
	public String toString() {

		if (tfAnswer == true) {

			return "true";
		} else {

			return "false";
		}
	}

}
