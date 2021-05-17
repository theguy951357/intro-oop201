package edu.unca.csci201;

public class Deer extends Animal implements Herbivore {

	@Override
	public void eatPlant(Plant meal) {
		this.weight += meal.eatenBy(this);

	}

	@Override
	public String makeANoise() {
		// TODO Auto-generated method stub
		return "deer noise";
	}

}
