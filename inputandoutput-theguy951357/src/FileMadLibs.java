import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMadLibs {
	
	public static void main(String[] args) throws IOException {
		// prints the madlibs tto the txt file.
		
		FileWriter fw = new FileWriter("FileMadLibs.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		
		
		FileReader mad = new FileReader("MadLibsWords.txt");
		
		Scanner scan = new Scanner(mad);
		
		String one = scan.nextLine();
		
		
		String two = scan.nextLine();
		
		
		String three = scan.nextLine();
		
		
		String four = scan.nextLine();
		
		
		String five = scan.nextLine();
		
		
		String six = scan.nextLine();
		
		
		String seven = scan.nextLine();
		
		
		String eight = scan.nextLine();
		
		
		String nine = scan.nextLine();
		
		
		String ten = scan.nextLine();
		
		
		String eleven = scan.nextLine();
		
		
		String twelve = scan.nextLine();
		
		
		String thirteen = scan.nextLine();
		
		
		String fourteen = scan.nextLine();
		
		
		String fifteen = scan.nextLine();
		
		
		String sixteen = scan.nextLine();
		
		
		String seventeen = scan.nextLine();
		
		
		String eighteen = scan.nextLine();
		
		myOutput.println("But " + one + " ! What light through yonder " + two + " breaks?\r\n" + 
				"It is the East, and Juliet is the " + three + " !\r\n" + 
				"Arise, fair " + three + ", and " + four + " the envious moon,\r\n" + 
				"Who is already sick and " + five + " with grief\r\n" + 
				"That thou her " + six + " art far more fair than she.\r\n" + 
				"Be not her "+ six +" , since she is envious.\r\n" + 
				"Her vestal livery is but sick and green,\r\n" + 
				"And none but fools do "+ seven +" it. Cast it off.\r\n" + 
				"It is my lady; O, it is my "+ eight +" !\r\n" + 
				"O that she knew she were!\r\n" + 
				"She "+ nine +" , yet she says nothing. What of that?\r\n" + 
				"Her "+ ten +" discourses; I will answer it.\r\n" + 
				"I am too "+ eleven +" ; `tis not to me she "+ nine +" .\r\n" + 
				"Two of the fairest stars in all the "+ twelve +" ,\r\n" + 
				"Having some business, do entreat her "+ ten +"         \r\n" + 
				"To "+ thirteen +" in their "+ fourteen +" till they return.\r\n" + 
				"What if her "+ ten +" were there, they in her head?\r\n" + 
				"The "+ fifteen +" of her cheek would shame those stars\r\n" + 
				"As daylight doth a lamp; her "+ ten +" in "+ twelve +"         \r\n" + 
				"Would through the airy "+ sixteen +" stream so bright\r\n" + 
				"That "+ seventeen +" would sing and think it were not night.\r\n" + 
				"See how she leans her cheek upon her "+ eighteen +" !\r\n" + 
				"O that I were a glove upon that "+ eighteen +" ,\r\n" + 
				"That I might touch that cheek!");
			System.out.println("printed to FileMadLibs.txt");
		
		myOutput.close();

	}


}
