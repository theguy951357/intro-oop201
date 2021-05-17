package edu.unca.csci201.trickortreat;

public abstract class TrickOrTreater {

	protected int housesVisited;
	protected int candyCollected;

	public abstract String visitHouse();

	public String toString() {
		return "TrickOrTreater";
	}

	public int getHousesVisited() {
		return housesVisited;
	}

	public void setHousesVisited(int housesVisited) {
		if (housesVisited < 0) {
			this.housesVisited = 0;
		} else {
			this.housesVisited = housesVisited;
		}
	}

	public int getCandyCollected() {
		return candyCollected;
	}

	public void setCandyCollected(int candyCollected) {
		if (candyCollected < 0) {
			this.candyCollected = 0;
		} else {
			this.candyCollected = candyCollected;
		}
	}

}
