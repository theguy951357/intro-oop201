import java.util.Random;
import java.util.Scanner;

public class ZombieCalc {

	public static void main(String[] args) {

		// takes input from the user and outputs an analysis of the zombie outbreak to
		// send to the gubment.

		Scanner scan = new Scanner(System.in);

		Random rand = new Random();

		System.out.print("Enter the population outbreak before infection: ");
		int pop = scan.nextInt();

		System.out.print("Enter the minimum expected survivors: ");
		int survivors = scan.nextInt();

		System.out.print("Enter the average estimated shotgun blasts needed to kill 1 zombie: ");
		double blast = scan.nextDouble();

		System.out.print("Enter the number of zombies each survivor can kill each day: ");
		int kill = scan.nextInt();

		int totalZombies = pop - (rand.nextInt((5 * survivors) - survivors + 1) + survivors);

		int totalSurvivors = pop - totalZombies;

		int numDays = totalZombies / (totalSurvivors * kill);

		int lbsFood = numDays * totalSurvivors * 4;

		int water = numDays * totalSurvivors;

		double shotgun = 1.1 * totalSurvivors;

		double shells = totalZombies * blast;

		String analysis = "******ANALYSIS******\r\n" + "Population:\r\n" + "Total number of zombies: " + totalZombies
				+ "\r\n" + "Total number of survivors: " + totalSurvivors + "\r\n\r\n" + "Supplies: \r\n"
				+ "Number of days til it\'s over: " + numDays + "\r\n" + "Lbs of food needed: " + lbsFood + "\r\n"
				+ "Gallons of water needed: " + water + "\r\n" + "Amount of shotguns needed: " + shotgun + "\r\n"
				+ "Amount of shotgun shells needed: " + shells;

		System.out.println(analysis);

	}

}
