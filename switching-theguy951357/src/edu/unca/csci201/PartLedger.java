package edu.unca.csci201;

import java.util.Scanner;

public class PartLedger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("give me a part number please: ");
		if (scan.hasNextInt()) {
			switch (scan.nextInt()) {
			case 0:
				System.out.println("Sprocket");
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Cam Lobe");
				break;
			case 6:
				System.out.println("Small Valve");
				break;
			case 7:
				System.out.println("Large Valve");
				break;
			case 8:
				System.out.println("Sump");
				break;
			case 9:
				System.out.println("Connecting Rod");
				break;
			case 10:
				System.out.println("Crank Shaft");
				break;
			case 11:
				System.out.println("Shaft");
				break;
			case 12:
				System.out.println("Piston");
				break;
			case 13:
				System.out.println("Manifold");
				break;
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				System.out.println("Gasket(assorted)");
				break;
			default:
				System.out.println("Spare");
			}

		}

	}

}
