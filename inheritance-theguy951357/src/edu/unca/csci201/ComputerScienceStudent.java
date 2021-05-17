package edu.unca.csci201;

import java.util.Random;

public class ComputerScienceStudent extends Student {

	String favoriteProgrammingLanguage;

	public ComputerScienceStudent(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay,
			int classesMissedThisWeek, String favoriteProgrammingLanguage) {

		super(name, hoursOfSleep, hoursSpentStudying, mealsPerDay, classesMissedThisWeek);
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}

	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}

	public void workOnProgrammingProject() {

		System.out.println("It's time to write a program in " + favoriteProgrammingLanguage);

		Random rand = new Random();

		int num = rand.nextInt(20);
		for (int i = 0; i < num; i++) {
			System.out.print("type ");
		}
		System.out.println();

		System.out.println("UGH! I HATE THIS IT DOESN'T WORK!");

		num = rand.nextInt(10);
		for (int i = 0; i < num; i++) {
			System.out.print("type ");
		}
		System.out.println();

		System.out.println("OMG IT COMPILES! SUBMIT IT!");

		classesMissedThisWeek++;
	}

}
