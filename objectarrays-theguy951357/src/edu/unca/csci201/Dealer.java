package edu.unca.csci201;

import java.util.Random;

public class Dealer {

	public static void main(String[] args) {

		Card[] cards = new Card[10];
		Random rand = new Random();

		for (int i = 0; i < cards.length; i++) {

			cards[i] = new Card();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(cards[rand.nextInt(cards.length)].toString());
		}

	}

}
