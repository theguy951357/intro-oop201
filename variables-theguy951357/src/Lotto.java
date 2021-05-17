import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		// makes random lotto numbers.

		Random rando = new Random();

		System.out.println((rando.nextInt(71) + 1) + "," + (rando.nextInt(71) + 1) + "," + (rando.nextInt(71) + 1) + ","
				+ (rando.nextInt(71) + 1) + "," + (rando.nextInt(71) + 1) + "," + (rando.nextInt(71) + 1));

	}

}
