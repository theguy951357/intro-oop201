package edu.unca.csci201;

public class GradeStudents {

	public static String grade(Student student) {

		double value = (1.0 - (student.getClassesMissedThisWeek() / 9.0)) * (student.getHoursSpentStudying() / 3.0)
				* (student.getHoursOfSleep() / 8.0);

		if (value > .9)
			return "A";
		if (value > .8)
			return "B";
		if (value > .7)
			return "C";
		if (value > .6)
			return "D";

		return "F";

	}

	public static void printSleep(Student student) {
		System.out.println(student.getName() + " has gotten " + student.hoursOfSleep + " sleeps");
	}

	public static void pizzaParty(Student student) {
		student.feed();
		System.out.println("a festive message of pizza for " + student.getName());
	}

	public static void main(String[] args) {

		ComputerScienceStudent chris = new ComputerScienceStudent("Chris", 8, 2, 2, 1, "Java");
		ComputerScienceStudent sam = new ComputerScienceStudent("Sam", 9, 3, 3, 0, "D");

		NewMediaStudent jamie = new NewMediaStudent("Jamie", 7, 4, 3, 0, 1, .5);

		DramaStudent quinn = new DramaStudent("Quinn", 10, 8, 3, 1, 4,
				"Be not afraid of greatness: some are born great, some achieve greatness, and some have greatness thrust upon them.");

		PhilosophyStudent aquaSaturnOnyx = new PhilosophyStudent("Aqua Saturn Onyx", 12, 2, 3, 4, 4);

		HistoryStudent spongebob = new HistoryStudent("Spongebob", 10, 9, 8, 7);

		chris.study();
		sam.study();
		jamie.study();
		quinn.study();
		aquaSaturnOnyx.study();
		sam.study();
		spongebob.study();

		pizzaParty(chris);
		pizzaParty(sam);
		pizzaParty(jamie);
		pizzaParty(quinn);
		pizzaParty(aquaSaturnOnyx);
		pizzaParty(spongebob);

		System.out.println("\nSpongebob");
		spongebob.studyHistory("comic book");

		System.out.println("\nChris:");
		chris.workOnProgrammingProject();

		System.out.println("\nJamie:");
		jamie.createAnimation();

		System.out.println("\nQuinn:");
		quinn.perform();

		System.out.println("\nAqua Saturn Onyx:");
		aquaSaturnOnyx.think();

		System.out.println("\n\nGrades:");
		System.out.println("Chris: " + grade(chris));
		printSleep(chris);
		System.out.println("Sam: " + grade(sam));
		printSleep(sam);
		System.out.println("Jamie: " + grade(jamie));
		printSleep(jamie);
		System.out.println("Quinn: " + grade(quinn));
		printSleep(quinn);
		System.out.println("Aqua Saturn Onyx: " + grade(aquaSaturnOnyx));
		printSleep(aquaSaturnOnyx);
		System.out.println("Spongebob: " + grade(spongebob));
		printSleep(spongebob);

	}

}
