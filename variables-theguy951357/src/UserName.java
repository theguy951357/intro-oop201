import java.util.Random;
import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {

		// asks for a user name and offers a new username with a random number after it
		// because the other one is taken

		Random rand = new Random();

		Scanner scan = new Scanner(System.in);

		System.out.print("What would you like for a username? ");

		String username = scan.nextLine();

		System.out.println(
				"Um, it\'s 2020. that username isn\'t available. How about " + username + (rand.nextInt(1000) + 1));

	}

}
