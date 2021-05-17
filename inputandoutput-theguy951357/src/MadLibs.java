import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) throws IOException {
		// prints the madlibs tto the txt file.
		
		FileWriter fw = new FileWriter("MadLibs.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter an adjective: ");
		String one = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String two = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String three = scan.nextLine();
		
		System.out.print("enter a verb: ");
		String four = scan.nextLine();
		
		System.out.print("enter an adjective: ");
		String five = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String six = scan.nextLine();
		
		System.out.print("enter a verb: ");
		String seven = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String eight = scan.nextLine();
		
		System.out.print("enter a verb ending in 's': ");
		String nine = scan.nextLine();
		
		System.out.print("enter a body part (plural): ");
		String ten = scan.nextLine();
		
		System.out.print("enter an adjective: ");
		String eleven = scan.nextLine();
		
		System.out.print("enter a place: ");
		String twelve = scan.nextLine();
		
		System.out.print("enter a verb: ");
		String thirteen = scan.nextLine();
		
		System.out.print("enter a shape (plural): ");
		String fourteen = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String fifteen = scan.nextLine();
		
		System.out.print("enter a noun: ");
		String sixteen = scan.nextLine();
		
		System.out.print("enter an animal (plural): ");
		String seventeen = scan.nextLine();
		
		System.out.print("enter a noun: ");
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
			System.out.println("printed to MadLibs.txt");
		
		myOutput.close();

	}

}
