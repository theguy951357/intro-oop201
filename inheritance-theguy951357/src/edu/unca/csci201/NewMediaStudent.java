package edu.unca.csci201;

public class NewMediaStudent extends Student {

	int animationsCreated;
	double percentInteractivity;

	public NewMediaStudent(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay,
			int classesMissedThisWeek, int animationsCreated, double percentInteractivity) {

		super(name, hoursOfSleep, hoursSpentStudying, mealsPerDay, classesMissedThisWeek);
		this.animationsCreated = animationsCreated;
		this.percentInteractivity = percentInteractivity;
	}

	public int getAnimationsCreated() {
		return animationsCreated;
	}

	public double getPercentInteractivity() {
		return percentInteractivity;
	}

	public void study() {

		super.study();

		percentInteractivity /= .9;

	}

	public void createAnimation() {

		animationsCreated++;
		percentInteractivity *= .9;
		hoursOfSleep -= 2;

		System.out.println("Animation created. Initiating sleep...");

		System.out.println();

		System.out.println("ERROR, sleep not found. Alternative found: Caffeine");

	}

}
