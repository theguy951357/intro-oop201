import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyName {

	public static void main(String[] args) throws IOException {
		// TODO creates my initials
		
		FileWriter fw = new FileWriter("MyName.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		
		myOutput.println("  CCC     SSS    BBB ");
		myOutput.println(" C   C   S   S   B  B");
		myOutput.println("C         S      B  B");
		myOutput.println("C          S     BBB ");
		myOutput.println("C           S    B  B");
		myOutput.println(" C   C   S   S   B  B");
		myOutput.println("  CCC     SSS    BBB ");
		
		System.out.println("outputted to MyName.txt");
		myOutput.close();

	}

}
