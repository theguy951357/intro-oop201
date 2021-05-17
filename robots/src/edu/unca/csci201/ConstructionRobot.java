package edu.unca.csci201;

public class ConstructionRobot extends Robot implements HammerArm, SawZawTM {

	private int loadCapacity = 500;
	private String statement;

	public ConstructionRobot() {
		super(percent, version, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void work() {
		statement = "grunt bang bang grunt grunt bang" + hammer();

	}

	@Override
	public String hammer() {

		return "cant touch this";
	}

	public String getStatement() {
		return statement;
	}

}
