package edu.unca.csci201;

import java.util.Random;

import edu.unca.csci201.trickortreat.Belle;
import edu.unca.csci201.trickortreat.PennyWise;
import edu.unca.csci201.trickortreat.SpiderMan;
import edu.unca.csci201.trickortreat.TrickOrTreater;

public class Halloween {

	public static void main(String[] args) {

		TrickOrTreater belle = new Belle();
		TrickOrTreater spiderMan = new SpiderMan();
		TrickOrTreater pennyWise = new PennyWise();

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(4);

			if (r == 0) {
				System.out.println(belle.visitHouse());
			} else if (r == 1) {
				System.out.println(spiderMan.visitHouse());
			} else if (r == 2) {
				System.out.println(pennyWise.visitHouse());
			} else {
				System.out.println("Bullies encountered! Candy lost!");

				belle.setCandyCollected(belle.getCandyCollected() - 1);
				spiderMan.setCandyCollected(spiderMan.getCandyCollected() - 1);
				pennyWise.setCandyCollected(pennyWise.getCandyCollected() - 1);
			}
		}

		System.out.println("Total candy haul this year: ");

		System.out.println(belle + " : " + belle.getCandyCollected() + " candy collected from "
				+ belle.getHousesVisited() + " houses.");
		System.out.println(spiderMan + " : " + spiderMan.getCandyCollected() + " candy collected from "
				+ spiderMan.getHousesVisited() + " houses.");
		System.out.println(pennyWise + " : " + pennyWise.getCandyCollected() + " candy collected from "
				+ pennyWise.getHousesVisited() + " houses.");

	}
}
