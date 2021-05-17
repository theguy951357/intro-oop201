package edu.unca.csci201;

public class Wolf extends Animal implements Carnivore {

	@Override
	public void eatAnimal(Animal meal) {
		this.weight += meal.eatenBy(this);

	}

	@Override
	public String makeANoise() {
		// TODO Auto-generated method stub
		return "howl";
	}

}
