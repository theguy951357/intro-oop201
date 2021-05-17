package edu.unca.csci201;

public class Foodchain {

	public static void main(String[] args) {
		Grass grass = new Grass();

		Deer deer = new Deer();

		Wolf wolf = new Wolf();

		Bear bear = new Bear();
		Bear alsoBear = new Bear();

		Bug bug = new Bug();

		VenusFlyTrap flyTrap = new VenusFlyTrap();

		grass.grow();
		grass.grow();
		deer.eatPlant(grass);

		bear.eatAnimal(deer);
		wolf.eatAnimal(bear);
		wolf.eatAnimal(alsoBear);
		flyTrap.eatAnimal(wolf);
		deer.eatPlant(flyTrap);

		printWeight(grass);
		printWeight(deer);
		printWeight(bear);
		printWeight(alsoBear);
		printWeight(wolf);
		printWeight(bug);
		printWeight(flyTrap);

		System.out.println(deer.makeANoise());
		System.out.println(wolf.makeANoise());
		System.out.println(bear.makeANoise());

	}

	public static void printWeight(Organism x) {
		System.out.println(x.weight);
	}

}
