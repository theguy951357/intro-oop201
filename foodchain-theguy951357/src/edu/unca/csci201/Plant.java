package edu.unca.csci201;

public abstract class Plant extends Organism {
	
	public double eatenBy(Herbivore h) {
		
		double returnAmount = weight * 0.8;
		
		weight = 0;
		
		return returnAmount;
	}
	
}
