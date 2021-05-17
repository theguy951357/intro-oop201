package edu.unca.csci201;

public class VowelsFilter implements DataFilter {

	private int vowelCount;
	private int i;
	private String vowels = "aeiouAEIOU";
	private String letter;

	@Override
	public boolean shouldBePrinted(String a) {
		vowelCount = 0;
		i = 0;

		while (i < a.length()) {
			letter = a.substring(i, i + 1);
			if (vowels.contains(letter)) {
				vowelCount++;
			}
			i++;
		}
		return vowelCount > (a.length() / 2);
	}

}
