package edu.unca.csci201;

import java.util.Random;

public class TuppenceABag {

	public static void main(String[] args) {

		System.out.println("Feed the birds ...");
		
		Random rand = new Random();
		
		BirdFeeder theFeeder = new BirdFeeder();
		
		int numberOfSeeds = rand.nextInt(75) + 25;
		
		theFeeder.fillUp(numberOfSeeds);
		
		Bird [] birds = new Bird[10];
		for (int i = 0; i < birds.length; i ++ )
			birds[i] = new Bird();
		
		
		while(theFeeder.getAmountOfSeeds() > 0) {
		
			Bird whichBirdEats = birds[rand.nextInt(birds.length)];
			
			int seedsToEat = rand.nextInt(10);
			
			theFeeder.feedABird(whichBirdEats, seedsToEat);
			
		}
		
		System.out.println("Lots of eating going on here...");
		System.out.println();
		for (int i = 0; i < birds.length; i ++ )		
			System.out.println("Bird "+ (i+1)  +" ate: " + birds[i].getAmountOfSeedsEaten());
		System.out.println();
		System.out.println("Seeds left in the birdfeeder: " + theFeeder.getAmountOfSeeds());
	}

}
