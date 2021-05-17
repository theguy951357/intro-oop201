package edu.unca.csci201;

public class HistoryStudent extends Student {

	String title;

	public HistoryStudent(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay,
			int classesMissedThisWeek) {
		super(name, hoursOfSleep, hoursSpentStudying, mealsPerDay, classesMissedThisWeek);

	}

	public void studyHistory(String title) {
		super.study();

		this.title = title;

		System.out.println("I'll think of something later. I have to go to work.");

	}

}
