package edu.unca.csci201;

public class Diary {

	private DiaryEntry[] entries = new DiaryEntry[10];
	private int lastEntry = 0;

	public void addEntry(int month, int day, String entry) {
		entries[lastEntry] = new DiaryEntry(month, day, entry);
		lastEntry++;
	}

	public String getEntry(int i) {
		return entries[i].getDate() + entries[i].getEntry();
	}

	public DiaryEntry getDiaryEntry(int i) {
		return entries[i];
	}
}
