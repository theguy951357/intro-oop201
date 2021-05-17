package edu.unca.csci201;

public class TaxiRobot extends Robot implements NavigationSystem, AttitudeCircuit {

	private Car car;
	private String[] navigate = { "turn left", "turn right", "go straight" };
	private String directions;
	private static int aggression = 10;
	private String agro;

	public TaxiRobot() {
		super(percent, version, age);
		this.car = new Car(10, 100, "shitbox");
	}

	@Override
	void work() {
		navigateTo("asheville");
		while (1 == 1) {
			communicate();
		}

	}

	@Override
	public String communicate() {
		aggression--;
		switch (this.aggression) {

		case 10:
		case 9:
		case 8:
		case 7:

			agro += "no Problem";
			break;
		case 6:
		case 5:
		case 4:
		case 3:
			agro += "slightly frustrated no problem";
			break;
		case 2:
			agro += "even more slightly frustrated no problem";
			break;
		case 1:
			agro += "AAAAAAAAAAAAAAAAAAAAAa";
			break;

		}

		return agro;

	}

	@Override
	public String navigateTo(String place) {

		for (int i = 0; i > rand.nextInt(100); i++) {
			directions += navigate[rand.nextInt(navigate.length)];
		}
		return directions;
	}

}
