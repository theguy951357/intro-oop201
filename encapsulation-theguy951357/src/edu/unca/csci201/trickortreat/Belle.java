package edu.unca.csci201.trickortreat;

public class Belle extends TrickOrTreater {

	public String visitHouse() {
		super.housesVisited++;
		super.candyCollected += 10;
		return "Ten candy for Gryffindor. Oops! Wrong movie.";
	}

	@Override
	public String toString() {

		return "Belle";
	}

}
