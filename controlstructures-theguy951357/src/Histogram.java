import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		// crates a histogram based off of a read file

		Scanner buck = new Scanner(System.in);
		double max = 0;
		String file = "histogram4.txt";
		Scanner scan = new Scanner(new FileReader(file));

		while (scan.hasNext()) {
			int num = scan.nextInt();
			if (num > max) {
				max = num;
			}
		}

		System.out.print("how many buckets would you like? ");

		int[] histogram = new int[buck.nextInt()];
		// int bucketMin = 0;
		// int bucketMax;

		double bucket = max / histogram.length;

		scan = new Scanner(new FileReader(file));

		while (scan.hasNext()) {
			int num = scan.nextInt();

			int index = (int) ((num - 1) / bucket);
			histogram[index]++;
		}

//		for (int i = 0; i < 10; i++) {
//
//			Scanner scan = new Scanner(new FileReader("histogram3.txt"));
//			bucketMin = i * 10;
//			bucketMax = bucketMin + 10;
//			int count = 0;
//			while (scan.hasNext()) {
////				String hist = "";
////				for (int i = scan.nextInt(); i > 0; i--) {
////					hist += "*";
////				}
////				System.out.println(hist);
//
//				int num = scan.nextInt();
//				if (num <= bucketMax && num > bucketMin) {
//					count++;
//				}
//
//				histogram[i] = count;
//			}
//		}

		String hist;

		for (int j : histogram) {
			hist = "";
			for (int k = j; k > 0; k--) {
				hist += "*";
			}
			System.out.println(hist);
		}

	}

}
