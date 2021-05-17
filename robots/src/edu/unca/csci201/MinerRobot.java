package edu.unca.csci201;

public class MinerRobot extends Robot implements DrillArm, OreScanner, OreContainer {

	private int ore = 0;

	private int container = 500;

	public MinerRobot() {
		super(percent, version, age);

	}

	public int drill() {

		return rand.nextInt(100);
	}

	public int scan() {
		return rand.nextInt(100);
	}

	public void empty() {
		ore = 0;
	}

	@Override
	void work() {
		if (this.ore == this.container) {
			empty();
		}
		addOre(drill());

	}

	public int getOre() {
		return ore;
	}

	@Override
	public void addOre(int ore) {
		if (this.ore + ore > container) {
			this.ore = container;
		} else {
			this.ore += ore;
		}

	}

}
