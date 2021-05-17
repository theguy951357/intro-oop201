package edu.unca.csci201;

public class ReasercherRobot extends Robot implements ScienceModule, PaperPrinter, ControlSprocket {

	private int thing;

	public ReasercherRobot() {
		super(percent, version, age);

	}

	@Override
	void work() {
		if (rand.nextInt(10) == 6) {
			research();
		}

	}

	@Override
	public void motivateGradStudent() {

		System.out.println("I'm taking away your funding if you don't do the robots work!!!");
	}

	@Override
	public void writePaper() {
		System.out.println("New spiderman game. nice!");

	}

	@Override
	public void research() {
		// TODO Auto-generated method stub
		System.out.println("a sciency string!");
	}

}
