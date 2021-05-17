package edu.unca.csci201;

public class MainActivity {

	public static void main(String[] args) {
		MinerRobot miner = new MinerRobot();
		ReasercherRobot rr = new ReasercherRobot();

		for (int i = 0; i < 10; i++) {
			miner.work();
		}

		System.out.println(miner.getOre());

	}

}
