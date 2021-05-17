package edu.unca.csci201;

public abstract class Animal extends Organism {
	
	public double eatenBy(Carnivore predator) {
		
		double returnAmount = weight * 0.45;
		
		weight = 0;
		
		return returnAmount;
	}
	
	public abstract String makeANoise();
}
