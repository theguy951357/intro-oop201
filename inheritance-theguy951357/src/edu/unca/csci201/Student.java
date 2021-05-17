package edu.unca.csci201;

public class Student {

	int hoursOfSleep;
	int hoursSpentStudying;
	int mealsPerDay;
	int classesMissedThisWeek;
	String name;

	public Student(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay, int classesMissedThisWeek) {

		this.name = name;
		this.hoursOfSleep = hoursOfSleep;
		this.hoursSpentStudying = hoursSpentStudying;
		this.mealsPerDay = mealsPerDay;
		this.classesMissedThisWeek = classesMissedThisWeek;

	}

	public String getName() {
		return name;
	}

	public int getHoursOfSleep() {
		return hoursOfSleep;
	}

	public int getHoursSpentStudying() {
		return hoursSpentStudying;
	}

	public int getMealsPerDay() {
		return mealsPerDay;
	}

	public int getClassesMissedThisWeek() {
		return classesMissedThisWeek;
	}

	public void study() {

		hoursSpentStudying++;
		hoursOfSleep--;

	}

	public void feed() {
		mealsPerDay++;
	}

}
