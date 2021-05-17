import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Bowtie {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("Bowtie.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		/*System.out.println("*********");
		System.out.println(" ******* ");
		System.out.println("  *****  ");
		System.out.println("   ***   ");
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");*/
		
//		makes a bowtie.
		
		
		
		int numStars = 1000;
		
		String bowtie = "\u29D3";
		
		
		for(int i = numStars; i>0; i-=2) {
			
			String line = "";
			
			for(int j = numStars-i; j>0; j-=2) {
				line += " ";
			}
			
			for(int k = i; k>0; k--) {
				line += bowtie;
			}
			myOutput.println(line);
		}
		
		
		int number;
		if(numStars%2 == 0) {
			number=4;
		}else {
			number=3;
		}
		
		for(int l=number; l <= numStars; l+=2) {
			String line = "";
			
			for(int m = numStars-l; m>0; m-=2) {
				line+=" ";
			}
			
			for(int n = l; n >0; n--) {
			
			line += bowtie;
			}
			
			myOutput.println(line);
		}
		
		System.out.println("Printed to bowtie.txt");
		myOutput.close();

	}

}
