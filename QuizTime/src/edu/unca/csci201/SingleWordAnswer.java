package edu.unca.csci201;

public class SingleWordAnswer implements Answer {

	private String answer;

	public SingleWordAnswer(String answer) {

		this.answer = answer;
	}

	@Override
	public boolean isSameAs(Answer other) {

		if (other.toString().equalsIgnoreCase(this.toString())) {

			return true;
		} else {

			return false;
		}
	}

	@Override
	public String toString() {

		return answer;
	}
}
