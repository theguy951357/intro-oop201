import java.util.Scanner;

public class GoogleQuery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("what would you like to search for? ");

		String query = scan.nextLine();

		String search = "https://www.google.com/?q=" + query.replace("+", "%2B").replace(" ", "+").replace("\"", "%22");

		System.out.println(search);
	}

}
