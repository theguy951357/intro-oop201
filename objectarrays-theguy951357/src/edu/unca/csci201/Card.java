package edu.unca.csci201;

import java.util.Random;

public class Card {
	private String suit;
	private int value;
	private Random rand = new Random();
	private String number;

	public Card() {
		switch (rand.nextInt(3)) {
		case 0:
			suit = "Spades";
			break;
		case 1:
			suit = "Hearts";
			break;
		case 2:
			suit = "Diamonds";
			break;
		case 3:
			suit = "Clubs";
			break;
		}

		value = rand.nextInt(13) + 1;
	}

	@Override
	public String toString() {
		switch (value) {
		case 1:
			number = "Ace of ";
			break;
		case 11:
			number = "Jack of ";
			break;
		case 12:
			number = "Queen of ";
			break;
		case 13:
			number = "King of ";
			break;
		default:
			number = value + " of ";
		}

		return number + suit;
	}

}
