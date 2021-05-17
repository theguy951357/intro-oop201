package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class CaptchaCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Captcha captcha;
		boolean answer = false;

		System.out.println("We need to find out if your not a robot.");

		do {
			captcha = new Captcha(rand.nextInt(20) + 1, rand.nextInt(20) + 1);
			System.out.println(captcha.getQuestion());
			if (scan.hasNextInt()) {
				answer = captcha.runCheck(scan.nextInt());
			}

		} while (answer == false);

		System.out.println("Welcome to the rest of the program.");

	}

}
