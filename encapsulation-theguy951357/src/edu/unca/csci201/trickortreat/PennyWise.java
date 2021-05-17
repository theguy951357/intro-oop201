package edu.unca.csci201.trickortreat;

public class PennyWise extends TrickOrTreater {

	public String visitHouse() {
		super.housesVisited++;
		super.candyCollected += 20;
		return "We all float down here.";
	}

	@Override
	public String toString() {

		return "Creepy clown dude";
	}

}
