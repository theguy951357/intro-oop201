package edu.unca.csci201;

public class Captcha {

	private int x;

	private int y;

	public Captcha(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getQuestion() {
		return "what is " + x + "+" + y + "?";
	}

	public boolean runCheck(int input) {
		if (this.x + this.y == input) {
			return true;
		}

		return false;
	}

}
