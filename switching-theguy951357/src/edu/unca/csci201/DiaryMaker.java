package edu.unca.csci201;

import java.util.Calendar;
import java.util.Random;

public class DiaryMaker {

	public static void main(String[] args) {

		Diary myDiary = new Diary();

		Calendar cal = Calendar.getInstance();
		Random rand = new Random();

		int month = rand.nextInt(12) + 1;

		cal.add(Calendar.MONTH, month);

		for (int i = 0; i < 10; i++) {

			myDiary.addEntry(cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), getNextEntry());
			cal.add(Calendar.DAY_OF_MONTH, rand.nextInt(12) + 1);
		}

		System.out.println("MY SECRET DIARY");
		System.out.println();

		for (int i = 0; i < 10; i++) {

			System.out.println(convertEntry(myDiary.getDiaryEntry(i)));

			System.out.println();
			System.out.println();

		}
	}

	private static String[] entriesList = { "Ditto", "Same", "Same as yesterday", "Not much today", "Not much today",
			"Not much today", "Not much today", "As usual", "Took a walk.  It was nice",
			"Took a walk.  Saw a bird.  It was nice", "Took a walk.  It was nice",
			"Took a walk.  Built a snowman.  It was nice",
			"Alas! I thought to pass today with my dear family.  Have been asked to dine by Fielding; but would rather, faunte de mieux, pass the day with the Granards, wo are the oldest acquantances I have here, and old recollections have always something domestic about them.  Resolved to invite myself to dinner there, and called, but Lord G. anticipated me by asking me himself.  Told him, however, my intentions.  Lady Charlotte and Fitzgerald at dinner, and Lady Rancliffe.  Went to Mrs. Giffard's in the evening, and heard Blanzini and his wife sing some very pretty things.  Mrs. Fitzherbert too, who I thought had cut me, gave me a very kind greeting." };

	private static int lastEntry;

	public static String getNextEntry() {

		Random rand = new Random();

		int entryNum = (lastEntry + rand.nextInt(entriesList.length / 2)) % entriesList.length;

		lastEntry = entryNum;

		return entriesList[entryNum];

	}

	public static String convertEntry(DiaryEntry entry) {

		String date = "";

		switch (entry.getMonth()) {
		case 1:
			date += "January ";
			break;
		case 2:
			date += "February ";
			break;
		case 3:
			date += "March ";
			break;
		case 4:
			date += "April ";
			break;
		case 5:
			date += "May ";
			break;
		case 6:
			date += "June ";
			break;
		case 7:
			date += "July ";
			break;
		case 8:
			date += "August ";
			break;
		case 9:
			date += "September ";
			break;
		case 10:
			date += "October ";
			break;
		case 11:
			date += "November ";
			break;
		case 12:
			date += "December ";
			break;
		default:
			return "janruarchilayjujugutemberberberber";

		}

		switch (entry.getDay()) {
		case 1:
			date += entry.getDay() + "st " + "  : ";
			break;
		case 21:
			date += entry.getDay() + "st " + "  : ";
			break;
		case 31:
			date += entry.getDay() + "st " + "  : ";
			break;
		case 2:
			date += entry.getDay() + "nd " + "  : ";
			break;
		case 22:
			date += entry.getDay() + "nd " + "  : ";
			break;
		case 3:
			date += entry.getDay() + "rd " + "  : ";
			break;
		case 23:
			date += entry.getDay() + "rd " + "  : ";
			break;
		default:
			date += entry.getDay() + "th " + "  : ";
			break;

		}

		date += entry.getEntry();

		return date;

	}

}
