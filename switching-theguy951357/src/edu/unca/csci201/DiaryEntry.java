package edu.unca.csci201;

public class DiaryEntry {

	private int month;
	private int day;
	private String entry;
	
	public DiaryEntry(int month, int day, String entry) {
		super();
		this.month = month;
		this.day = day;
		this.entry = entry;
	}

	public String getDate() {
		return month + " - " + day + "  : ";
		
	}
	
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getEntry() {
		return entry;
	}

	
}
