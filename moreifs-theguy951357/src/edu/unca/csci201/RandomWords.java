package edu.unca.csci201;

import java.util.Random;

public class RandomWords implements DataFilter {

	Random rand = new Random();
	
	@Override
	public boolean shouldBePrinted(String a) {

		// picks a number between 1 and 10, if greater than 7 return true
	
		return rand.nextInt(10) + 1 > 7;
	}

}
