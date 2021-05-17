package edu.unca.csci201;

import java.util.Random;

public abstract class Robot {

	protected static int percent = 100;
	protected static int version = 1;
	protected static int age = 0;
	protected Random rand = new Random();

	public Robot(int percent, int version, int age) {
		this.percent = percent;
		this.version = version;
		this.age = age;
	}

	public void charge() {
		percent = 100;
	}

	public void upgrade() {
		this.age++;
		this.version++;
	}

	abstract void work();

	public static int getPercent() {
		return percent;
	}

	public static int getVersion() {
		return version;
	}

	public static int getAge() {
		return age;
	}

}
