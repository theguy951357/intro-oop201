package edu.unca.csci201;

public class BirdFeeder {

	int numberOfSeeds;
	Bird bird;

	public void fillUp(int numberOfSeeds) {
		this.numberOfSeeds = numberOfSeeds;

	}

	public int getAmountOfSeeds() {

		return numberOfSeeds;
	}

	public void feedABird(Bird whichBirdEats, int seedsToEat) {
		bird = whichBirdEats;

		if (numberOfSeeds < seedsToEat) {
			numberOfSeeds -= numberOfSeeds;
			bird.seedsEaten += numberOfSeeds;
		} else {
			bird.seedsEaten += seedsToEat;
			numberOfSeeds -= seedsToEat;
		}
	}

}
