package edu.unca.csci201;

public class ShortAnswer implements Answer {

	private String answer;

	public ShortAnswer(String answer) {

		this.answer = answer;
	}

	@Override
	public boolean isSameAs(Answer other) {

		return true;
	}

	@Override
	public String toString() {

		return answer;
	}

}
