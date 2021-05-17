package edu.unca.csci201;

public class DramaStudent extends Student {

	int playsWorkedOn;
	String currentQuote;

	public DramaStudent(String name, int hoursOfSleep, int hoursSpentStudying, int mealsPerDay,
			int classesMissedThisWeek, int playsWorkedOn, String currentQuote) {
		super(name, hoursOfSleep, hoursSpentStudying, mealsPerDay, classesMissedThisWeek);
		this.playsWorkedOn = playsWorkedOn;
		this.currentQuote = currentQuote;
	}

	public int getPlaysWorkedOn() {
		return playsWorkedOn;
	}

	public String getCurrentQuote() {
		return currentQuote;
	}

	public void study() {

		super.study();
		playsWorkedOn++;

	}

	public void perform() {
		System.out.println(currentQuote);
	}

}
