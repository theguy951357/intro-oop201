package edu.unca.csci201;

public class VenusFlyTrap extends Plant implements Carnivore {

	@Override
	public void eatAnimal(Animal meal) {
		this.weight += meal.eatenBy(this);

	}

}
