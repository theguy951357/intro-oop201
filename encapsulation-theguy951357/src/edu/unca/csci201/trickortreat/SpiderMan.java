package edu.unca.csci201.trickortreat;

public class SpiderMan extends TrickOrTreater {

	public String visitHouse() {
		super.housesVisited++;
		super.candyCollected++;
		return "everybody gets one.";
	}

	@Override
	public String toString() {

		return "The kid in the spidy suit";
	}

}
