import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FanFicMaker {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the name of this file? ");
		String fileName = scan.nextLine();

		System.out.println("What is your name? ");
		String user = scan.nextLine();

		FileWriter fw = new FileWriter(fileName + ".txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);

		Scanner scanFile = new Scanner(new FileReader("FanFicBase.txt"));

		String fanFic = scanFile.nextLine().replace("\t", "\r\n").replace("FANFIC", user);

		myOutput.println(fanFic);

		System.out.println("printed to file named " + fileName);

		myOutput.close();

	}

}
