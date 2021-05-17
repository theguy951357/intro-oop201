package edu.unca.csci201;

public class PhilosophyStudent extends Student {

	int thoughts;

	public PhilosophyStudent(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay,
			int classesMissedThisWeek, int thoughts) {
		super(name, hoursOfSleep, hoursSpentStudying, mealsPerDay, classesMissedThisWeek);
		this.thoughts = thoughts;
	}

	public int getThoughts() {
		return thoughts;
	}

	public void study() {

		super.study();

		thoughts--;
	}

	public void think() {

		System.out.println("Hmm");
		thoughts++;

	}

}
