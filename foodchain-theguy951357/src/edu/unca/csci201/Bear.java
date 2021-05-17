package edu.unca.csci201;

public class Bear extends Animal implements Carnivore, Herbivore {

	@Override
	public void eatAnimal(Animal meal) {
		this.weight += meal.eatenBy(this);

	}

	@Override
	public String makeANoise() {
		// TODO Auto-generated method stub
		return "roar";
	}

	@Override
	public void eatPlant(Plant meal) {
		this.weight += meal.eatenBy(this);

	}

}
